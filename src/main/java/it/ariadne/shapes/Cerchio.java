package it.ariadne.shapes;

public class Cerchio implements Forma {

	private int raggio;
	private Punto p;
	
	public Cerchio(Punto p, int raggio) {
		this.p=p;
		this.raggio=raggio;
	}

	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return 2*3*raggio;
	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public int getDiametro(){
		return raggio*2;
	}

}
