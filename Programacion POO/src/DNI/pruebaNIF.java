package DNI;

public class pruebaNIF {

	public static void main(String[] args) {
		
		nif nif1=new nif();
		
		nif1.leerNumero();
		System.out.println(nif1);
		
		nif nif2=new nif(45194578);
		System.out.println(nif2);
	}

}
