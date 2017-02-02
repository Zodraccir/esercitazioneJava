package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
 
	List<Forma> forme=new ArrayList<>();
	
	
	
	public void add(Forma q) {
		forme.add(q);	
	}

	public int size() {
		// TODO Auto-generated method stub
		int totalNumberOfShapes=0;
		totalNumberOfShapes += forme.size();

		return totalNumberOfShapes;
	}


	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		double perimetroTotale=0d;
		
		for (Forma formes : forme) {
			perimetroTotale+=formes.calcolaPerimetro();
			((Cerchio)formes).getDiametro();
		}
		return perimetroTotale;
	}

}
