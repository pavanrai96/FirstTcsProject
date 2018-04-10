package com.invictus.DAO;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

public class GeneratingEcardDAOTest {

	@Test
	public void testCreateEmployeePDF() throws MalformedURLException, IOException 
	{
		//fail("Not yet implemented");
		GeneratingEcardDAO ged=new GeneratingEcardDAO();
		int result=ged.createEmployeePDF(1);
		assertEquals(result, 1);
	}

	@Test
	public void testCreateDependentPDF() throws MalformedURLException, IOException {
		//fail("Not yet implemented");
		GeneratingEcardDAO ged=new GeneratingEcardDAO();
		int result=ged.createDependentPDF(1);
		assertEquals(result, 1);
	}

}
