package kodlama.io.processing;

import kodlama.io.dataAcces.ICategoryDoa;
import kodlama.io.entities.Category;
import kodlama.io.Logging.Logger;

public class CategoryManager {
	private ICategoryDoa categoryDoa;
	private Logger[] loggers;
	
	public CategoryManager(ICategoryDoa categoryDoa, Logger[] loggers) {
		this.categoryDoa = categoryDoa;
		this.loggers = loggers;
	}
	public void add(Category category) throws Exception {
		if(category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("BU KATEGORİ ADI DAHA ÖNCE KULLANILMIŞ!");
		}
	
		categoryDoa.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
			
		}
	

	}
	}
