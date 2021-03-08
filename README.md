# test-tree-grid-db-persist
TreeGrid demo with H2 database - data persister

Support project for the `test-tree-grid-db` project. Sets up a hierarchial data structre and commits the structure to an H2 database, stored on a local disk.

Before running this application, edit `src/main/resources/application.yml` to set up a path to where the database file will be stored. This must be accessible to the `test-tree-grid-db project`. Change the `jpa.datasource.url` property to point to the path where the database file should be stored.
