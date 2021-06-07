package serieDeVehiculos;

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		String marca, modelo;
		double precio;
		int numeroDeVehiculo, indiceBarato;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite la cantidad de vehiculos  ");
		numeroDeVehiculo = sc.nextInt();

		Vehiculo coches[] = new Vehiculo[numeroDeVehiculo];

		for (int i = 0; i < numeroDeVehiculo; i++) {

			sc.nextLine();

			System.out.println("\nCaracteristicas de los Vehiculos " + (i + 1));
			System.out.print("Marca: ");
			marca = sc.nextLine();
			System.out.print("Modelo: ");
			modelo = sc.nextLine();
			System.out.print("Precio: ");
			precio = sc.nextDouble();

			coches[i] = new Vehiculo(marca, modelo, precio);

		}

		indiceBarato = indiceCocheMasBarato(coches);

		System.out.println("\n El coche mas barao es: ");
		System.out.println(coches[indiceBarato].mostraDatos());

	}

	public static int indiceCocheMasBarato(Vehiculo coches[]) {
		double precio;
		int indice = 0;

		precio = coches[0].getPrecio();
		for (int i = 0; i < coches.length; i++) {
			if (coches[i].getPrecio() < precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

}
