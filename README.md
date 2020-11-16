## How to run

Instal MysQL Workbench https://dev.mysql.com/downloads/workbench/

## Setup database connection

$ src -> main -> resources -> database

```
# DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:mysql://localhost:3306/profile?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=password
# Hibernate

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE


## How to 

