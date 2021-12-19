
# README #

### What is the project? ###

The main goal is to demonstrate how to run tests in parallel by using plugins, 
test suite, annotations and junit-platform.properties.xml

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
