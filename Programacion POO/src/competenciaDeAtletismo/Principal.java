package competenciaDeAtletismo;

//Ejercicio 4: Construir un programa para una competencia de atletismo, el
//programa debe gestionar una serie de atletas caracterizados por su
//número de atleta, nombre y tiempo de carrera, al final el programa debe
//mostrar los datos del atleta ganador de la carrera.


import java.util.Scanner;

public class Principal {
	
	public static int ganadorEs(Atletismo corredor[]) {
		int indice = 0;
		double ganador;
		
		ganador = corredor[0].getTiempo();
		for(int i=1; i<corredor.length; i++) {
			if(corredor[i].getTiempo() < ganador) {
				ganador = corredor[i].getTiempo();
				indice = i;
				
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int serie, numeroDeAtleta, elGanador;
		double tiempo;
		String nombre;
		
		System.out.print("Cuantos atletas correran: ");
		serie = sc.nextInt();
		
		Atletismo corredor[] = new Atletismo[serie];
		
		for(int i=0; i<serie; i++) {
			
			sc.nextLine();
			
			System.out.println("\nDatos del atleta "+(i+1)+": ");
			System.out.print("Numero del atleta: ");
			numeroDeAtleta = sc.nextInt();
			System.out.print("Nombre del atleta: ");
			nombre = sc.nextLine();
			sc.nextLine();
			System.out.print("Tiempo de carrera: ");
			tiempo = sc.nextDouble();
			
			corredor [i] = new Atletismo(numeroDeAtleta, nombre, tiempo);
			
			
		}
		
		elGanador = ganadorEs(corredor);
		
		System.out.println("\nEl ganador es");
		System.out.println(corredor[elGanador].mostrarDatos());
	}

}
