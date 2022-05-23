package com.omkbron.designpatterns.behavioral.memento;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class TestMemento {
  public static void main(String[] args) {
    testMemento();
  }

  private static void testMemento() {
    CareTaker careTaker = new CareTaker();
    Article article = new Article("Alberto", "Memento es un pelicula");
    article.setText(article.getText() + " de Nolan");
    System.out.println(article.getText());
    careTaker.addMemento(article.createMemento());

    article.setText(article.getText() + " protagonizada por Guy Pearce");
    System.out.println(article.getText());
    careTaker.addMemento(article.createMemento());


    article.setText(article.getText() + " y Leonardo DiCaprio");
    System.out.println(article.getText());

    ArticleMemento memento1 = careTaker.getMemento(0);
    article.restoreMemento(memento1);
    System.out.println(article.getText());

    ArticleMemento memento2 = careTaker.getMemento(1);
    article.restoreMemento(memento2);
    System.out.println(article.getText());

    article.setText(article.getText() + " del año 2050");
    System.out.println(article.getText());
  }
}
