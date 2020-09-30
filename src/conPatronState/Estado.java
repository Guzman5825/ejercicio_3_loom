package conPatronState;

public abstract class Estado {
	private static final int daņoBase=10;
	
	public abstract void meditar(MonjeVikingo1 obj);
	public abstract void recibioDaņo(MonjeVikingo1 obj);
	public abstract void atacar(MonjeVikingo1 obj);
	
	public static int getDaņobase() {
		return daņoBase;
	}

	public abstract String GetEstado();
	
}
