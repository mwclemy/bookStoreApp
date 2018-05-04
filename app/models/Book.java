package models;

import java.util.HashSet;
import java.util.Set;
import io.ebean.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book extends Model {
    @Id
	public Integer id;
	public String title;
	public Integer price;
	public String author;
	
	public static Finder<Integer, Book> find = new Finder<>(Book.class);
}
