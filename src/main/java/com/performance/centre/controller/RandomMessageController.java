package com.performance.centre.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.performance.centre.delegate.IBusinessDelegate;
import com.performance.centre.model.Quote;

@Controller
@Scope("session")
public class RandomMessageController {
	public static final String RANDOM_QUOTE = "randomQuote";
	private IBusinessDelegate randomQuoteDelegate;
	private Integer counter;

	public void setRandomQuoteDelegate(IBusinessDelegate randomQuoteDelegate) {
		this.randomQuoteDelegate = randomQuoteDelegate;
	}

	@RequestMapping(value = "/randomQuote", method = RequestMethod.GET)
	public ModelAndView getQuote(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView(RANDOM_QUOTE);
		counter = (Integer) request.getSession().getAttribute("counter");
		if (null != counter) {
			counter = counter + 1;
			
		} else {
			counter =1;
		}
		request.getSession().setAttribute("counter", counter);
		model.addObject("isSeventhTime", isSeventhTime(counter));
		Quote quote = (Quote) randomQuoteDelegate.execute();
		model.addObject("quote", quote);
		return model;
	}

	private boolean isSeventhTime(int counter) {

		return (counter % 7 == 0 && counter!=0) ? true : false;
	}
}
