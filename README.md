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
* ✓ *Успешная регистрация пользователя*
* ✓ *Логин с несуществующими данными*
* ✓ *Проверка отображения меню главной страницы*
* ✓ *Оформление подписки*
* ✓ *Проверка редиректа с главной страницы на youtube*
* ✓ *Добавление товара в корзину и его удаление*
* ✓ *Проверка количества добавленных в корзину товаров*

___

## <img alt="Jenkins" height="25" src="images/logo/jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Project_For_Litres/)</a>

___
<p align="center">
!!!! ДОБАВИТЬ СКРИН И ССЫЛКУ ДЖЕНКИНС<a href="https://jenkins.autotests.cloud/job/Project_For_Litres/"><img src="images/screenshots/jenkins_dashboard.png" alt="Jenkins" width="950"/></a>


## **Параметры сборки в Jenkins:**

***Удалённый запуск через Jenkins:***
```bash  
clean
smoke
-Dbase_url="${SITE_BASE_URL}"
-Dbrowser="${BROWSER}"
-Dbrowser_size="${BROWSER_SIZE}"
-DremoteUrl=${REMOTE_URL}"
```
___
!!! ПОМЕНЯТЬ ССЫЛКУ АЛЮР## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Project_For_Litres/allure/)</a>

___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allure_overview.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/allure_suites.png" width="850">  
</p>

### *Графики*


  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure_graphs.png" width="850">  
<img title="Allure Graphics" src="images/screenshots/allure_graphs2.png" width="850">  
</p>

___

!!ПОМЕНЯТЬ ССЫЛКУ## <img alt="Allure" height="25" src="images/logo/allure2.svg" width="35"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/2427/dashboards">Allure TestOps</a>
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

## <img alt="Allure" height="25" src="images/logo/jira.svg" width="45"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-717">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshots/jira.png" width="">  
</p>

____

## <img alt="Allure" height="25" src="images/logo/telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/telegram_bot.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/TestExecution.gif" width="550" height="350"  alt="video">   
</p>