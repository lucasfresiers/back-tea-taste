CREATE TABLE t_marque(
   id  SERIAL NOT NULL PRIMARY KEY
  ,nom VARCHAR(255) NOT NULL
);
INSERT INTO t_marque(nom) VALUES ('Palais des thés');
INSERT INTO t_marque(nom) VALUES ('Damann Frères');
INSERT INTO t_marque(nom) VALUES ('Kusmi Tea');