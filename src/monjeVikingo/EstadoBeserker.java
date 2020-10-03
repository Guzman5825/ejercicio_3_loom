package monjeVikingo;

public class EstadoBeserker extends Estado{
	private static final double defensaEstado=0.5,multiplicadorDaņo=3;
	
	public EstadoBeserker(MonjeVikingoConPatronState mv)
	{
		mv.setDaņo(super.getDaņobase()*multiplicadorDaņo);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Beserker");
	}


	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoNormal(obj));
	}


	@Override
	public void recibioDaņo(MonjeVikingoConPatronState obj) {
		///no pasa nada
	}


	@Override
	public void atacar(MonjeVikingoConPatronState obj) {
		///no pasa nada
		
	}
	
	public String GetEstado() {
		return "Beserker";
	}
}
