package com.lasalle.edu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text {
  private static final String SEPARATOR = " ";
  private final String text;

  public Text(String text) {
    this.text = text;
  }

  public List<String> getWords() {
    if (this.text.length() == 0) {
      return Collections.emptyList();
    }
    return Arrays.asList(this.text.split(SEPARATOR));
  }
}
