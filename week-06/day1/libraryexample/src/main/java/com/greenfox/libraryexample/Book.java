package com.greenfox.libraryexample;

public class Book {

  private static int nextId = 0;

  private int id;
  private String title;
  private String author;
  private int releaseYear;

  public Book(String title, String author, Integer releaseYear) {
    this.id = nextId++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public Book() {


  }

  public int getReleaseYear() {

    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {

    this.releaseYear = releaseYear;
  }

  public String getAuthor() {

    return author;
  }

  public void setAuthor(String author) {

    this.author = author;
  }

  public int getId() {

    return id;
  }

  public void setId(int id) {

    this.id = id;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title) {

    this.title = title;
  }
}

