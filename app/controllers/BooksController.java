package controllers;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import views.html.Books.*;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import models.Book;
public class BooksController  extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	// For all books
	
	public Result index() {
		List<Book> books = Book.find.all();
		return ok(index.render(books));
		
	}
	
	// To create book
	
	public Result create() {
		
		Form<Book> bookForm = formFactory.form(Book.class);
		
		return ok(create.render(bookForm));
	}
	
	public Result save() {
		Form<Book> formBook = formFactory.form(Book.class).bindFromRequest();
		Book book = formBook.get();
		book.save();
		return redirect(routes.BooksController.index());
	}
	public Result edit(Integer id) {
		Book book = Book.find.byId(id);
		if(book == null) {
			return notFound("Book Not Found");
		}
		Form<Book> formBook = formFactory.form(Book.class).fill(book);
		return ok(edit.render(formBook));
	}
	
	public Result update() {
		Form<Book> formBook = formFactory.form(Book.class).bindFromRequest();
		Book book = formBook.get();
		Book oldBook = Book.find.byId(book.id);
		if (oldBook == null) {
			return notFound("Book Not Found");
		}
		oldBook.id = book.id; 
		oldBook.title = book.title;
		oldBook.price = book.price;
		oldBook.author = book.author;
		oldBook.update();
		return redirect(routes.BooksController.index());
	}
	public Result destroy(Integer id) {
		Book book = Book.find.byId(id);
		if (book == null) {
			return notFound("Book Not Found");
		}
		book.delete();
		return redirect(routes.BooksController.index());
	}
	
	// For book details
	public Result show(Integer id) {
		Book book = Book.find.byId(id);
		if (book == null) {
			return notFound("Book Not Found");
		}
		return ok(show.render(book));
	}

}
