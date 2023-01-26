
# Selenium – WebDriver Wait Commands
![Java](https://img.shields.io/badge/java-%23ED8B.svg?style=for-the-badge)
![Selenium](https://img.shields.io/badge/selenium-%797979.svg?style=for-the-badge)

Read the complete Blog - [Powerful Selenium Wait Commands](https://testingwithsk.in/powerful-selenium-wait-commands/)

In this article, you will learn about the Selenium Wait commands. In Selenium, waits play an important role while executing the tests. Selenium waits make web pages more reliable. It provides different types of wait options that are suitable under favorable conditions. Sometimes web applications take too much time to load the web elements which we want to interact with. And if the element is not located then it will throw an `ElementNotVisibleException`. By using the Selenium Wait command, you can resolve these kinds of load issues.

### Clone the repository using -

```shell
git clone https://github.com/TestingWithSK/selenium-wait-demo.git
```

## Selenium Wait Types
- Implicit Wait
- Explicit Wait
- Fluent Wait
- Sleep Command

### Implicit Wait
Implicit wait tells the web driver to wait for a certain amount of time before throwing an exception i.e. 
`NoSuchElementException`. Once the given time is set, the web driver will wait for that element till that 
time before throwing the given exceptions.  
You can find the [ImplicitWaitTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/ImplicitWaitTest.java) 
class inside `src/test/java/test`.

### Explicit Wait
Explicit wait tells the web driver to wait for certain conditions to be true before throwing an exception 
i.e. `ElementNotVisibleException`. It is important at that time when an element naturally takes some time to 
load. Explicit waits are more intelligent, but you can apply for specific elements. You can apply explicit wait command by using `WebDriverWait` class and after that have to provide the `ExpectedConditions`.  
You can find the [ExplicitWaitTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/ExplicitWaitTest.java)
class inside `src/test/java/test`.

### Fluent Wait
Fluent wait in selenium is used to define the maximum amount of time for the web driver to wait for a 
certain condition, before throwing an exception i.e. `ElementNotVisibleException`. It is useful when an 
element takes a longer time to load.  
You can find the [FluentWaitTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/FluentWaitTest.java)
class inside `src/test/java/test`.

### Sleep Command
Sleep is a static method of the Thread class. The Sleep command is used to halt the execution for the 
given amount of time. It does not care whether the element is found or not on the webpage. It accepts the 
parameter duration as milliseconds. It also throws `InterruptedException`.  
You can find the [SleepTest](https://github.com/TestingWithSK/selenium-wait-demo/blob/master/src/test/java/test/SleepTest.java)
class inside `src/test/java/test`.


### Run the Test Case -

- [x] Right click on any java file inside `src/test/java/test` and select -  `Run '<FILE_NAME>'`

Read the complete Blog - [Powerful Selenium Wait Commands](https://testingwithsk.in/powerful-selenium-wait-commands/)

Happy Testing!!!

---

### Read More Articles
[![Testing Blog](https://img.shields.io/badge/-TestingWithSK-21759B?logo=wordpress&logoColor=white)](https://testingwithsk.in)

### Follow us on Social Media Accounts
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/shubhamkgupta14)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/testingwithsk)
[![Facebook](https://img.shields.io/badge/Facebook-%231877F2.svg?logo=Facebook&logoColor=white)](https://facebook.com/testingwithsk)