CREATE TABLE IF NOT EXISTS empregados (
    cpf            VARCHAR(15),
    enome          CHARACTER VARYING (255),
    salary         FLOAT,
    cpf_supervisor VARCHAR(15),
    dnumero        NUMERIC,
    CONSTRAINT empregados_pk PRIMARY KEY (cpf)
);
