CREATE TABLE IF NOT EXISTS trabalha (
  cpf_emp VARCHAR(15) REFERENCES empregados(cpf),
  pnumero numeric
);