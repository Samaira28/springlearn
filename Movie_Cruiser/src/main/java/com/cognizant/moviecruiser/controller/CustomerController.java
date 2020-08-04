package com.cognizant.moviecruiser.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.moviecruiser.dao.EmptyFoundException;
import com.cognizant.moviecruiser.dao.FavoritesDao;
import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	MovieDao movieDaoSqlImpl;
	
	@Autowired
	FavoritesDao favDaoSqlImpl;
	
	static List<Movie> customerlist;
	List<Movie> listf = null;
	
	@GetMapping("/movielist")
	public List<Movie> getMainPage()
	{
		customerlist = movieDaoSqlImpl.getMovieListCustomer();
		return customerlist ;
	}
	
	@GetMapping("/favlist")
	public List<Movie> showFav() {
			listf = favDaoSqlImpl.getFavoriteM(1);
			if(listf.equals(null))
			{
				throw new EmptyFoundException();
			}
			return listf;
		}
		
	@PostMapping("/addtofav/{id}")
	public void addedToFav(@PathVariable int id)
	{
		id=id-1;
		favDaoSqlImpl.addToFavorite(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteItem(@PathVariable int id )
	{
		favDaoSqlImpl.removeFavorites(id);
		}
}
