package monjeVikingo;

public abstract class Estado {
	private static final int dañoBase=10;
	
	public abstract void meditar(MonjeVikingoConPatronState obj);
	public abstract void recibioDaño(MonjeVikingoConPatronState obj);
	public abstract void atacar(MonjeVikingoConPatronState obj);
	
	public static int getDañobase() {
		return dañoBase;
	}

	public abstract String GetEstado();
	
}
