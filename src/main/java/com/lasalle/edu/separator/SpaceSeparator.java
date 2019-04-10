package com.lasalle.edu.separator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpaceSeparator implements TextSeparator {
  private static final String SPACE_DELIMITER = " ";

  @Override
  public List<String> separateText(String text) {
    if (text.length() == 0) {
      return Collections.emptyList();
    }
    return Arrays.asList(text.split(SPACE_DELIMITER));
  }
}
