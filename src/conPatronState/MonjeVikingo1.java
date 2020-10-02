package conPatronState;

public class MonjeVikingo1 {

	private double vida, daño, defensa;
	Estado estado;		///proteccion por paquete
	
	public MonjeVikingo1(double vida)		///imaginemos que este es el estado inicial
	{
		this.vida=vida;
		this.estado=new EstadoNormal(this);   
	}
	
	public void meditar() {
		System.out.println( "el monjeVikingo ha meditado" );
		this.estado.meditar(this);
	}
	
	public void recibirDaño(double dañoRecibido){
		System.out.println( "el monjeVikingo a recibio " +dañoRecibido*defensa+" daño" );
		this.vida-=dañoRecibido*defensa;
		this.estado.recibioDaño(this);
	}
	
	public void atacar() {
		System.out.println("el monjeVikingo a generado "+daño+" daño" );
		this.estado.atacar(this);
	}
	
	@Override
	public String toString() {
		return "----ESTADO |HP:" + vida + ", ATQ:" + daño + ",DEF:" + defensa + ", MODO:" + estado.GetEstado() + "";
	}

	
	///////////setter y getters
	
	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getDaño() {
		return daño;
	}

	public void setDaño(double daño) {
		this.daño = daño;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
}
