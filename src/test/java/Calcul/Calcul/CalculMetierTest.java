package Calcul.Calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
	
	CalculMetier metier;

	protected void setUp() throws Exception {
		super.setUp();
		metier = new CalculMetier();
	}
	
	public void testSomme()
	{
		assertTrue(metier.somme(10, 9) == 19);
	}
	
	public void testProduit()
	{
		assertTrue(metier.produit(10, 9) == 9000);
	}

}
