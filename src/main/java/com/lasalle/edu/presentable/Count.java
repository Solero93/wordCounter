package com.lasalle.edu.presentable;

public class Count implements Presentable {
  private Integer count;

  public Count(Integer count) {
    this.count = count;
  }

  @Override
  public String convertForPresentation() {
    return count.toString();
  }
}
