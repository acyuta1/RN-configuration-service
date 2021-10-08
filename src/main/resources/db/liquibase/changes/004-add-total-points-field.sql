--liquibase formatted sql

--changeset teejihba:004-add-total-points-field

alter table config.users add total_points bigint default 0;

