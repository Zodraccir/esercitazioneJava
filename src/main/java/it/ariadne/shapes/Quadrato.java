package it.ariadne.shapes;

public class Quadrato implements Forma {

	
	private Punto p;
	private int lato;
	public Quadrato(Punto p, int lato) {
		// TODO Auto-generated constructor stub
		this.p=p;
		this.lato=lato;
	}
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return lato*4;
	}
	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
