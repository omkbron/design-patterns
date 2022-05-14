package com.omkbron.designpatterns.creational.abstractfactory;

/**
 * @author Omar Velasco - omvp29@gmail.com
 */
public interface AbstractFactory<T> {
  T create(String type);
}
