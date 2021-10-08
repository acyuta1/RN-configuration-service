--liquibase formatted sql

--changeset teejihba:005-update-total-points-field

UPDATE config.users
SET total_points = 0 where total_points = NULL;