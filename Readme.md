# SpeedSheild Testing

### Dependencies for this Project

1. Java
2. Maven

### Libraries used in this project

1. Selenium
2. log4j
3. TestNG

### Steps

Clone the Project

Update ChromeDriver in Drivers folder which is compatible with your System from https://chromedriver.chromium.org/downloads

Update the config.properties in Configurations following details

```
   - URL of the website
Home_Url  - Path to Chrome Driver
User_name_1 - username to login
Password_1 - Password to login
First_name - First Name to filter
Last_name - Last Name to filter
Personal_number - Personal Number to update
```

cd SpeedShield
mvn clean test

### Note

We can also run this project in Eclipse by importing as a existing maven project.

### Results

Logs can be found in log folder which is created after running the tests.
