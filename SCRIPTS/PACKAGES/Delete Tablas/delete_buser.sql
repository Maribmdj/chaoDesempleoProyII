/*BUSER*/
DELIMITER $$
CREATE PROCEDURE DELETE_BUSER(IN pidBUSER INT)
BEGIN
    delete from BUSER where ID_BUSER = pidBUSER;
end
$$
DELIMITER ;