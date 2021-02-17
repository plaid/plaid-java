CURRENT_DIR:=$(shell pwd)
OPENAPI_VERSION:=1.5.3-beta
OPENAPI_FILE:=2020-09-14.yml
OPENAPI_FILE_INTERNAL:=2020-09-14-internal.yml
OPENAPI_GENERATOR:=docker run --rm -v $(CURRENT_DIR):/local openapitools/openapi-generator-cli:v5.0.1 generate
JAVA_PACKAGE_VERSION:=$(shell cat pom.xml | grep -m1 "version" | cut -d'>' -f2 | cut -d'<' -f1)

.PHONY: pull-openapi
pull-openapi:
	curl https://raw.githubusercontent.com/plaid/plaid-openapi/$(OPENAPI_VERSION)/$(OPENAPI_FILE) --output $(CURRENT_DIR)/$(OPENAPI_FILE)

.PHONY: build-openapi
build-openapi:
		$(OPENAPI_GENERATOR) -g java \
			-i local/$(OPENAPI_FILE) \
			-o local/ \
			--library=retrofit2 \
			--global-property apiDocs=false,modelDocs=false,apiTests=false,modelTests=false \
			-p artifactId=plaid,apiPackage=com.plaid.client.request,modelPackage=com.plaid.client.model,artifactVersion=$(JAVA_PACKAGE_VERSION) \
			-t local/templates/java \
			--type-mappings=BigDecimal=Double
