package monjeVikingo;

public class EstadoCalmado extends Estado{
	private static final double defensaEstado=0,multiplicadorDaño=1;
	
	
	public EstadoCalmado(MonjeVikingoConPatronState mv)
	{
		mv.setDaño(super.getDañobase()*multiplicadorDaño);
		mv.setDefensa(defensaEstado);
		System.out.println("el monjeVikingo a entrado en modo Calmado");
	}


	@Override
	public void meditar(MonjeVikingoConPatronState obj) {
		/// no pasa nada
	}


	@Override
	public void recibioDaño(MonjeVikingoConPatronState obj) {
		///no pasa nada
		
	}


	@Override
	public void atacar(MonjeVikingoConPatronState obj) {
		obj.setEstado(new EstadoNormal(obj));
		
	}

	public String GetEstado() {
		return "Calmado";
	}
	
	
}
