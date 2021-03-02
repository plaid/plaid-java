CURRENT_DIR:=$(shell pwd)
OPENAPI_VERSION:=1.5.3-beta
OPENAPI_FILE:=2020-09-14.yml
JAVA_OPENAPI_FILE:=tmp.yml
OPENAPI_GENERATOR:=docker run --rm -v $(CURRENT_DIR):/local openapitools/openapi-generator-cli:v5.0.1 generate
JAVA_PACKAGE_VERSION:=$(shell cat pom.xml | grep -m1 "version" | cut -d'>' -f2 | cut -d'<' -f1 | sed -e "s/-SNAPSHOT//")

.PHONY: pull-openapi
pull-openapi:
	curl https://raw.githubusercontent.com/plaid/plaid-openapi/$(OPENAPI_VERSION)/$(OPENAPI_FILE) --output $(CURRENT_DIR)/$(OPENAPI_FILE)

.PHONY: build-openapi
build-openapi:
# java generator doesn't handle additionalProperties properly
# see https://github.com/OpenAPITools/openapi-generator/issues/1466 for more info
		awk '!/additionalProperties: true/' $(OPENAPI_FILE) > $(JAVA_OPENAPI_FILE) && \
		$(OPENAPI_GENERATOR) -g java \
			-i local/$(OPENAPI_FILE) \
			-o local/ \
			--library=retrofit2 \
			--global-property apiDocs=false,modelDocs=false,apiTests=false,modelTests=false \
			-p artifactId=plaid,apiPackage=com.plaid.client.request,modelPackage=com.plaid.client.model,artifactVersion=$(JAVA_PACKAGE_VERSION),dateLibrary=java8 \
			-t local/templates/java \
			--type-mappings=BigDecimal=Double && \
		rm $(JAVA_OPENAPI_FILE)
