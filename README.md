# hclhank
HCLHack
Application Name : BankApplication

Execution Steps:

Step: Go to Application - (RightClick) - Run as - Spring Boot App.

UserCase :
Login user with customer Id or pin and validate the pin
if valid then allow the user to show the list of accounts mapped with the user
if the user want to allow the user to add the new account
If the user want to add the account, then name, account number and bank name to persist the details

Implemented:
Services are running and working fine.
In Application, I started from scratch using STS IDE with web, H2 dependencies
Later I had added data-jpa(for database access), tomcat-japser(for JSP)

properties : JSP prefix & Suffix , H2 Datasoruce

Once Application started, It will show login pin to enter within 4 digits.Click on submit.
In controller, we landed page on login page.
It will tried to valid and fetch account details for respective users. In controller, we tried to validated the pin 
and using service class tried to wired the repository to get the details.
Home page is enabled to show the list of accounts and to add the accounts these parts is implemented in service layer
to save it repository using save method.
H2 database configuration also implemented in properties file to store database

Not Implemented:
Tables are not created in H2 Database
Controller implementation is not done for add accounts
List account shown and add account is not done.

 
 
