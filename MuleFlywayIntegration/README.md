#Mule DB Migration FlyWay Integration

This is sample demo project which connect to mysql database and uses Flyway DB migration framework.

#How to Setup-

    Mysql database must be installed on local machine running
    muledemo databse must be present else you can have your own database,then you need to update config/environment/dev.properties file
    config/environment/dev.properties file contain Mysql Database configuration details (update as per your requirement)
    Run application and go to mysql workbench
    It will create demo table and will insert one record as given in db/migration/V1__initial_Schema.sql file
    you can have no of scripts with increment in sql file version increment e.g. next file must be V1.x or V2

References : Flyway - https://flywaydb.org/
