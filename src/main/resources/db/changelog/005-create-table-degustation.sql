CREATE TABLE t_degustation(
   id          SERIAL  NOT NULL PRIMARY KEY 
  ,marque      INTEGER NOT NULL
  ,variete     INTEGER NOT NULL
  ,nom         VARCHAR(255) NOT NULL
  ,commentaire VARCHAR(255) NOT NULL
  ,score       INTEGER NOT NULL
  ,pays        INTEGER NOT NULL
  ,FOREIGN KEY (marque)
         REFERENCES t_marque (id)
  ,
      FOREIGN KEY(variete)
      REFERENCES t_variete(id)
  ,
      FOREIGN KEY(pays)
      REFERENCES t_pays(id)
);

INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (1, 6,'Dong ding','Exceptionnel oolong',10,88);
INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (2, 1,'4 Fruits rouges','Bon le matin',9,79);
INSERT INTO t_degustation(marque,variete,nom,commentaire,score,pays) VALUES (3, 4,'Pu erh','Bof bof',8,34);
