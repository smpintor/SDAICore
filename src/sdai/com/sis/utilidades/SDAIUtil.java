package sdai.com.sis.utilidades;

/**
 * @since 14/06/2021
 * @author Sergio_M
 *
 */
public abstract class SDAIUtil {

	public static boolean isCadenaVacia(String cadena) {
		if (cadena == null || cadena.length() == 0)
			return true;
		char[] caracteres = cadena.toCharArray();
		for (char caracter : caracteres)
			if (caracter != ' ')
				return false;
		return true;
	}
}
