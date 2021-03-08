# test-tree-grid-db-persist
TreeGrid demo with H2 database - data persister

Support project for the `test-tree-grid-db` project. Sets up a hierarchial data structure with test data and commits the structure to an H2 database, stored on local disk.

Before running this application, edit `src/main/resources/application.yml` and modify `jpa.datasource.url` property to point to the path where the database file should be stored. This path must be accessible to the `test-tree-grid-db project`.
