package com.lasalle.edu.filter;

import java.util.stream.Stream;

public interface FilterStrategy {
  Stream<String> filter(Stream<String> stream);
}
