package principal;

import monjeVikingo.*;

public class Main {

	public static void main(String[] args) {///100 es la vida inicial
		
MonjeVikingo jugador= new MonjeVikingoConPatronState(100);
		
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
		
		System.out.println("-------------------------");
		
		MonjeVikingo jugador2= new MonjeVikingoConCondicional(2000);
		
		System.out.println(jugador2);

		jugador2.meditar();
		
		System.out.println(jugador2);

		jugador2.atacar();	///atacar tiene un daño base de 10(lo dice el enunciado)
		
		System.out.println(jugador2);

		jugador2.recibirDaño(5);   ///necesita ingredar la cantidad de daño
		
		System.out.println(jugador2);
		
		jugador2.recibirDaño(20);
		
		System.out.println(jugador2);
		
		jugador2.atacar();
		
		System.out.println(jugador2);
		
		jugador2.recibirDaño(20);
		
		System.out.println(jugador2);
		
		jugador2.meditar();
		
		System.out.println(jugador2);
		
		jugador2.meditar();
		
		System.out.println(jugador2);
		
		jugador2.recibirDaño(1000);
		
		System.out.println(jugador2);
	}

}
