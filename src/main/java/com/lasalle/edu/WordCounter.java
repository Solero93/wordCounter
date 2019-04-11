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

  public Integer count(Text textToCount) {
    List<String> wordsInText = textToCount.getWords();
    List<String> filteredWords = applyFilterStrategy(wordsInText);
    return filteredWords.size();
  }

  private List<String> applyFilterStrategy(List<String> words) {
    Stream<String> wordsStream = words.stream();

    return filterStrategy
        .filter(wordsStream)
        .collect(Collectors.toList());
  }
}
