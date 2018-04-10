package test;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.invictus.bean.BankDetailsBean;
import com.invictus.bean.DependentBean;
import com.invictus.bean.EmployeeBean;
import com.invictus.bean.EmployeeLoginBean;


public class TestInvictus {


	public static void main(String[] args) 
	{

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			EmployeeBean employee=new EmployeeBean();
			employee.setEmployeeId(1126131);
			employee.setEmployeeName("sayali");
			employee.setDateOfBirth(new Date(25-01-1995));
			employee.setGender("F");
			employee.setEmail("nikamsayali@gmail.com");
			employee.setAlternateEmail("sayali.nikam@tcs.com");
			employee.setPhoneNumber("9435264523");
			employee.setAlternateMobileNumber("1234567890");
			employee.setPolicyStartDate(new Date(17-05-2017));
			employee.setPolicyPeriod(1);
			employee.setTotalSumInsured(1000);
			employee.setCompanyName("TCS");
			employee.setRequestSubmitDate_Time(new Date(17-05-2017));
			employee.setStatus("pending");
			employee.setApprovalDate(new Date(25-01-1995));


			EmployeeLoginBean employeeLogin=new EmployeeLoginBean(); 	

			employeeLogin.setPassword("sayali");
			employeeLogin.setEmployee(employee);

			BankDetailsBean bankDetails=new BankDetailsBean();
			bankDetails.setBankAccountNumber(123456756);
			bankDetails.setBankName("Axis Bank");
			bankDetails.setIfscCode("12345");
			bankDetails.setEmployee(employee);

			DependentBean dependent=new DependentBean();

			dependent.setBeneficiaryName("mansi");
			dependent.setDob(new Date(25-01-1995));
			dependent.setGender("F");
			dependent.setPolicyDate(new Date(25-01-2017));
			dependent.setPolicyPeriod(2);
			dependent.setTotalSumInsured(2000);
			dependent.setRequestSubmitDate_Time(new Date(25-01-2017));
			dependent.setRelation("friend");
			dependent.setStatus("pending");

			dependent.setEmployee(employee);

			Set<DependentBean> dependentSet=new HashSet<DependentBean>();
			dependentSet.add(dependent);

			employee.setDependents(dependentSet);


			employee.setLogin(employeeLogin);
			employee.setBankDetails(bankDetails);

			session.save(employee);
			session.save(bankDetails);
			session.save(employeeLogin);
			session.save(dependent);

			////////////////////////////////////////////////////////////////////////////////////////////////////////	


			EmployeeBean employee2=new EmployeeBean();
			employee2.setEmployeeId(1118450);
			employee2.setEmployeeName("pavan");
			employee2.setDateOfBirth(new Date(20-11-1995));
			employee2.setGender("M");
			employee2.setEmail("pavan.rai96@gmail.com");
			employee2.setAlternateEmail("rai.pavan@tcs.com");
			employee2.setPhoneNumber("7415507172");
			employee2.setAlternateMobileNumber("9916776676");
			employee2.setPolicyStartDate(new Date(19-05-2017));
			employee2.setPolicyPeriod(1);
			employee2.setTotalSumInsured(1000);
			employee2.setCompanyName("TCS");
			employee2.setRequestSubmitDate_Time(new Date(19-05-2017));
			employee2.setStatus("pending");
			employee2.setApprovalDate(new Date(25-01-2019));


			EmployeeLoginBean employeeLogin2=new EmployeeLoginBean(); 	

			employeeLogin2.setPassword("pavan");
			employeeLogin2.setEmployee(employee2);

			BankDetailsBean bankDetails2=new BankDetailsBean();
			bankDetails2.setBankAccountNumber(987654321);
			bankDetails2.setBankName("SC Bank");
			bankDetails2.setIfscCode("12345");
			bankDetails2.setEmployee(employee2);

			DependentBean dependent2=new DependentBean();

			dependent2.setBeneficiaryName("raman");
			dependent2.setDob(new Date(25-01-1995));
			dependent2.setGender("M");
			dependent2.setPolicyDate(new Date(25-01-2017));
			dependent2.setPolicyPeriod(2);
			dependent2.setTotalSumInsured(2000);
			dependent2.setRequestSubmitDate_Time(new Date(25-01-2017));
			dependent2.setRelation("friend");
			dependent2.setStatus("pending");

			dependent2.setEmployee(employee2);

			Set<DependentBean> dependentSet2=new HashSet<DependentBean>();
			dependentSet2.add(dependent2);

			employee2.setDependents(dependentSet2);


			employee2.setLogin(employeeLogin2);
			employee2.setBankDetails(bankDetails2);

			session.save(employee2);
			session.save(bankDetails2);
			session.save(employeeLogin2);
			session.save(dependent2);


			//////////////////////////////////////////////////////////////////////////////////////////////////	
			transaction.commit();

			System.out.println("\n\n Details Added \n");
			session.close();
			sessionFactory.close();

		} catch (HibernateException e) {
			e.printStackTrace();

		}

	}

}
