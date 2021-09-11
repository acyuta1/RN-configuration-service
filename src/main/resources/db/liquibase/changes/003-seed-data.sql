--liquibase formatted sql

--changeset acyuta1:003-seed-data

INSERT INTO config.users(date_of_birth, email, username, first_name, last_name) values ('1996-04-28','acy@gmail.com','acyuta','acy','mit');
INSERT INTO config.users(date_of_birth, email, username, first_name, last_name) values ('1996-03-29','sums@gmail.com','sumcy','sums','k');
INSERT INTO config.users(date_of_birth, email, username, first_name, last_name) values ('1996-03-04','teejihba@gmail.com','teejihba','tee','jihba');
INSERT INTO config.users(date_of_birth, email, username, first_name, last_name) values ('1996-08-08','user@gmail.com','user','user','user');

