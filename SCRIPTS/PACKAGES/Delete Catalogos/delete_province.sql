/*PROVINCE*/
DELIMITER $$
CREATE PROCEDURE DELETE_PROVINCE(IN pidPROVINCE INT)
BEGIN
    delete from PROVINCE where id_PROVINCE = pidPROVINCE;
end
$$
DELIMITER ;