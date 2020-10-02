package principal;

import conPatronState.*;
import conCondicional.*;

public class Main {

	public static void main(String[] args) {///100 es la vida inicial
		MonjeVikingo2 jugador= new MonjeVikingo2(100);
		
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
	}

}
