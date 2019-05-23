package practica6;	

 	/**	
	 * Clase Moto que pose dos variables: matricula y cilindrada	
	 * @author Manuel Jesús Ojeda Salvador	
	 * @version 1.0	
	 */	

 public class Moto {	
	String matricula;	
	int cilindrada;	

 	/**	
	 * Definir las variables	
	 */	
	public Moto() {	
		matricula = "";	
		cilindrada = 0;	
	}	

 	/**	
	 * 	
	 * @param m Atributo de la moto matricula	
	 * @param c Atributo de la moto cilindrada	
	 */	
	public Moto(String m, int c) {	
		matricula = m;	
		cilindrada = c;	
	}	

 	/**	
	 * @return Devuelve la matricula	
	 */	
	public String getMatricula() {	
		return matricula;	
	}	

 	/**	
	 * @return Devuelve la cilindrada	
	 */	
	public int getCilindrada() {	
		return cilindrada;	
	}	

 	/**	
	 * Se le da valor "real" al atributo matricula	
	 * @param m Atributo de la moto matricula	
	 */	
	public void setMatricula(String m) {	
		matricula = m;	
	}	

 	/**	
	 * Se le da valor "real" al atributo cilindrada	
	 * @param c Atributo de la moto cilindrada	
	 */	
	public void setCilindrada(int c) {	
		cilindrada = c;	
	}	
} 