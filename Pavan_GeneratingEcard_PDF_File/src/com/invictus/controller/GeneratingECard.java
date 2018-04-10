package com.invictus.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.ByteArrayOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStream;
import java.io.OutputStream;


import com.invictus.DAO.GeneratingEcardDAO;

/**
 * Servlet implementation class GeneratingECard
 */
@WebServlet("/GeneratingECard")
public class GeneratingECard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public GeneratingECard() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ECard=request.getParameter("E-Card");

		int HealthInsuranceID=Integer.parseInt(request.getParameter("HealthInsuranceID"));


		if(ECard.equals("Employee E-Card"))
		{

			try 
			{
				GeneratingEcardDAO generatePDF=new GeneratingEcardDAO();
				int result=generatePDF.createEmployeePDF(HealthInsuranceID);
				if(result==0)
				{
					response.sendRedirect("EmployeeNotExist.jsp");
				}else
				{
					response.sendRedirect("EmployeeECardGenerated.jsp");
				}

			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else
		{

			try 
			{
				GeneratingEcardDAO generatePDF=new GeneratingEcardDAO();
				int result2=generatePDF.createDependentPDF(HealthInsuranceID);
				if(result2==0)
				{
					response.sendRedirect("DependentNotExist.jsp");
				}else
				{
					response.sendRedirect("DependentECardGenerated.jsp");
				}
			}
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
	}

}
