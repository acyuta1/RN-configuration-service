--liquibase formatted sql

--changeset acyuta1:001-create-schema

if (schema_id('config') is null)
    begin
    exec ('create schema [config] authorization [dbo]')
    end