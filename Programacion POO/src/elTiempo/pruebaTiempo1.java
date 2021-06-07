package elTiempo;

public class pruebaTiempo1 {

	public static void main(String[] args) {
		tiempo1 tiempo = new tiempo1();
		
		System.out.print("La hora universal inicial es: ");
		System.out.println(tiempo.horaUniversal());
		System.out.print("La hora estandar inicial es: ");
		System.out.println(tiempo.horaEstndar());
		System.out.println("");
		
		tiempo.setTiempo(19, 29, 55);
		System.out.print("La hora universal despues de establecer tiempo es: ");
		System.out.println(tiempo.horaUniversal());
		System.out.print("La hora estandar despues de establecer tiempo es: ");
		System.out.println(tiempo.horaEstndar());
		System.out.println("");
		
		tiempo.setTiempo(99, 99, 99);
		System.out.println("Despues de intentar ajustes validos: ");
		System.out.print("Hora universal: ");
		System.out.println(tiempo.horaUniversal());
		System.out.print("Hora estandar: ");
		System.out.println(tiempo.horaEstndar());

	}

}
