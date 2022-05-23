package com.omkbron.designpatterns.behavioral.iterator;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface Iterator {
  boolean hasNext();
  Object next();
  Object currentItem();
}
