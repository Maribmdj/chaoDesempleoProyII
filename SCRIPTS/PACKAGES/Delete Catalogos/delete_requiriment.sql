/*REQUIRIMENT*/
DELIMITER $$
CREATE PROCEDURE DELETE_REQUIRIMENT(IN pidREQUIRIMENT INT)
BEGIN
    delete from REQUIRIMENT where id_REQUIRIMENT = pidREQUIRIMENT;
end
$$
DELIMITER ;