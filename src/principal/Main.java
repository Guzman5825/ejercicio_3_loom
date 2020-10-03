package principal;

import monjeVikingo.*;

public class Main {

	public static void main(String[] args) {/// 100 es la vida inicial

		MonjeVikingo jugador = new MonjeVikingoConPatronState(100);

		System.out.println(jugador);
		System.out.println("-------------------------");

		jugador.meditar();
		jugador.recibirDaño(10);

		System.out.println(jugador);
		System.out.println("esperado:modo calmado");

		jugador.atacar();
		System.out.println("esperado:modo normal");
		
		jugador.atacar();
		jugador.recibirDaño(10);
		
		System.out.println(jugador);
		System.out.println("esperado:modo colerico");

		jugador.atacar();
		jugador.recibirDaño(10);

		System.out.println(jugador);
		System.out.println("esperado:modo beserker");

		jugador.atacar();
		jugador.recibirDaño(10);
		
		jugador.meditar();
		jugador.recibirDaño(10);
		jugador.meditar();

		System.out.println(jugador);
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");

		jugador = new MonjeVikingoConCondicional(100);

		System.out.println(jugador);
		System.out.println("-------------------------");

		jugador.meditar();
		jugador.recibirDaño(10);

		System.out.println(jugador);
		System.out.println("esperado:modo calmado");

		jugador.atacar();
		System.out.println("esperado:modo normal");
		
		jugador.atacar();
		jugador.recibirDaño(10);
		
		System.out.println(jugador);
		System.out.println("esperado:modo colerico");

		jugador.atacar();
		jugador.recibirDaño(10);

		System.out.println(jugador);
		System.out.println("esperado:modo beserker");

		jugador.atacar();
		jugador.recibirDaño(10);
		
		jugador.meditar();
		jugador.recibirDaño(10);
		jugador.meditar();

		System.out.println(jugador);
	}

}
