package monjeVikingo;

//////////////con condicionales
public class MonjeVikingoConCondicional extends MonjeVikingo{
	private static final int CALMADO = 1, NORMAL = 2, COLERICO = 3, BERSERKER = 4;
	private static final double dañoBase = 10;
	
	private int estado; /// proteccion por paquete

	public MonjeVikingoConCondicional(double vida) {
		this.vida = vida;
		setEstadoNormal();
	}

	public void meditar() {
		System.out.println("el monjeVikingo ha meditado");

		switch (estado) {
		case CALMADO:
			break;
		case NORMAL:
			setEstadoCalmado();
			break;
		case COLERICO:
			setEstadoNormal();
			break;
		case BERSERKER:
			setEstadoNormal();
			break;
		default:
			break;
		}
	}

	public void recibirDaño(double dañoRecibido) {
		System.out.println("el monjeVikingo a recibio " + dañoRecibido * defensa + " daño");
		this.vida -= dañoRecibido * defensa;

		switch (estado) {
		case CALMADO:
			break;
		case NORMAL:
			setEstadoColerico();
			break;
		case COLERICO:
			setEstadoBeserker();
			break;
		case BERSERKER:
			break;
		default:
			break;
		}
	}

	public void atacar() {
		System.out.println("el monjeVikingo a generado " + daño + " daño");

		switch (estado) {
		case CALMADO:
			setEstadoNormal();
			break;
		case NORMAL:
			break;
		case COLERICO:
			break;
		case BERSERKER:
			break;
		default:
			break;
		}
	}

	private void setEstadoCalmado() {
		estado = CALMADO;
		daño = dañoBase * 1;
		defensa = 0;
		System.out.println("el monjeVikingo a entrado en modo Calmado");
	}

	private void setEstadoNormal() {
		estado = NORMAL;
		daño = dañoBase * 1;
		defensa = 1;
		System.out.println("el monjeVikingo a entrado en modo Normal");
	}

	private void setEstadoColerico() {
		estado = COLERICO;
		daño = dañoBase * 2;
		defensa = 2;
		System.out.println("el monjeVikingo a entrado en modo Colerico");
	}

	private void setEstadoBeserker() {
		estado = BERSERKER;
		;
		daño = dañoBase * 3;
		defensa = 0.5;
		System.out.println("el monjeVikingo a entrado en modo Beserker");
	}

	private String getEstado() {
		String est = null;
		switch (estado) {
		case CALMADO:
			est = "Calmado";
			break;
		case NORMAL:
			est = "Normal";
			break;
		case COLERICO:
			est = "Colerico";
			break;
		case BERSERKER:
			est = "Berseker";
			break;
		default:
			break;
		}
		return est;
	}

	@Override
	public String toString() {
		return "----ESTADO |HP:" + vida + ", ATQ:" + daño + ",DEF:" + defensa + ", MODO:" + getEstado() + "";
	}
}
