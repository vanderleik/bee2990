CREATE TABLE IF NOT EXISTS departamentos (
    dnumero     NUMERIC,
    dnome       CHARACTER VARYING (60),
    cpf_gerente VARCHAR(15) REFERENCES empregados (cpf),
    CONSTRAINT departamentos_pk PRIMARY KEY (dnumero)
);