Delimiter $$

CREATE PROCEDURE `getUser`(in pid_user int)
MODIFIES SQL DATA
BEGIN
  SELECT id_user, user, ID_PERSON FROM user
  where id_user = ifnull (pid_user,id_user);
END$$

delimiter ;