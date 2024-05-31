CREATE SEQUENCE IF NOT EXISTS client_entity_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE client_entity
(
    id       BIGINT NOT NULL,
    username VARCHAR(255),
    CONSTRAINT pk_cliententity PRIMARY KEY (id)
);

DROP TABLE client CASCADE;