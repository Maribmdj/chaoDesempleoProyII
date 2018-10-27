CREATE TABLE `chaodesempleo`.`USER` (
  `ID_USER` INT NOT NULL COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `USER` INT COMMENT 'ATTRIBUTE OF NAME OF USER',
  `PASSWORD` VARCHAR(100) NULL COMMENT 'ATTRIBUTE OF THE PASSWORD OF THE USER',
  
  `ID_PERSON` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE PERSON',
  
  `DATE_CREATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_USER`),
  
  KEY `fk_IDPERSON` (`ID_PERSON`),
  CONSTRAINT `fk_IDPERSON` FOREIGN KEY (`ID_PERSON`) REFERENCES `PERSON` (`ID_PERSON`))
  
COMMENT = 'TABLE USER';

