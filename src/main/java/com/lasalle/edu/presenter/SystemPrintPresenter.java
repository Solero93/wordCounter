package com.lasalle.edu.presenter;

import com.lasalle.edu.presentable.Presentable;

public class SystemPrintPresenter implements Presenter {
  @Override
  public void present(Presentable objectToPresent) {
    String presentation = objectToPresent.convertForPresentation();
    System.out.println(presentation);
  }
}
