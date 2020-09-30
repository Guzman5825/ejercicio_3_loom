package conPatronState;

public class EstadoCalmado extends Estado{
	private static final double defensaEstado=0,multiplicadorDaño=1;
	
	
	public EstadoCalmado(MonjeVikingo1 mv)
	{
		mv.setDaño(super.getDañobase()*multiplicadorDaño);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Calmado");
	}


	@Override
	public void meditar(MonjeVikingo1 obj) {
		/// no pasa nada
	}


	@Override
	public void recibioDaño(MonjeVikingo1 obj) {
		///no pasa nada
		
	}


	@Override
	public void atacar(MonjeVikingo1 obj) {
		obj.setEstado(new EstadoNormal(obj));
		
	}

	public String GetEstado() {
		return "Calmado";
	}
	
	
}
