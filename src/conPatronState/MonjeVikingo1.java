package conPatronState;

public class MonjeVikingo1 {

	private double vida, da�o, defensa;
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
	
	public void recibirDa�o(double da�oRecibido){
		System.out.println( "el monjeVikingo a recibio " +da�oRecibido*defensa+" da�o" );
		this.vida-=da�oRecibido*defensa;
		this.estado.recibioDa�o(this);
	}
	
	public void atacar() {
		System.out.println("el monjeVikingo a generado "+da�o+" da�o" );
		this.estado.atacar(this);
	}
	
	@Override
	public String toString() {
		return "----ESTADO |HP:" + vida + ", ATQ:" + da�o + ",DEF:" + defensa + ", MODO:" + estado.GetEstado() + "";
	}

	
	///////////setter y getters
	
	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getDa�o() {
		return da�o;
	}

	public void setDa�o(double da�o) {
		this.da�o = da�o;
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
