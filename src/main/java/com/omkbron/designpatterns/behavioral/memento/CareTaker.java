package com.omkbron.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public class CareTaker {
  private List<ArticleMemento> mementos = new ArrayList<>();

  public void addMemento(ArticleMemento articleMemento) {
    mementos.add(articleMemento);
  }

  public ArticleMemento getMemento(int index) {
    return mementos.get(index);
  }
}
