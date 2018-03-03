package Calculadora;

public class Programa {
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habréis añadido.
	//Ejecutadlo.
	public static void main(String[] args)  {
		
	
		
		
Calculadora a= new Calculadora(2, 1);
		
		System.out.println(a.toString());
		System.out.println("suma: "+a.suma());
		System.out.println("resta: "+a.resta());
		System.out.println("division: "+a.division());
		System.out.println("potencia: "+a.potencia());
	}
}
