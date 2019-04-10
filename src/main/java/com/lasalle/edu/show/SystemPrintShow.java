package com.lasalle.edu.show;

public class SystemPrintShow implements ShowStrategy {
  @Override
  public void show(String stringToShow) {
    System.out.println(stringToShow);
  }
}
