package practica6;

/**
 *  Clase Coche que posee varios atributos adem�s de varios m�todos
 *  @author Manuel Jes�s Ojeda Salvador
 *	@version 2.0
 */

public class Coche {

	/**
	 * Se define una constante (coche) en la que se guarda el valor que se repite muchas veces en el (metodoinformativo).
	 * Se definen varias variables de tipo String.
	 */
	private static final String coche = "El coche con matricula ";
	String matricula;
	String tipo;
	String modelo;
	String fabricante;

	/**
	 * Aqu� se define las variables
	 */
	public Coche() {
		matricula = "";
		tipo = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Se define los atributos
	 * @param m atributo matricula
	 * @param t atributo tipo 
	 * @param mo atributo modelo
	 * @param f atributo fabricante
	 */
	public Coche(String m, String t, String mo, String f) {
		matricula = m;
		tipo = t;
		modelo = mo;
		fabricante = f;
	}

	/**
	 * Este m�todo funciona de tal manera, que si el atributo tipo es igual a "Diesel" se ejecuta un m�todo y si no es ninguno de los que aparecen, 
	 * se ejecuta el caso por defecto.
	 * @return El resultado devuelve el m�todo matriculaCoche anteriormente creado, 
	 * tambi�n se devuelve el resultado de los varios m�todos que se mencionan m�s abajo 
	 * al que se le pasan dos par�metros el modelo y la matr�cula.
	 */
	public String metodoinformativo() {
		String resultado = "";

		switch (tipo)
		{
		case "Gasolina":
			resultado += matriculaCoche() + metodoGasolina(modelo, fabricante);
			break;

		case "Diesel":
			resultado += matriculaCoche() + metodoDiesel(modelo, fabricante);
			break;

		case "H�brido":
			resultado += matriculaCoche() + metodoHibrido(modelo, fabricante);
			break;

		default:
			resultado += matriculaCoche() + "no dispone de informaci�n";
			break;		
		}
		return resultado;
	}

	/**
	 * M�todo matriculaCoche
	 * @return devuelve la constante coche m�s la matr�cula
	 */
	public String matriculaCoche() {
		return coche + matricula;
	}

	/**
	 * M�todo que se ejecuta cuando el tipo es igual a Gasolina
	 * @param modelo Modelo del coche
	 * @param fabricante Fabricante del coche
	 * @return es un Opel Corsa y gasta 1,337 euros por litro.
	 */
	public String metodoGasolina(String modelo, String fabricante) {
		String resultadoGasolina = "es un" + fabricante + modelo + "y gasta 1,337 euros por litro";
		return resultadoGasolina;
	}

	/**
	 * M�todo que se ejecuta cuando el tipo es igual a "Diesel"
	 * @param modelo Modelo del coche
	 * @param fabricante Fabricante del coche
	 * @return es un Seat Ibiza y gasta 1,052 euros por litro.
	 */
	public String metodoDiesel(String modelo, String fabricante) {
		String resultadoDiesel = "es un" + fabricante + modelo + "y gasta 1,052 euros por litro";
		return resultadoDiesel;
	}

	/**
	 * M�todo que se ejecuta cuando el tipo es igual a "Hibrido"
	 * @param modelo Modelo del coche 
	 * @param fabricante Fabricante del coche
	 * @return es un Hyundai Getz y no necesita combustible.
	 */
	public String metodoHibrido(String modelo, String fabricante) {
		String resultadoHibrido = "es un" + fabricante + modelo + "y no necesita combustible";
		return resultadoHibrido;
	}
}