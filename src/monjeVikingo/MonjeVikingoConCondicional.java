package monjeVikingo;

//////////////con condicionales
public class MonjeVikingoConCondicional extends MonjeVikingo{
	private static final int CALMADO = 1, NORMAL = 2, COLERICO = 3, BERSERKER = 4;
	private static final double da�oBase = 10;
	
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

	public void recibirDa�o(double da�oRecibido) {
		System.out.println("el monjeVikingo a recibio " + da�oRecibido * defensa + " da�o");
		this.vida -= da�oRecibido * defensa;

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
		System.out.println("el monjeVikingo a generado " + da�o + " da�o");

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
		da�o = da�oBase * 1;
		defensa = 0;
		System.out.println("el monjeVikingo a entrado en modo Calmado");
	}

	private void setEstadoNormal() {
		estado = NORMAL;
		da�o = da�oBase * 1;
		defensa = 1;
		System.out.println("el monjeVikingo a entrado en modo Normal");
	}

	private void setEstadoColerico() {
		estado = COLERICO;
		da�o = da�oBase * 2;
		defensa = 2;
		System.out.println("el monjeVikingo a entrado en modo Colerico");
	}

	private void setEstadoBeserker() {
		estado = BERSERKER;
		;
		da�o = da�oBase * 3;
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
		return "----ESTADO |HP:" + vida + ", ATQ:" + da�o + ",DEF:" + defensa + ", MODO:" + getEstado() + "";
	}
}
