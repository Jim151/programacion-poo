package DNI;

import javax.swing.JOptionPane;

/*
 Crea una clase NIF que represente el DNI con su correspondiente letra. 
 Los atributos de la clase ser�n el n�mero de DNI y su letra.
 
La clase NIF dispondr� de los siguientes m�todos:
Un constructor por defecto.
Un constructor que reciba como par�metro el DNI y calcule y 
asigne la letra que le corresponde.

Un m�todo leer(): que pida por teclado el n�mero de DNI y 
calcule a partir del DNI introducido la letra que le corresponde.
M�todo toString() que muestre el NIF de la siguiente forma: ocho d�gitos, 
un gui�n y la letra en may�scula. Por ejemplo: 12345678-Z

M�todo para obtener la letra del NIF:
La letra del NIF se calcular� usando un m�todo privado. 
La forma de obtener la letra del NIF es la siguiente:
Se obtiene el resto de la divisi�n entera del n�mero de DNI 
entre 23 y se usa la siguiente tabla para obtener la letra que corresponde:

0 - T 1 - R 2 - W 3 - A 4 - G 5 � M
6 � Y 7 � F 8 � P 9 - D 10 � X 11 � B
12 � N 13 � J 14 � Z 15 � S 16 - Q 17 - V
18 - H 19 - L 20 � C 21 � K 22 � E
 */
public class nif {
	private int numeroDNI;
	private char letra;
	
	public nif() {
		
	}
	public nif(int numeroDNI) {
		this.numeroDNI=numeroDNI;
		letra=hallarLetra();
	}
	//Metodo para hallar la letra del NIF
	private char hallarLetra() {
		char[] letra= {'T','R','W','A','G','M','Y','F','P','D','X',
					'B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return letra[numeroDNI%23];
	}
	//Metodo para leer el numero de DNI
	public void leerNumero() {
		do {
			numeroDNI=Integer.parseInt(JOptionPane.showInputDialog("Numero de DNI: "));
			System.out.println("Numero de 8 digitos...");
		}while(numeroDNI<9999999||numeroDNI>99999999);
		letra=hallarLetra();
	}
	//M�todo que devuelve un String de la forma 99999999-X
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(numeroDNI);
		sb.append(" - ");
		sb.append(letra);
		return sb.toString();
	}
}
