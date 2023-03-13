CREATE TABLE t_degustation(
   id          SERIAL  NOT NULL PRIMARY KEY 
  ,marque      VARCHAR(255) NOT NULL
  ,variete     INTEGER NOT NULL
  ,nom         VARCHAR(15) NOT NULL
  ,commentaire VARCHAR(19) NOT NULL
  ,score       INTEGER NOT NULL
  ,pays        INTEGER NOT NULL
  ,CONSTRAINT fk_marque_id(id)
      FOREIGN KEY(id)
      REFERENCES t_marque(id)
  ,CONSTRAINT fk_variete_id
      FOREIGN KEY(id)
      REFERENCES t_variete(id)
  ,CONSTRAINT fk_pays_id(id)
      FOREIGN KEY(id)
      REFERENCES t_pays(id)
);

INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (1, 6,'Dong ding','Exceptionnel oolong',10,88);
INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (2, 1,'4 Fruits rouges','Bon le matin',9,79);
INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (3, 4,'Pu erh','Bof bof',8,34);
