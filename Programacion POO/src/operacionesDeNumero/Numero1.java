package operacionesDeNumero;

// El problema es el siguiente.

//*) Programa que lea un numero y que se visualize lo siquiente:
//- Cantidad de digitos.
//- Suma de sus digitos.
//- Producto de sus digitos.
//- Digito izquierdo
//- Digito derecho.
//- Digito menor.
//- Digito mayor.
//- Numero invertido.

public class Numero1 {
	public int num;
	public static int cantDig = 0, sumDig = 0, numInver = 0, prodDig = 1,
					  numDer = 0, numIzq = 0, numMenor = 10, numMayor = -1, resto = 0;
	public Numero1(int num){
		this.num=num;
		Numero();
	}
	public void Numero() {
		do{
			Resto();
			Producto();
			Suma();
			NDerecha();
			NInvertido();
			NMayor();
			NMenor();
			cantDig ++;
			num /= 10;
		}while(num >0);
		NIzquierda();
	}
	public void Resto(){
		resto *= num % 10;
	}
	public static void Producto(){
		prodDig *= resto;
	}
	public static void Suma(){
		 sumDig += resto;
	}
	public static void NDerecha(){
		if(cantDig == 0)
		{
			numDer = resto;
		}
	}
	public static void NIzquierda(){
		numIzq = numInver % 10;
	}
	public static void NInvertido(){
		numInver = numInver * 10 + resto;
	}
	public static void NMayor(){
		if(resto > numMayor){
			numMayor = resto;
		}
	}
	public static void NMenor(){
		if(resto < numMenor){
			numMenor = resto;
		}
	}
//	================ PROCESAR ================
	void procesar(){
		@SuppressWarnings("unused")
		Numero1 a = new Numero1(getN());
		listado();
	}
	void listado(){
		System.out.println("Cantidad de digitos: "+Numero1.cantDig);
		System.out.println("Suma de digitos:  "+ Numero1.sumDig);
		System.out.println("Producto de digitos:  "+Numero1.prodDig);
		System.out.println("Digito izquierdo:  "+Numero1.numIzq);
		System.out.println("Digito derecho:  "+Numero1.numDer);
		System.out.println("Digito menor:  "+Numero1.numMenor);
		System.out.println("Digito mayor:  "+Numero1.numMayor);
		System.out.println("Numero invertido:  "+Numero1.numInver);
	}
	int getN(){
		return num;
		
	}

}
