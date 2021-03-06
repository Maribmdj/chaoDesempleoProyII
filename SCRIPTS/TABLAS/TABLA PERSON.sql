CREATE TABLE `chaodesempleo`.`PERSON` (
  `ID_PERSON` INT NOT NULL AUTO_INCREMENT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NUMBER_IDENTIF` INT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` VARCHAR(70) NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE PERSON',
  `LASTNAME1` VARCHAR(70) NULL COMMENT 'ATTRIBUTE WITH THE LAST NAME OF THE PERSON',
  `LASTNAME2` VARCHAR(70) NULL COMMENT 'ATTRIBUTE WITH THE LAST NAME OF THE PERSON',
  `BIRTHDATE` DATE NULL COMMENT 'ATTRIBUTE BIRTH DATE OF THE PERSON',
  `PHOTO` VARCHAR(100) NULL COMMENT 'PHOTO OF THE PERSON',
  
  `ID_TYPEPERSON` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE TYPE PERSON',
  `ID_NATIONALITY` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE NACIONALITY',
  `ID_INDUSTRY` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE INDUSTRY',
  `ID_DISTRITO` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE DISTRITO',
  
  `DATE_CREATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_PERSON`),
  
  KEY `fk_IDTPERSON` (`ID_TYPEPERSON`),
  KEY `fk_IDNAT` (`ID_NATIONALITY`),
  KEY `fk_IDIND` (`ID_INDUSTRY`),
  KEY `fk_IDDIST` (`ID_DISTRITO`),
  
  CONSTRAINT `fk_IDTPERSON` FOREIGN KEY (`ID_TYPEPERSON`) REFERENCES `TYPEPERSON` (`ID_TYPEPERSON`),
  CONSTRAINT `fk_IDNAT` FOREIGN KEY (`ID_NATIONALITY`) REFERENCES `NATIONALITY` (`ID_NATIONALITY`),
  CONSTRAINT `fk_IDIND` FOREIGN KEY (`ID_INDUSTRY`) REFERENCES `INDUSTRY` (`ID_INDUSTRY`),
  CONSTRAINT `fk_IDDIST` FOREIGN KEY (`ID_DISTRITO`) REFERENCES `DISTRITO` (`ID_DISTRITO`))
  
COMMENT = 'TABLE PERSON';

