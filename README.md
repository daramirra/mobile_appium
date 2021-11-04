# Проект по автоматизации тестирования мобильного приложения Wikipedia (Android)

#### :spiral_notepad: *Реализованы проверки по 4 экранам страницы Getting started мобильного приложения Wikipedia*

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

> *В данном проекте автотесты написаны на  <code><strong>*Java*</strong></code> с использованием фреймворка <code><strong>*Selenide*</strong></code>.*
>
>*Для сборки проекта используется <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> используется как фреймворк для модульного тестирования.*
>
>*Запуск тестов выполняется из <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> используется для запуска браузеров в контейнерах <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> используются для визуализации результатов тестирования.*

## :computer: Запуск тестов из терминала

- [x] *Запуск тестов в Browserstack с заполненным browserstack.properties:*

```bash
gradle clean test -DdeviceHost=browserstack
```

- [x] *Запуск тестов в Selenoid с заполненным selenoid.properties:*

```bash
gradle clean test -DdeviceHost=selenoid
```

- [x] *Запуск тестов в эмуляторе (Appium) с заполненным emulation.properties:*

```bash
gradle clean test -DdeviceHost=emulation
```

- [x] *Запуск тестов на реальном устройстве (Appium) с заполненным realdevice.properties:*

```bash
gradle clean test -DdeviceHost=real
```

- [x] *Сформировать allure отчет:*

```bash
allure serve build/allure-results
```

## <img width="4%" title="Jenkins" src="images/jenkins-logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/C07-daramirra-mobile)

### :pushpin: Параметры сборки

    HOST (default selenoid)
    ALLURE_NOTIFICATIONS_VERSION (default 3.1.1)

<p align="center">
  <img src="images/jenkins_param.png" alt="job" width="800">
</p>

## <img width="4%" title="Allure Report" src="images/allure-Report-logo.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/C07-daramirra-mobile/2/allure/)

### :pushpin: Общая информация

<p align="center">
  <img src="images/Allure Report.png" alt="Allure Report" width="900">
</p>

### :pushpin: Тест c описанием шагов и визуализацией результатов

<p align="center">
  <img src="images/Allure Report steps.png" alt="Allure Report" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="images/allure-ee-logo.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/645/dashboards)

### :pushpin: Основной дашборд

<p align="center">
  <img src="images/allureTestOPS dashboards.png" alt="dashboards" width="1000">
</p>

### :pushpin: Запуски

<p align="center">
  <img src="images/allureTestOPS launches.png" alt="launches" width="1000">
</p>

### :pushpin: Результат запуска

<p align="center">
  <img src="images/allureTestOPS launch.png" alt="launch" width="1000">
</p>

### :pushpin: Тест-кейсы

<p align="center">
  <img src="images/Test cases.png" alt="test cases" width="1000">
</p>

## <img width="4%" title="Jira" src="images/jira-logo.svg"> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-268)

<p align="center">
  <img src="images/allureTestOPS jira.png" alt="jira" width="1000">
</p>

## <img width="4%" title="Selenoid" src="images/selenoid-logo.svg"> Пример запуска теста в Selenoid

<p align="center">
  <img src="images/video.gif" alt="video" width="900">
</p>

## <img width="4%" title="Telegram" src="images/Telegram.svg"> Уведомления в Telegram

<p align="center">
  <img src="images/Telegram.png" alt="Telegram" width="600">
</p>
<br><br>
