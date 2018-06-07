package com.example.kevin.mvp_example.Calculator.presenter;

import com.example.kevin.mvp_example.Calculator.model.CalculatorModel;
import com.example.kevin.mvp_example.Calculator.model.Model;
import com.example.kevin.mvp_example.Calculator.view.View;

public class CalculatorPresenter implements Presenter {

    private View view;
    private Model model;

    public CalculatorPresenter(View view){
        this.view = view;
        model = new CalculatorModel(this);

    }

    @Override
    public void showResult(String result) {

        if (view!=null){
            view.showResult(result);
        }

    }

    @Override
    public void operationSuma(String n1, String n2) {
        if (view!=null){

            model.operationSuma(n1,n2);
        }

    }



    @Override
    public void showError(String error) {
        if (view!=null){
            view.showError(error);
        }
    }
}
