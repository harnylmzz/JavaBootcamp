package buisness;

import dataAccess.EmployeeDao;
import entities.Employee;
import logging.Logger;

public class EmployeeManager {
	
		private EmployeeDao employeeDao;
		private Logger [] loggers;
		
		 
		public EmployeeManager (EmployeeDao employeeDao,Logger [] loggers ) {
			
			this.employeeDao = employeeDao;
			this.loggers = loggers;
		}

		
		public void add (Employee employee) throws Exception {
			
			if (employee.getWage()<1200) {
			throw new Exception ("HATA! Çalışanın maaşı 1200 TL'den az olamaz!"); 
			}
			
			employeeDao.add(employee);
			
			for (Logger logger : loggers) {
				logger.log(employee.getName());
				
			}
		}
		
	
}
