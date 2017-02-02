package it.ariadne.test.shapes;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.shapes.Canvas;
import it.ariadne.shapes.Cerchio;
import it.ariadne.shapes.Punto;
import it.ariadne.shapes.Quadrato;


public class TestCanvas {
	Canvas canvas;
	
	Quadrato q;
	Cerchio c;
	@Before
	public void setup(){
		canvas=new Canvas();
		Punto p=new Punto(12,31);
		int lato=3;
		int raggio=2;
		q = new Quadrato(p,lato);
		c = new Cerchio(p,raggio);
		canvas.add(q);
		canvas.add(c);
	}
	
	
	@Test
	public void testDimensioneCanvas() {
		int canvasSize=canvas.size();
		Assert.assertEquals("Il canvas contiene due forme", 2,canvasSize);
	}
	
	@Test
	public void controlloAreePerimetri(){		
		double perimetroTotale=canvas.calcolaPerimetro();
		Assert.assertEquals("Il canvas contiene due forme", 24,perimetroTotale,0);

		
	}
	
	@Test
	public void bastard(){
		Quadrato q=new Quadrato(null,-3);
		Assert.assertEquals("Il perimetro è 12", 12,q.calcolaPerimetro(),0);
		
	}

}
