--liquibase formatted sql

--changeset acyuta1:002-initial-user-and-security-scripts

create table config.users (
                       id bigint identity not null primary key,
                       first_name varchar(255) not null,
                       last_name varchar(255) not null,
                       email varchar(255) not null,
                       username varchar(255) not null,
                       date_of_birth datetime2 not null,
                       updated_at datetime null,
                       token varchar(255) null,
                       constraint users_username_unique unique (username)
);

INSERT INTO config.users( date_of_birth, email, username, first_name, last_name) values ('1996-01-01','admin@rf.com','admin','admin','admin');
