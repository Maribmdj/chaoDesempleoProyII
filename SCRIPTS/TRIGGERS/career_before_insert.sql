DELIMITER $$
CREATE TRIGGER career_before_insert BEFORE INSERT ON career
FOR EACH ROW BEGIN
    SET new.DATE_CREATION = NOW(),
		new.USER_CREATION = system_user(),
        new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;