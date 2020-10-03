package monjeVikingo;

public abstract class Estado {
	private static final int daņoBase=10;
	
	public abstract void meditar(MonjeVikingoConPatronState obj);
	public abstract void recibioDaņo(MonjeVikingoConPatronState obj);
	public abstract void atacar(MonjeVikingoConPatronState obj);
	
	public static int getDaņobase() {
		return daņoBase;
	}

	public abstract String GetEstado();
	
}
