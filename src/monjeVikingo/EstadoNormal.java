package monjeVikingo;

public class EstadoNormal extends Estado{

	private static final double defensaEstado=1,multiplicadorDa�o=1;
	
	public EstadoNormal(MonjeVikingoConPatronState mv)
	{
		mv.setDa�o(super.getDa�obase()*multiplicadorDa�o);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Normal");
	}
	
	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoCalmado(obj));
	}

	@Override
	public void recibioDa�o(MonjeVikingoConPatronState obj) {
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
