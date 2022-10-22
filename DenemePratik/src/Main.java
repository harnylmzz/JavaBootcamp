import buisness.CustomerManager;
import buisness.EmployeeManager;
import dataAccess.CustomerDao;
import dataAccess.HibernateEmployeeDao;
import dataAccess.JdbcCustomerDao;
import entities.Customer;
import entities.Employee;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*entities create field*/
		
		Customer customer1 = new Customer("123123123123", "Harun", "Yılmaz");
		Employee employee1 = new Employee("Harun", "Yılmaz",1200);
		
		
		
		/*logger create field*/
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };
		
		
		/* manager create and add field */
		
		CustomerManager customerManager = new CustomerManager(new JdbcCustomerDao(), loggers);
		customerManager.add(customer1);
		
		EmployeeManager employeeManager = new EmployeeManager(new HibernateEmployeeDao(), loggers);
		employeeManager.add(employee1);
		
		

	}

}
