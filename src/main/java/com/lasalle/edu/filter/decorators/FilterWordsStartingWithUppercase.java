package com.lasalle.edu.filter.decorators;

import com.lasalle.edu.filter.FilterStrategy;
import com.lasalle.edu.filter.FilterStrategyDecorator;

import java.util.stream.Stream;

public class FilterWordsStartingWithUppercase extends FilterStrategyDecorator {
  public FilterWordsStartingWithUppercase(FilterStrategy wrapped) {
    super(wrapped);
  }

  @Override
  public Stream<String> filter(Stream<String> stream) {
    return wrapped.filter(stream)
        .filter((elem) -> elem.charAt(0) == elem.toUpperCase().charAt(0));
  }
}
