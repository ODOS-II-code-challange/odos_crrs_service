create role :databaseAppRole
 NOSUPERUSER NOINHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;
 
 create role :databaseAppRole with 
 LOGIN PASSWORD :databaseAppUserPassword
 NOSUPERUSER NOINHERIT NOCREATEDB NOCREATEROLE NOREPLICATION IN ROLE :databaseAppRole;

grant all on database :databaseName to :databaseAdmin;
grant connect, temporary on database :databaseName to :databaseAppRole;
revoke all on database :databaseName from public;

CREATE SCHEMA :databaseSchema AUTHORIZATION :databaseAdminUser;

GRANT USAGE ON SCHEMA :databaseSchema TO :databaseAppRole;

ALTER ROLE :databaseAppRole WITH LOGIN;

ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT INSERT, UPDATE, DELETE, SELECT, TRUNCATE, REFERENCES, TRIGGER ON TABLES
 TO :databaseAppRole;
 
ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT SELECT, USAGE ON SEQUENCES
 TO :databaseAppRole;
 
ALTER DEFAULT PRIVILEGES IN SCHEMA :databaseSchema
 GRANT SELECT, USAGE ON SEQUENCES
 TO :databaseAppRole;


CREATE SCHEMA :liquibaseSchema AUTHORIZATION :databaseAdmin;


