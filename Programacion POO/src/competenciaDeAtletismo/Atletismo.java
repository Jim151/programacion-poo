package competenciaDeAtletismo;

// Ejercicio 4: Construir un programa para una competencia de atletismo, el
// programa debe gestionar una serie de atletas caracterizados por su
// número de atleta, nombre y tiempo de carrera, al final el programa debe
// mostrar los datos del atleta ganador de la carrera.

public class Atletismo {
	private int numeroDeAtleta;
	private String nombre;
	private double tiempo;
	
	public Atletismo(int numeroDeAtleta, String nombre, double tiempo){
		this.numeroDeAtleta = numeroDeAtleta;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public double getTiempo(){
		return tiempo;
	}
	public String mostrarDatos(){
		return "Numero de atleta : " +numeroDeAtleta+ "\nnombre: " +nombre+ "\ntiempo: " +tiempo;
		
	}

}
