##Istruzioni per la compilazione
```
    ./mvnw clean install && ./mvnw -DCI_PROFILE clean install
```

maven-settings.xml

export CODEARTIFACT_DOMAIN_NAME=pn-develop-bootstrap-step-01-domain
export CODEARTIFACT_REPO=pn-develop-bootstrap-step-01-repo
CODEARTIFACT_DOMAIN_FULL=pn-develop-bootstrap-step-01-domain-911845998067.d.codeartifact.eu-central-1.amazonaws.com
export export CODEARTIFACT_AUTH_TOKEN=$( aws codeartifact get-authorization-token --domain $CODEARTIFACT_DOMAIN_NAME --query authorizationToken --output text --profile cicd )