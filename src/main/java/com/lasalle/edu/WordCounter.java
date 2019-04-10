package com.lasalle.edu;

import com.lasalle.edu.filter.FilterStrategy;
import com.lasalle.edu.show.ShowStrategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {
  private final FilterStrategy filterStrategy;
  private final ShowStrategy showStrategy;

  public WordCounter(FilterStrategy filterStrategy, ShowStrategy showStrategy) {
    this.filterStrategy = filterStrategy;
    this.showStrategy = showStrategy;
  }

  public void showCount(Text textToCount) {
    Integer result = count(textToCount);
    showStrategy.show(result.toString());
  }

  private Integer count(Text textToCount) {
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
