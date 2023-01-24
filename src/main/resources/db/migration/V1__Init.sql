CREATE TABLE files
(
    id           UUID NOT NULL,
    content      BYTEA,
    file_name    VARCHAR(255),
    content_type VARCHAR(255),
    uploaded_at  TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_files PRIMARY KEY (id)
);