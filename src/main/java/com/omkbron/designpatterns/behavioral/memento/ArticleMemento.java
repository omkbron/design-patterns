package com.omkbron.designpatterns.behavioral.memento;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class ArticleMemento {
  private String author;
  private String text;

  public ArticleMemento(String author, String text) {
    this.author = author;
    this.text = text;
  }

  public String getAuthor() {
    return author;
  }

  public String getText() {
    return text;
  }
}
