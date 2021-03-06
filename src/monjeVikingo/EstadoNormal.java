package monjeVikingo;

public class EstadoNormal extends Estado{

	private static final double defensaEstado=1,multiplicadorDaņo=1;
	
	public EstadoNormal(MonjeVikingoConPatronState mv)
	{
		mv.setDaņo(super.getDaņobase()*multiplicadorDaņo);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Normal");
	}
	
	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoCalmado(obj));
	}

	@Override
	public void recibioDaņo(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoColerico(obj));
		
	}

	@Override
	public void atacar(MonjeVikingoConPatronState obj) {
		//no cambia de estado si ataca
	}
	
	public String GetEstado() {
		return "Normal";
	}

}
