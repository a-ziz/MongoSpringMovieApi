package dev.aziz.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// @Document - represents each document in the "movies" collection
@Document(collection = "movies")
// @Data - (from Lombok) takes care of getters, setters, toString and constructors
@Data
// @AllArgsConstructor - creates constructor that takes all private fields as arguments
@AllArgsConstructor
// @NoArgsConstructor - creates constructor that takes no constructors at all
@NoArgsConstructor
public class Movie {

  // @Id - represents unique Id for each movie in the database
  @Id
  private ObjectId id;
  private String imdbId;
  private String title;
  private String releaseDate;
  private String trailerLink;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;
//  private List<Review> reviewIds; // embedded relationship - all the reviews related to this movie will be added to the List of reviews
//  this is fine for one-to-many relationship

  // @DocumentReference - cause database to store only the Ids of the review, but the reviews will be stored in a separate collection
  // known as manual reference relationship
  @DocumentReference
  private List<Review> reviewIds;
}
