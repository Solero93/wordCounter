package com.lasalle.edu.filter.strategies;

import com.lasalle.edu.filter.FilterStrategy;

import java.util.stream.Stream;

public class NoFilter implements FilterStrategy {
  @Override
  public Stream<String> filter(Stream<String> stream) {
    return stream;
  }
}
