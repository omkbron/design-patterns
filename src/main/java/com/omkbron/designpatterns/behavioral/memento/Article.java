package com.omkbron.designpatterns.behavioral.memento;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class Article {
  private String author;
  private String text;

  public Article(String author, String text) {
    this.author = author;
    this.text = text;
  }

  public ArticleMemento createMemento() {
    return new ArticleMemento(author, text);
  }

  public void restoreMemento(ArticleMemento articleMemento) {
    this.author = articleMemento.getAuthor();
    this.text = articleMemento.getText();
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
