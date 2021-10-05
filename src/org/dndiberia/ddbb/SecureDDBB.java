package org.dndiberia.ddbb;

import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.dndiberia.models.UserContext;


/**
 * clase encargade de la seguridad de la aplicacion asi como del control de acceso de usuarios
 * @author dparedero
 *
 */

public class SecureDDBB {
	private static final Logger LOG = Logger.getLogger(SecureDDBB.class);
	
	public static boolean isUserAutoriced(UserContext user) {
		boolean check=false;
		PeticionesUser appGestor= new PeticionesUser();
		String username = user.getUsername();
		try {
			check = appGestor.isUserRegistrado(username);
		} catch (NamingException | SQLException e) {
			LOG.warn("Error durante la comprobacion de usuario", e);
		}
		LOG.info("Usuario comprobado |- "+check+" -|");
		return check;
	}
	
}
