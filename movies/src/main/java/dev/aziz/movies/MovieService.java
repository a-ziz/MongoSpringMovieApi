package dev.aziz.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
  // write database access methods

  // @Autowired - let framework know to instantiate this class for us
  @Autowired
  private MovieRepository movieRepository;
  public List<Movie> allMovies(){
    return movieRepository.findAll();
  }
}
