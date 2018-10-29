
/*PERSON*/
DELIMITER $$
CREATE PROCEDURE DELETE_PERSON(IN pidPERSON INT)
BEGIN
    delete from person where ID_PERSON = pidPERSON;
end
$$
DELIMITER ;

/*USER*/
DELIMITER $$
CREATE PROCEDURE DELETE_USER(IN pidUSER INT)
BEGIN
    delete from USER where ID_USER = pidUSER;
end
$$
DELIMITER ;

/* NUMBER*/
DELIMITER $$
CREATE PROCEDURE DELETE_PNUMBER(IN pidPNUMBER INT)
BEGIN
    delete from PHONE where ID_PNUMBER = pidPNUMBER;
end
$$
DELIMITER ;

/*EMAIL*/
DELIMITER $$
CREATE PROCEDURE DELETE_EMAIL(IN pidBEMAIL  INT)
BEGIN
    delete from EMAIL where ID_BENEFITS = pidEMAIL;
end
$$
DELIMITER ;

/*JOBS*/
DELIMITER $$
CREATE PROCEDURE DELETE_JOB(IN pidJOB INT)
BEGIN
    delete from JOB where ID_JOB = pidJOB;
end
$$
DELIMITER ;

/*JOBXREQ*/
DELIMITER $$
CREATE PROCEDURE DELETE_JOBXREQ(IN pidJOBXRED INT)
BEGIN
    delete from jobxreq where ID_JOB = pidJOBXREQ;
end
$$
DELIMITER ;

/*JOBXPERSON*/
DELIMITER $$
CREATE PROCEDURE DELETE_JOBXPERSON(IN pidJOBXPERSON INT)
BEGIN
    delete from jobxperson where ID_JOBXPERSON = pidJOBXPERSON;
end
$$
DELIMITER ;

/*BUSER*/
DELIMITER $$
CREATE PROCEDURE DELETE_BUSER(IN pidBUSER INT)
BEGIN
    delete from BUSER where ID_BUSER = pidBUSER;
end
$$
DELIMITER ;