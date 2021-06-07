package cuentaCorriente;

import java.util.Scanner;

/*
 * 1) Crea una clase llamada Cuenta que tendr� los siguientes atributos: titular y cantidad
(puede tener decimales).
El titular ser� obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo
anterior.
Crea sus m�todos get, set y toString.
Tendr� dos m�todos especiales:
	� ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
	  si la cantidad introducidaes negativa, no se har� nada.
	� retirar(double cantidad): se retira una cantidad a la cuenta, 
	  si restando la cantidad actual ala que nos pasan es negativa, 
	  la cantidad de la cuenta pasa a ser 0.
 */
public class pruebaCuenta {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.print("Nombre del titular: ");
		nombre = sc.nextLine();

		cuenta cuenta1 = new cuenta(nombre, 100.00);

		System.out.printf("\nsaldo: bs %.2f\n", cuenta1.getSaldo());

		double montoDeposito;
		double montoRetidao;

		System.out.print("\nMonto a depositar: ");
		montoDeposito = sc.nextDouble();
		cuenta1.abonarMonto(montoDeposito);

		System.out.print("\nMonto a retirar: ");
		montoRetidao = sc.nextDouble();
		cuenta1.retirarMonto(montoRetidao);

		System.out.println("");
		System.out.println(cuenta1.mostrarDatos());

	}

}
