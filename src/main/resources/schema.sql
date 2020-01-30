--drop table if exists `assessment`;
--drop table if exists `opportunity`;

CREATE TABLE assessment(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  sellprice INT NOT NULL
);

CREATE TABLE opportunity(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  assessment_id INT,
  opportunityId VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  foreign key (assessment_id ) references assessment(id)
);