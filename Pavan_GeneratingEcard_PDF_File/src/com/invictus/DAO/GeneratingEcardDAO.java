package com.invictus.DAO;
import java.awt.Desktop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.DocumentException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.invictus.bean.DependentBean;
import com.invictus.bean.EmployeeBean;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;

import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratingEcardDAO {


	public int createEmployeePDF(int empHid) throws MalformedURLException, IOException {
		int temp=0;

		ArrayList<EmployeeBean> arrayList=new ArrayList<EmployeeBean>();
		try {

			System.out.println("inside try createEmplyeePdf method");
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			Query query=session.createQuery("from EmployeeBean where empHid='"+empHid+"'");//here persistent class name is EmployeeBean
			ArrayList list=(ArrayList) query.list();
			Iterator itr=list.iterator();
			while(itr.hasNext()){
				EmployeeBean employeeBean	=	(EmployeeBean)itr.next();
				temp=1;
				Document document=new Document();
				try {
					PdfWriter.getInstance(document, new FileOutputStream("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//E- Card Folder//Employee E-Card//"+empHid+" E-Card.pdf"));
					document.open();
					Image img = Image.getInstance("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//pavan.png");
					img.setAlignment(Image.MIDDLE);
					document.add(img);
					Font font=new Font();
					font.setStyle(Font.BOLD);
					font.setSize(25);

					document.add(new Paragraph("                        Employee E-Card\n\n",font));
					Paragraph paragraph=new Paragraph();
					paragraph.setAlignment(Element.ALIGN_CENTER);
					PdfPTable table=new PdfPTable(2);	

					table.addCell("Baneficiary Name");
					table.addCell(employeeBean.getEmployeeName());

					table.addCell("Health Insurance Id");
					int emphid=employeeBean.getEmpHid();
					table.addCell(" "+emphid+" ");

					table.addCell("Employee Id");
					int empId=employeeBean.getEmployeeId();
					table.addCell(" "+empId+" ");

					table.addCell("Date Of Birth");
					Date empDOB=employeeBean.getDateOfBirth();
					table.addCell(" "+empDOB+" ");

					table.addCell("Primary Insured");
					table.addCell(employeeBean.getEmployeeName());

					paragraph.add("\nContact Details  :  0755-205689,0755-326598\n");
					paragraph.add("Toll Free No   :   011-654598,011-325478");

					document.add(table);
					document.add(paragraph);
					document.close();


				} catch (FileNotFoundException e) {
					System.out.print("inside catch file not found");

					e.printStackTrace();
				} catch (com.itextpdf.text.DocumentException e) {
					System.out.print("inside catch text document");
					e.printStackTrace();
				}

				try
				{
					Desktop.getDesktop().open(new File("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//E- Card Folder//Employee E-Card//"+empHid+" E-Card.pdf"));

				}catch(Exception e)
				{
					System.out.println(e);
				}

			}
			transaction.commit();
			session.close();
			sessionFactory.close();
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
		}

		if(temp==0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public int createDependentPDF(int dependentHid) throws MalformedURLException, IOException{

		int temp=0;
		ArrayList<DependentBean> arrayList=new ArrayList<DependentBean>();
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			Query query=session.createQuery("from DependentBean where dependentHid='"+dependentHid+"'");//here persistent class name is DependentBean
			ArrayList list=(ArrayList) query.list();
			Iterator itr=list.iterator();
			while(itr.hasNext()){
				DependentBean dependentBean	=	(DependentBean)itr.next();
				temp=1;
				Document document=new Document();
				try {
					PdfWriter.getInstance(document, new FileOutputStream("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//E- Card Folder//Dependent E-Card//"+dependentHid+" E-Card.pdf"));
					document.open();

					Image img = Image.getInstance("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//pavan.png");
					img.setAlignment(Image.MIDDLE);
					document.add(img);        			

					Font font=new Font();
					font.setStyle(Font.BOLD);
					font.setSize(25);

					document.add(new Paragraph("                        Dependent E-Card\n\n",font));
					Paragraph paragraph=new Paragraph();
					paragraph.setAlignment(Element.ALIGN_CENTER);

					PdfPTable table=new PdfPTable(2);	

					table.addCell("Baneficiary Name");
					table.addCell(dependentBean.getBeneficiaryName());

					table.addCell("Health Insurance Id");
					int dependenthid=dependentBean.getDependentHid();
					table.addCell(" "+dependenthid+" ");

					table.addCell("Employee Id");
					int dependentEmpId=dependentBean.getEmployee().getEmployeeId();
					table.addCell(" "+dependentEmpId+" ");

					table.addCell("Date Of Birth");
					Date dependentDOB=dependentBean.getDob();
					table.addCell(" "+dependentDOB+" ");

					table.addCell("Primary Insured");
					table.addCell(dependentBean.getEmployee().getEmployeeName());

					paragraph.add("\nContact Details  :  0755-205689,0755-326598\n");
					paragraph.add("Toll Free No   :   011-654598,011-325478");

					document.add(table);
					document.add(paragraph);
					document.close();

				} catch (FileNotFoundException e) {
					System.out.print("inside catch file not found");

					e.printStackTrace();
				} catch (com.itextpdf.text.DocumentException e) {
					System.out.print("inside catch text document");
					e.printStackTrace();
				}


				try
				{
					Desktop.getDesktop().open(new File("C://Users//1118450//Desktop//web_workSpace//Pavan_Final_generatingEcard//E- Card Folder//Dependent E-Card//"+dependentHid+" E-Card.pdf"));

				}catch(Exception e)
				{
					System.out.println(e);
				}

			}

			transaction.commit();
			session.close();
			sessionFactory.close();
		}
		catch (HibernateException e) {
			System.out.println(e.getMessage());
		}

		if(temp==0)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}

}
