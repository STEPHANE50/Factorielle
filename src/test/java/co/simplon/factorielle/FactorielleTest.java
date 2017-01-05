package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigInteger;

public class FactorielleTest {

	@Test
	public void testCalculerFactoriellede0() {
		// Param GIVEN
		long entier = 0;
		Factorielle factorielle = new Factorielle();

		// Resultat attendu WHEN

		long resultat = factorielle.calculer(entier);

		// Le resultat doit être 1 THEN

		assertEquals(1, resultat);
	}
	
	@Test
	public void testCalculerFactoriellede1() {
		// Param GIVEN
		long entier = 1;
		Factorielle factorielle = new Factorielle();

		// Resultat attendu WHEN

		long resultat = factorielle.calculer(entier);

		// Le resultat doit être 1 THEN

		assertEquals(1, resultat);
	}

	@Test
	public void testCalculerFactoriellede15() {
		// GIVEN Paramètres
		long entier = 19;
		Factorielle factorielle = new Factorielle();

		// Resultat attendu WHEN

		long resultat = factorielle.calculer(entier);

		// THEN Le resultat doit être factorielle de 25 THEN

		assertEquals(121645100408832000l, resultat);
	}
	/*/@Test
	public void testCalculerFactoriellede20() {
		// GIVEN Paramètres
		bignumber entier = 19;
		Factorielle factorielle = new Factorielle();

		// Resultat attendu WHEN

		long resultat = factorielle.calculer(entier);

		// THEN Le resultat doit être factorielle de 25 THEN

		assertEquals(121645100408832000l, resultat);
	}

	@Test
	public void testCalculerException() throws Exception {

		Fail ( IllegalArgumentException("le nombre doit être superieur à 0."));
	}

	*/
}