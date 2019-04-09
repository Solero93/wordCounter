package com.lasalle.edu;

import com.lasalle.edu.filter.FilterStrategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {
  private final FilterStrategy filterStrategy;

  public WordCounter(FilterStrategy filterStrategy) {
    this.filterStrategy = filterStrategy;
  }

  private int count(Text textToCount) {
    List<String> wordsInText = textToCount.getWords();

    Stream<String> wordsInTextStream = wordsInText.stream();

    List<String> filteredWords = filterStrategy
        .filter(wordsInTextStream)
        .collect(Collectors.toList());

    return filteredWords.size();
  }

  public void showCount(Text textToCount) {
    int result = count(textToCount);
    System.out.println(result);
  }
}
