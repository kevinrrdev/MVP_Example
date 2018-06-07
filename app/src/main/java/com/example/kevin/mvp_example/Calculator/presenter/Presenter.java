package com.example.kevin.mvp_example.Calculator.presenter;

public interface Presenter {

    void showResult(String result);

    void operationSuma(String n1,String n2);

    void showError(String error);
}
