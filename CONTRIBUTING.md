# Contributing

Instructions for contributing to [plaid-java][1]. A java client library for the [Plaid API][2]. This library is fully generated from the [Plaid OpenAPI spec](3).

This library cannot directly accept PRs from the public as it is generated from internal Plaid sources on the internal Plaid GitHub instance and any changes made directly to this repo will be overwritten. If you submit a PR and it is accepted, a member of Plaid engineering will copy and paste your change into the upstream, internal version of this repo rather than merging your PR. 

Plaid employees should make any changes on the internal Plaid GitHub and not on the public repo. 

## Setup

If you find an issue, please investigate whether it is a type problem with [OpenAPI](3) or a problem with the [java](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/java.md) generator. Then open an issue and Plaid will investigate further.

## Running Tests

1. To build the docker image for the client tests, run `docker build -t plaid-java .`.
2. Go to the [Plaid Dashboard](https://dashboard.plaid.com/) and copy and paste your `client_id` and sandbox `secret` into the following command.
3. Run `docker run --rm -e PLAID_CLIENT_ID=$CLIENT_ID -e PLAID_SECRET=$SECRET plaid-java`.

If you wish to run a single test, edit the `Dockerfile` CMD and add a parmeter like so: `CMD ["mvn", "-Dit.test=IdentityGet*", "-Dmaven.javadoc.skip=true", "verify", "-e"]`

Then rebuild the docker image using the command from step 1.

[1]: https://github.com/plaid/plaid-java
[2]: https://plaid.com
[3]: https://github.com/plaid/plaid-openapi
