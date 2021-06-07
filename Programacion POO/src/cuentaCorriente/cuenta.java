package cuentaCorriente;

/*
 * 1) Crea una clase llamada Cuenta que tendr� los siguientes atributos: 
 * titular y saldo(puede tener decimales).
El titular ser� obligatorio y la cantidad es opcional. 
Crea dos constructores que cumpla lo anterior.
Crea sus m�todos get, set y toString.
Tendr� dos m�todos especiales:
	� ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
	  si la cantidad introducida es negativa, no se har� nada.
	� retirar(double cantidad): se retira una cantidad a la cuenta, 
	  si restando la cantidad actual ala que nos pasan es negativa, 
	  el saldo de la cuenta pasa a ser 0.
 */
public class cuenta {
	private String titular;
	private double saldo;

	public cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public cuenta(String titular) {
		this.titular = titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void abonarMonto(double montoAbonado) {
		if (montoAbonado <= 0) {
			saldo += 0;
		} else {
			saldo += montoAbonado;
		}
	}

	public void retirarMonto(double montoRetirado) {
		if ((saldo - montoRetirado) <= 0) {
			saldo = 0.0;
		} else {
			saldo -= montoRetirado;
		}
	}

	public String mostrarDatos() {
		return "Nombre: " + titular + "\nSaldo: " + saldo;
	}

}
