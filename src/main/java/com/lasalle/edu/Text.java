package com.lasalle.edu;

import com.lasalle.edu.separator.TextSeparator;

import java.util.List;

public class Text {
  private final String content;
  private TextSeparator textSeparator;

  public Text(String content, TextSeparator textSeparator) {
    this.content = content;
    this.textSeparator = textSeparator;
  }

  public List<String> getWords() {
    return textSeparator.separateText(this.content);
  }
}
