package serieDeVehiculos;

//Construir un programa que dada una serie de veh�culos
// caracterizados por su marca, modelo y precio, imprima las propiedades
// del veh�culo m�s barato. Para ello, se deber�n leer por teclado las
// caracter�sticas de cada veh�culo y crear una clase que represente a cada
// uno de ellos.


public class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;
	
	//Constructor
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//getters
	public double getPrecio() {
		return precio;
	}
	//toString
	public String mostraDatos() {
		return "Marca: " +marca+"\nModelo: " +modelo+"\nPrecio: "+precio;
	}

}
