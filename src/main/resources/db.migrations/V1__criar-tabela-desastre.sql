CREATE SEQUENCE SEQ_DESASTRES
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

CREATE TABLE TBL_DESASTRES(
    ID INTEGER DEFAULT SEQ_DESASTRE.NEXTVAL NOT NULL,
    NOME VARCHAR2(100) NOT NULL,
    DESCRICAO VARCHAR(200) NOT NULL
);