package monjeVikingo;

public class EstadoColerico extends Estado{
	private static final double defensaEstado=2,multiplicadorDaño=2;
	
	public EstadoColerico(MonjeVikingoConPatronState mv)
	{
		mv.setDaño(super.getDañobase()*multiplicadorDaño);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Colerico");
	}


	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoNormal(obj));
	}


	@Override
	public void recibioDaño(MonjeVikingoConPatronState obj) {
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
