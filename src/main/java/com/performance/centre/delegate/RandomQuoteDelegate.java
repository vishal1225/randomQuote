package com.performance.centre.delegate;

import java.util.Random;

import com.performance.centre.dao.IBusinessDao;
import com.performance.centre.model.IModel;

public class RandomQuoteDelegate implements IBusinessDelegate {
	private IBusinessDao randomQuoteDao;

	public IBusinessDao getRandomQuoteDao() {
		return randomQuoteDao;
	}

	public void setRandomQuoteDao(IBusinessDao randomQuoteDao) {
		this.randomQuoteDao = randomQuoteDao;
	}

	public IModel execute() {
		Random random=new Random();
		int quoteId=random.nextInt((6-0)+1);
		return randomQuoteDao.fetch(quoteId);
	}
	
	

}
