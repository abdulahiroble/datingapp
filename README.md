## Setup database connection

Instal MysQL Workbench https://dev.mysql.com/downloads/workbench/

```
src -> main -> resources -> application.properties
```

```
# DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:mysql://localhost:3306/profile?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=password

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE

```
## How to run application

```
src -> main -> DatingappApplication.java
```

## Demo
