# Проект автоматизации тестирования UI для сайта [AutomationExercise](https://www.automationexercise.com/)
![site_logo.png](images/logo/site_logo.png)

## **Содержание:**

____
* Технологии и инструменты
* Примеры автоматизированных тест-кейсов
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Интеграция с Allure TestOps
* Интеграция с JIRA
* Уведомления в Telegram при помощи бота
* Примеры видео выполнения тестов на Selenoid
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/IntelliJ_IDEA.svg" width="40" height="40"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java_logo.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/github.svg" width="38" height="40"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="40" height="45"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="40" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/allure2.svg" width="55" height="55"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/jira.svg" width="100" height="50"  alt="Jira"/></a>  
</p>

___
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
___
* ✓ *Проверка успешной регистрации пользователя*
* ✓ *Проверка логина с несуществующими данными*
* ✓ *Проверка отображения меню главной страницы*
* ✓ *Проверка оформления подписки*
* ✓ *Проверка редиректа с главной страницы на youtube*
* ✓ *Проверка добавления товара в корзину*
* ✓ *Проверка количества добавленных в корзину товаров*

___

## <img alt="Jenkins" height="25" src="images/logo/jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/diploma_project_web/)</a>

___
<p align="center">
<a href="https://jenkins.autotests.cloud/job/diploma_project_web/"><img src="images/screenshots/jenkins_dashboard.png" alt="Jenkins" width="950"/></a>


## **Параметры сборки в Jenkins:**

***Удалённый запуск через Jenkins:***
```bash  
clean
test
-Dbase_url="${SITE_BASE_URL}"
-Dbrowser="${BROWSER}"
-Dbrowser_size="${BROWSER_SIZE}"
-DremoteUrl=${REMOTE_URL}"
```
***Для локального запуска:***
```bash  
✓  Создать файл remote.properties и разместить по адресу src/test/resources/config/remote.properties
✓  Файл должен содержать следующие данные: 
-browserName=CHROME
-browserVersion=100
-browserSize=1920x1080
-baseUrl=https://www.automationexercise.com
-remoteUrl=example: https://userLogin:UserPassword@selenoid.autotests.cloud/wd/hub
```
___
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/diploma_project_web/33/allure/)</a>

___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allure_overview.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/allure_suits.png" width="850">  
</p>

### *Графики*


  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure_graphs.png" width="850">  
<img title="Allure Graphics" src="images/screenshots/allure_graphs2.png" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/allure2.svg" width="35"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3462/dashboards">Allure TestOps</a>
___

### *Allure TestOps Dashboard*

<p align="center">
<img title="Allure TestOps Dashboard" src="images/screenshots/testops_dashboard.png" width="850">  
</p> 

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/testops_manual.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img alt="Allure TestOps Tests" src="images/screenshots/testops_auto.png" width="850">  
</p>

___

___

## <img alt="Allure" height="25" src="images/logo/jira.svg" width="45"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-778">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshots/jira.png" width="">  
</p>

____

## <img alt="Allure" height="25" src="images/logo/telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/telegram.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Пример видео выполнения тестов на Selenoid: тест регистрации пользователя и логин с невалидными даннми
____
<p align="center">
<img title="Selenoid Video" src="images/video/LoginTestExecution.gif" width="550" height="350"  alt="video">   
</p>