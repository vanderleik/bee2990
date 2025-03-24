CREATE TABLE IF NOT EXISTS projetos (
    pnumero     NUMERIC,
    pnome       VARCHAR(45),
    dnumero NUMERIC REFERENCES departamentos (dnumero),
    CONSTRAINT projetos_pk PRIMARY KEY (pnumero)
);