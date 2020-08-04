package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.moviecruiser.model.Favorites;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class FavoritesDao {
	private final static Logger LOGGER = LoggerFactory.getLogger(FavoritesDao.class);
	public static ArrayList<Favorites> flist = new ArrayList<Favorites>();
	List<Movie> movie = new ArrayList<Movie>();
	
	@Autowired
	FavoritesDao favoriteDao;
	
	@Autowired
	MovieDao movieDao;

	public void addToFavorite(int movieId) {
		
		int id = flist.size();
		
		Favorites fav = new Favorites(id,1,movieId);
		flist.add(fav);
		
		for (Favorites favourites : flist) 
		{
			Movie movie1 = movieDao.findById(favourites.getMvs());
			
			if(!movie.contains(movie1)) 
				movie.add(movie1);
			LOGGER.debug("fav: {}", flist.toString());
		}
		LOGGER.debug("fav: {}", flist.toString());
	}
	
	public List<Movie> getFavoriteM(int userId) throws EmptyFoundException 
	{
		return movie;
	}
	
	public void removeFavorites(int movieId) 
	{
	    int count = 0;
		for(Movie mo:movie) {
			if(mo.getId() == movieId) 
					movie.remove(count);
			 else 
				count++;
			}
		LOGGER.debug("fav: {}", flist.toString());
	}
}
