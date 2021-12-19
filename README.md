
# README #


### How to run test suite with maven? ###

`mvn clean test -Dselenide.browser=chrome -Dselenide.startMaximized=true`

### Configuration for UI tests: ###

````
-Dselenide.browser=chrome

-Dselenide.headless=false

-Dselenide.startMaximized=false

-Dselenide.webdriverLogsEnabled=false

-Dselenide.timeout=4000
````
