package java.com.XuebiTicket;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.annotation.JsonView;
import com.march.ticketjdbc.model.*;
import com.march.ticketjdbc.service.*;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
    @Autowired
	private GetJsonStringService jsonService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "movie/currentMovieList", method = RequestMethod.GET)
	@ResponseBody
	@JsonView(JsonModule.GetMovieListModule.class)
	public Object getCurrentMovieList() {
		return jsonService.getCurrentMovieListByJson(5);
	}

	@RequestMapping(value = "movie/info", method = RequestMethod.GET)
	@ResponseBody
	@JsonView(JsonModule.GetMovieInfoModule.class)
	public Object getMovieInfo(@RequestParam("movieId") int id) {
		return jsonService.getMovieInfo(id);
	}

	@RequestMapping(value = "movie/{id}", method = RequestMethod.GET)
	@ResponseBody
	@JsonView(JsonModule.GetMovieInfoModule.class)
	public Object getMovie(@RPathVariable("id") int id) {
		return "movie";
	}


	
}
