package monjeVikingo;

public class EstadoNormal extends Estado{

	private static final double defensaEstado=1,multiplicadorDaño=1;
	
	public EstadoNormal(MonjeVikingo1 mv)
	{
		mv.setDaño(super.getDañobase()*multiplicadorDaño);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Normal");
	}
	
	@Override
	public void meditar(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoCalmado(obj));
	}

	@Override
	public void recibioDaño(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoColerico(obj));
		
	}

	@Override
	public void atacar(MonjeVikingo1 obj) {
		//no cambia de estado si ataca
	}
	
	public String GetEstado() {
		return "Normal";
	}

}
