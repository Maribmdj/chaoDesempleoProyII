SELECT U.USER AS USUARIO, P.name AS NOMBRE, P.lastname1 AS APELLIDO, P.lastname2 AS APELLIDO
FROM
    USER U INNER JOIN PERSON P
    ON U.ID_PERSON = P.ID_PERSON 
		AND (P.NAME LIKE CONCAT('%','','%') or P.LASTNAME1 LIKE CONCAT('%','','%') or P.LASTNAME2 LIKE CONCAT('%','','%') or U.USER LIKE CONCAT('%','','%'))
        #AND P.NUMBER_IDENTF= LIKE CAST(CONCAT('%','1529','%') as INT)
        
        
    #INNER JOIN BUSER BU ON BU.DATE_ BETWEEN pEDAD1 AND pEDAD2)