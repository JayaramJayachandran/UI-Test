
## Software Requirements
* [Maven](https://maven.apache.org/)

To run the tests on Google Chrome:
* Open a terminal/command prompt and navigate to the root of the tests
* Set a system variable of "webdriver.chrome.driver" to point to the file downloaded above, either permanently or as part of running Maven: `mvn test -Dwebdriver.chrome.driver=path/to/chromedriver`

## Test Automation Framework
Basic automation test framework following action and page object models, using Selenium to interact with the web browser, Cucumber to frame the tests, and JUnit to provide a standard report on the tests. Features built in support for local testing, uses Hamcrest for better reporting on test failures.
