package buisness;

import dataAccess.CustomerDao;
import entities.Customer;
import logging.Logger;

public class CustomerManager {

	private CustomerDao customerDao;
	private Logger[] loggers;

	public CustomerManager(CustomerDao customerDao, Logger[] loggers) {
		this.customerDao = customerDao;
		this.loggers = loggers;

	}

	public void add(Customer customer) throws Exception {

		if (customer.getTc() == "12312312312") {
			throw new Exception("HATA! Her müşterinin tek bir TC'si olabilir.");

		}
		
		customerDao.add(customer);
		
		for (Logger logger : loggers) {
			logger.log(customer.getName());
		}
	}

}
