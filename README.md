# metricinject project

Zulip question - "Can an injected bean use a gauge?".

Yes.

Instructions:

`mvn compile quarkus:dev`

`curl localhost:8080/metrics/application`

No metrics should have been shown because code path not executed

`curl localhost:8080/metricinject`

Output should be "hello 1"

`curl localhost:8080/metrics/application`

Output should be "application_BeanInvocations 1.0"