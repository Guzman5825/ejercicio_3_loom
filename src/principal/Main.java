package principal;

import monjeVikingo.*;

public class Main {

	public static void main(String[] args) {///100 es la vida inicial
		
MonjeVikingo1 jugador= new MonjeVikingo1(100);
		
		System.out.println(jugador);

		jugador.meditar();
		
		System.out.println(jugador);

		jugador.atacar();	///atacar tiene un da�o base de 10(lo dice el enunciado)
		
		System.out.println(jugador);

		jugador.recibirDa�o(5);   ///necesita ingredar la cantidad de da�o
		
		System.out.println(jugador);
		
		jugador.recibirDa�o(20);
		
		System.out.println(jugador);
		
		jugador.atacar();
		
		System.out.println(jugador);
		
		jugador.recibirDa�o(20);
		
		System.out.println(jugador);
		
		jugador.meditar();
		
		System.out.println(jugador);
		
		jugador.meditar();
		
		System.out.println(jugador);
		
		jugador.recibirDa�o(1000);
		
		System.out.println(jugador);
		
		System.out.println("-------------------------");
		
		MonjeVikingo2 jugador2= new MonjeVikingo2(2000);
		
		System.out.println(jugador2);

		jugador2.meditar();
		
		System.out.println(jugador2);

		jugador2.atacar();	///atacar tiene un da�o base de 10(lo dice el enunciado)
		
		System.out.println(jugador2);

		jugador2.recibirDa�o(5);   ///necesita ingredar la cantidad de da�o
		
		System.out.println(jugador2);
		
		jugador2.recibirDa�o(20);
		
		System.out.println(jugador2);
		
		jugador2.atacar();
		
		System.out.println(jugador2);
		
		jugador2.recibirDa�o(20);
		
		System.out.println(jugador2);
		
		jugador2.meditar();
		
		System.out.println(jugador2);
		
		jugador2.meditar();
		
		System.out.println(jugador2);
		
		jugador2.recibirDa�o(1000);
		
		System.out.println(jugador2);
	}

}
