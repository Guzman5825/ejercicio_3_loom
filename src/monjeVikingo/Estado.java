package monjeVikingo;

public abstract class Estado {
	private static final int da�oBase=10;
	
	public abstract void meditar(MonjeVikingoConPatronState obj);
	public abstract void recibioDa�o(MonjeVikingoConPatronState obj);
	public abstract void atacar(MonjeVikingoConPatronState obj);
	
	public static int getDa�obase() {
		return da�oBase;
	}

	public abstract String GetEstado();
	
}
