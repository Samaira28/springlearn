package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieDao
{
	private final static Logger LOGGER = LoggerFactory.getLogger(MovieDao.class);
	public static List<Movie> Movielist = new ArrayList<Movie>();

	@Autowired
	MovieDao moviedao;

	public MovieDao() {
		LOGGER.info("Start");
		ApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
		Movielist = context.getBean("movieList", java.util.ArrayList.class);
		LOGGER.debug("Movie : {}", Movielist.toString());
		LOGGER.info("End");
	}

	public List<Movie> getMovieListAdmin() {
		return Movielist;
	}

	public List<Movie> getMovieListCustomer() {
		return Movielist;
	}

	public void toEditMovie(int id, Movie movie) {
		Movie res = findById(id);
		id = id - 1;
		if (res.equals(null)) {
			throw new EmptyFoundException();
		}
		else {
			Movielist.get(id).setTitle(movie.getTitle());
			Movielist.get(id).setActive(movie.isActive());
			Movielist.get(id).setBoxOffice(movie.getBoxOffice());
			Movielist.get(id).setDateOfLaunch(movie.getDateOfLaunch());
			Movielist.get(id).setGenre(movie.getGenre());
			Movielist.get(id).setHasTeaser(movie.getHasTeaser());
		}
	}

	public Movie findById(int mvs) {
		Movie mlist = Movielist.get(mvs);
		return mlist;
	}
}
