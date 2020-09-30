package conPatronState;

public abstract class Estado {
	private static final int da�oBase=10;
	
	public abstract void meditar(MonjeVikingo1 obj);
	public abstract void recibioDa�o(MonjeVikingo1 obj);
	public abstract void atacar(MonjeVikingo1 obj);
	
	public static int getDa�obase() {
		return da�oBase;
	}

	public abstract String GetEstado();
	
}
