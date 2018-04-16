CREATE SCHEMA :databaseSchema AUTHORIZATION :databaseAdminUser;

GRANT USAGE ON SCHEMA :databaseSchema TO :databaseAppRole;

ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT INSERT, UPDATE, DELETE, SELECT, TRUNCATE, REFERENCES, TRIGGER ON TABLES
 TO :databaseAppRole;
 
ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT SELECT, USAGE ON SEQUENCES
 TO :databaseAppRole;
 
ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT SELECT, USAGE ON SEQUENCES
 TO :databaseAppRole;