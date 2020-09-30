package conPatronState;

public abstract class Estado {
	private static final int dañoBase=10;
	
	public abstract void meditar(MonjeVikingo1 obj);
	public abstract void recibioDaño(MonjeVikingo1 obj);
	public abstract void atacar(MonjeVikingo1 obj);
	
	public static int getDañobase() {
		return dañoBase;
	}

	public abstract String GetEstado();
	
}
