package com.lasalle.edu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text {
  private static final String SEPARATOR = " ";
  private final String content;

  public Text(String content) {
    this.content = content;
  }

  public List<String> getWords() {
    if (this.content.length() == 0) {
      return Collections.emptyList();
    }
    return Arrays.asList(this.content.split(SEPARATOR));
  }
}
