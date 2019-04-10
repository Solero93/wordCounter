package com.lasalle.edu.filter.decorators;

import com.lasalle.edu.filter.FilterStrategy;
import com.lasalle.edu.filter.FilterStrategyDecorator;

import java.util.stream.Stream;

public class FilterWordsWithMoreThanTwoCharacters extends FilterStrategyDecorator {
  public FilterWordsWithMoreThanTwoCharacters(FilterStrategy wrapped) {
    super(wrapped);
  }

  @Override
  public Stream<String> filter(Stream<String> stream) {
    return wrapped.filter(stream)
        .filter((elem) -> elem.length() > 2);
  }
}
