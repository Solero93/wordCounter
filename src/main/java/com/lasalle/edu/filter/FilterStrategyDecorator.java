package com.lasalle.edu.filter;

import java.util.stream.Stream;

public abstract class FilterStrategyDecorator implements FilterStrategy {
  protected FilterStrategy wrapped;

  public FilterStrategyDecorator(FilterStrategy wrapped) {
    this.wrapped = wrapped;
  }

  @Override
  public Stream<String> filter(Stream<String> stream) {
    return wrapped.filter(stream);
  }
}
