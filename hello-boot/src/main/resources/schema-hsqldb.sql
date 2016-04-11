CREATE TABLE person(
  first_name  VARCHAR(150),
  last_name   VARCHAR(150),
  age         INTEGER,
  place       VARCHAR(100)

);

CREATE SEQUENCE person_id_seq START WITH 1 INCREMENT BY 1;
ALTER TABLE person ADD COLUMN id numeric DEFAULT nextval('person_id_seq');
ALTER SEQUENCE person_id_seq OWNED BY person.id;