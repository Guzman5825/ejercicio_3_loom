package monjeVikingo;

public class EstadoColerico extends Estado{
	private static final double defensaEstado=2,multiplicadorDa�o=2;
	
	public EstadoColerico(MonjeVikingoConPatronState mv)
	{
		mv.setDa�o(super.getDa�obase()*multiplicadorDa�o);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Colerico");
	}


	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoNormal(obj));
	}


	@Override
	public void recibioDa�o(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoBeserker(obj));
	}


	@Override
	public void atacar(MonjeVikingoConPatronState obj) {
		///no pasa nada
		
	}
	
	public String GetEstado() {
		return "Colerico";
	}
}
