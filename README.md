# Проект QIAuto

В данном проекте реализованны автоматические тесты, покрывающие следующие кейсы:

**Кейс 1 Разница двух целых чисел**
1. Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
2. Проскроллить вниз до конца
3. Выбрать сборку (Build) «Prototype»
4. Ввести в поле First number значение «2»
5. Ввести в поле Second number значение «3»
6. Выбрать операцию (Operation) «Subtract»
7. Нажать на кнопку «Calculate»
8. Проверить, что в поле ответа (Answer) значение равно «-1»

**Кейс 2 Конкатенация двух строк.**
1. Открыть сайт https://testsheepnz.github.io/BasicCalculator.html
2. Проскроллить вниз до конца
3. Выбрать сборку (Build) «Prototype»
4. Ввести в поле First number значение «gs»
5. Ввести в поле Second number значение «bu»
6. Выбрать операцию (Operation) «Concatenate»
7. Нажать на кнопку «Calculate»
8. Проверить, что в поле ответа (Answer) значение равно «gsbu»

**Кейс 3 Появление сообщения при вводе строки в поле**
1. Открыть сайт https://testsheepnz.github.io/random-number.html
2. Проскроллить вниз до конца
3. Выбрать сборку (Select Build) «Demo»
4. Нажать на кнопку «Roll the dice»
5. Ввести в поле значение «string»
6. Нажать на кнопку «Submit»
7. Проверить, что появилось сообщение «string: Not a number!»

## Cтруктура проекта 
```bash
.
├── README.md
├── pom.xml
├── src
│   └── test
│       └── java
│           └── org
│               └── example
│                   ├── page
│                   │   ├── BasePage.java //Родительский класс для всех страниц
│                   │   ├── BasicCalculatorPage.java //Класс для страницы BasicCalculator
│                   │   └── RandomNumberPage.java //Класс для страницы RandomNumber
│                   └── test
│                       ├── BaseTest.java //Родительский файл для тестов
│                       ├── BasicCalculatorTest.java //Класс для тестов со страницы BasicCalculator
│                       └── RandomNumberTest.java //Класс для тестов со страницы RandomNumber
└── webdriver 
    └── chromedriver //драйвер браузера
```
# Предпосылки
**Для того что бы тесты запускались необходимо скачать chromedriver под свою операционную систему, распаковать и положить его в директорию webdriver (в данный момент в проекте версия "104.0.5112.79" "chromedriver_mac64_m1.zip").**
[Скачать версию "104.0.5112.79" chromedriver под свою ОС](https://chromedriver.storage.googleapis.com/index.html?path=104.0.5112.79/)
[Другие версии chromedriver:](https://chromedriver.chromium.org/downloads)

# Выполнение автоматизированных тестов
```bash
Кейс 1 "Разница двух целых чисел":
1.Зайти в класс class BasicCalculatorTest
2.Найти метод public void testDifferenceOfTwoIntegers() 
3.Слева на панели нажать на "Run test"
```
![](/Users/ekaterinastepanuk/IdeaProjects/QIAuto/docs/testDifferenceOfTwoIntegers.png)

```bash
Кейс 2 "Конкатенация двух строк":
1.Зайти в класс class BasicCalculatorTest
2.Найти метод public void testConcatOfTwoStrings() 
3.Слева на панели нажать на "Run test"
```
![](/Users/ekaterinastepanuk/IdeaProjects/QIAuto/docs/testConcatOfTwoStrings.png)

```bash
Кейс 3 "Появление сообщения при вводе строки в поле":
1.Зайти в класс class RandomNumberTest
2.Найти метод  public void testRandomNumber() 
3.Слева на панели нажать на "Run test"
```
![](/Users/ekaterinastepanuk/IdeaProjects/QIAuto/docs/testRandomNumber.png)

## Для реализации данной задачи использовались:
1. Java/Kotlin
2. Junit
3. Maven/Gradle
4. Selenium/Selenide
5. Использование паттерна PageObject