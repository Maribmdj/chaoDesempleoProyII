/*JOBXREQ*/
DELIMITER $$
CREATE PROCEDURE DELETE_JOBXREQ(IN pidJOBXRED INT)
BEGIN
    delete from jobxreq where ID_JOB = pidJOBXREQ;
end
$$
DELIMITER ;