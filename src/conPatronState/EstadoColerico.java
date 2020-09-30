package conPatronState;

public class EstadoColerico extends Estado{
	private static final double defensaEstado=2,multiplicadorDaño=2;
	
	public EstadoColerico(MonjeVikingo1 mv)
	{
		mv.setDaño(super.getDañobase()*multiplicadorDaño);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Colerico");
	}


	@Override
	public void meditar(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoNormal(obj));
	}


	@Override
	public void recibioDaño(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoBeserker(obj));
	}


	@Override
	public void atacar(MonjeVikingo1 obj) {
		///no pasa nada
		
	}
	
	public String GetEstado() {
		return "Colerico";
	}
}
