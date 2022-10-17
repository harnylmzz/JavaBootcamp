package Kodlama.io.buisness;

import Kodlama.io.core.logging.Logger;
import Kodlama.io.dataAccess.CategoryDao;
import Kodlama.io.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers2;
	
	
	public CategoryManager (CategoryDao categoryDao, Logger[] loggers2 ) {
		
		this.categoryDao = categoryDao;
		this.loggers2 = loggers2; 
		
	}
	
	
	public void add (Category category ) throws Exception {
		
		if (category.getCode() > 2) {
			throw new Exception("HATA! Kategori kodu 2'den küçük olamaz.");
		} 
		categoryDao.add(category);
		
		for (Logger logger : loggers2) {
			logger.log(category.getName());
		}
	}
}
