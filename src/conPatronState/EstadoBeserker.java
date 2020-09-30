package conPatronState;

public class EstadoBeserker extends Estado{
	private static final double defensaEstado=0.5,multiplicadorDaņo=3;
	
	public EstadoBeserker(MonjeVikingo1 mv)
	{
		mv.setDaņo(super.getDaņobase()*multiplicadorDaņo);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Beserker");
	}


	@Override
	public void meditar(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoNormal(obj));
	}


	@Override
	public void recibioDaņo(MonjeVikingo1 obj) {
		///no pasa nada
	}


	@Override
	public void atacar(MonjeVikingo1 obj) {
		///no pasa nada
		
	}
	
	public String GetEstado() {
		return "Beserker";
	}
}
