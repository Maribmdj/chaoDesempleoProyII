/*JOBS*/
DELIMITER $$
CREATE PROCEDURE DELETE_JOB(IN pidJOB INT)
BEGIN
    delete from JOB where ID_JOB = pidJOB;
end
$$
DELIMITER ;