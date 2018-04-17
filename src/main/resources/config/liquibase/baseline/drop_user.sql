REVOKE ALL ON DATABASE :databaseName from :databaseAppRole;
DROP USER IF EXISTS :databaseAppUser;
DROP ROLE IF EXISTS :databaseAppRole;
