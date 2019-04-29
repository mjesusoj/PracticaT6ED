package practica6;

public class Coche {
	private static final String coche = "El coche con matricula ";
	String matricula;
	String tipo;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		tipo = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String t, String mo, String f) {
		matricula = m;
		tipo = t;
		modelo = mo;
		fabricante = f;
	}

	public String metodoinformativo() {
		String resultado = "";
		if (tipo == "Gasolina") {
			resultado += coche + matricula + " ";
			resultado += metodoGasolina(modelo, fabricante);
		} else if (tipo == "Diesel") {
			resultado += coche + matricula + " ";
			resultado += metodoDiesel(modelo, fabricante);
		} else if (tipo == "Híbrido") {
			resultado += coche + matricula + " ";
			resultado += metodoHibrido(modelo, fabricante);
		} else {
			resultado += coche + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

	private String metodoGasolina(String modelo, String fabricante) {
		String resultadoGasolina = "es un" + fabricante + modelo + "y gasta 1,337 euros por litro";
		return resultadoGasolina;
	}

	private String metodoDiesel(String modelo, String fabricante) {
		String resultadoDiesel = "es un" + fabricante + modelo + "y gasta 1,052 euros por litro";
		return resultadoDiesel;
	}

	private String metodoHibrido(String modelo, String fabricante) {
		String resultadoHibrido = "es un" + fabricante + modelo + "y no necesita combustible";
		return resultadoHibrido;
	}
}