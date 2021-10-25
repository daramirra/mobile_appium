# Проект по автоматизации тестирования мобильного приложения Wikipedia (Android)

## :rocket: Технологии и инструменты
<p  align="center"
   
  <code><img width="5%" title="IntelliJ IDEA" src="images/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="images/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="images/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="images/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="images/gradle-logo.svg "></code>
  <code><img width="5%" title="JUnit5" src="images/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="images/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Allure TestOps" src="images/allure-ee-logo.svg"></code>
  <code><img width="5%" title="Github" src="images/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="images/jenkins-logo.svg"></code>
  <code><img width="5%" title="Jira" src="images/jira-logo.svg"></code>
  <code><img width="5%" title="Telegram" src="images/Telegram.svg"></code>
</p>

>*В данном проекте автотесты написаны на  <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code>.*
>
>*Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
> 
>*<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>  
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*
>   
>*Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>    
>*<code><strong>*Selenoid*</strong></code> используется для запуска браузеров в контейнерах <code><strong>*Docker*</strong></code>.*

### :spiral_notepad: Реализованы проверки по 4 экранам страницы Getting started мобильного приложения Wikipedia

## :computer: Запуск тестов из терминала

 > *Запуск тестов в Browserstack с заполненным browserstack.properties:* 
```bash
gradle clean test -DdeviceHost=browserstack
```
 > *Запуск тестов в Selenoid с заполненным selenoid.properties:* 
```bash
gradle clean test -DdeviceHost=selenoid
```
 > *Запуск тестов в эмуляторе (Appium) с заполненным emulation.properties:*
```bash
gradle clean test -DdeviceHost=emulation
```
 > *Запуск тестов на реальном устройстве (Appium) с заполненным realdevice.properties:*
```bash
gradle clean test -DdeviceHost=real
