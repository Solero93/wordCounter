package com.lasalle.edu.filter.decorators;

import com.lasalle.edu.filter.FilterStrategyDecorator;
import com.lasalle.edu.filter.FilterStrategy;

import java.util.stream.Stream;

public class FilterStartsWithVowel extends FilterStrategyDecorator {
  private static final String ALL_LOWERCASE_VOWELS = "aeiou";

  public FilterStartsWithVowel(FilterStrategy wrapped) {
    super(wrapped);
  }

  @Override
  public Stream<String> filter(Stream<String> stream) {
    return wrapped.filter(stream)
        .filter((elem) -> ALL_LOWERCASE_VOWELS.indexOf(elem.toLowerCase().charAt(0)) > -1);
  }
}
