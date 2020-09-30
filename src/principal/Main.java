package principal;

import conPatronState.*;

public class Main {

	public static void main(String[] args) {///100 es la vida inicial
		MonjeVikingo1 jugador= new MonjeVikingo1(100);
		
		System.out.println(jugador);

		jugador.meditar();
		
		System.out.println(jugador);

		jugador.atacar();	///atacar tiene un daño base de 10(lo dice el enunciado)
		
		System.out.println(jugador);

		jugador.recibirDaño(5);   ///necesita ingredar la cantidad de daño
		
		System.out.println(jugador);
		
		jugador.recibirDaño(20);
		
		System.out.println(jugador);
		
		jugador.atacar();
		
		System.out.println(jugador);
		
		jugador.recibirDaño(20);
		
		System.out.println(jugador);
		
		jugador.meditar();
		
		System.out.println(jugador);
		
		jugador.meditar();
		
		System.out.println(jugador);
		
		jugador.recibirDaño(1000);
		
		System.out.println(jugador);
	}

}
