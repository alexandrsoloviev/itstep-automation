# itstep-automation
# Test Framework (API, GUI)
Java quickstart project for test automation, UI acceptance and API acceptance testing. Created with lessons learned from a IT courses.

### Tools
* Maven
* Testng
* Webdrivermanager
* Log4j
* Allure
* Rest-assured
* Lombok
* Assertj
* Requirements

### In order to utilise this project you need to have the following installed locally:
Maven 3
Java 1.8

### To run all modules, navigate to terminal and run:
<code>mvn clean test<code>
### To run api modules, navigate to terminal and run:
<code>mvn clean test -Dgroups=api<code>
### To run ui modules, navigate to terminal and run:
<code>mvn clean test -Dgroups=gui<code>
