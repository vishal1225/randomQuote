package com.performance.centre.dao;

import java.util.ArrayList;
import java.util.List;

import com.performance.centre.model.IModel;
import com.performance.centre.model.Quote;

public class RandomQuoteDao implements IBusinessDao{
	private static List<Quote> quoteList=new ArrayList<Quote>();
	static{
		quoteList.add(new Quote("Oliver Herford","A woman's mind is more cleaner than a man's: she changes it too often.","Other"));
		quoteList.add(new Quote("Elbert Hubbard","Do you take life too seriously. You will never get out of it alive.","Other"));
		quoteList.add(new Quote("Mark Twain","Loyalty to country ALWAYS. Loyalty to government, when it deserves it.","Politics"));
		quoteList.add(new Quote("Groucho Marx","Politics is the art of looking for trouble, finding it everywhere, diagnosing it incorrectly and applying the wrong remedies.","Politics"));
		quoteList.add(new Quote("Stanley Milgram","The disappearance of a sense of responsibility is the most far-reaching consequence of submission to authority.","Psychology"));
		quoteList.add(new Quote("Lewis Carroll","It’s no use going back to yesterday, because I was a different person then.","Philosophy"));
		quoteList.add(new Quote("C.S. Lewis","Hardship often prepares an ordinary person for an extraordinary destiny","Philosphy"));
	}

	public IModel fetch(int quoteId) {
		return quoteList.get(quoteId);
	}

}
