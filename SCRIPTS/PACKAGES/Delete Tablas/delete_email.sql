/*EMAIL*/
DELIMITER $$
CREATE PROCEDURE DELETE_EMAIL(IN pidBEMAIL  INT)
BEGIN
    delete from EMAIL where ID_BENEFITS = pidEMAIL;
end
$$
DELIMITER ;