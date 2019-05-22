package com.greenfox.libraryexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

  @Controller
  public class BookController {

    List<Book> books = new ArrayList<>();

    public BookController() {
      books.add(new Book("A sajt és a kukacok", "Carlo Ginzburg", 2011));
      books.add(new Book("A történelem védelmében", "Marc Bloch", 1974));
      books.add(new Book("A rendellenesek","Michel Foucault", 2014));
      books.add(new Book("Szavak és a Dolgok", "Michel Foucault", 2000));
    }


    @RequestMapping(path = "/books/{id}/details")
    public String getBookById(Model model, @PathVariable(name = "id") Integer id) {
      Book bookById = null;

      for (Book book : books) {
        if (book.getId() == id) {
          bookById = book;
        }
      }

      if (bookById != null) {
        model.addAttribute("book", bookById);
      } else {
        model.addAttribute("error", "There is no such book");
      }
      return "details";
    }

    @RequestMapping(path = "/books",method = RequestMethod.GET)
    public String queryBooks(Model model, @RequestParam(name = "author", required =false) String author){
      List<Book> queriedBook;

      if(author != null){
        queriedBook = filterBooksByAuthor(author);
      }else{
        queriedBook = books;
      }

      model.addAttribute("books", queriedBook);
      return "index";
    }

    @RequestMapping(path = "/books/add", method = RequestMethod.GET)
    public String addBookForm(Model model, @ModelAttribute(name = "book") Book book){
      model.addAttribute("book", book);
      return "create";
    }

    @RequestMapping(path = "/books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute(name = "book") Book book){
      books.add(book);
      return "redirect:/books";
    }


    private List<Book> filterBooksByAuthor(String author){
      return books.stream()
          .filter(book -> book.getAuthor().equals(author))
          .collect(Collectors.toList());
    }
  }




