# test-tree-grid-db-persist
TreeGrid demo with H2 database - data persister

Support project for the test-tree-grid-db project. Sets up a hierarchial data structre and commits the structure to an H2 database, stored on a local disk.

Before running this application, edit src/main/resources/application.yml to set up a path to where the database file will be stored. This must be accessible to the test-tree-grid-db project.

Example:

---
spring:
  jpa:
    show-sql: true
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: create
  datasource:
    url: jdbc:h2:<path to database>/accountdb
    driver-class-name: org.h2.Driver
    username: sa
    password: password
  h2:
    console:
      enabled: true
