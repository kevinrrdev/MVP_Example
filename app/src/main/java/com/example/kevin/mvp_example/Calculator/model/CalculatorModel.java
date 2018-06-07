package com.example.kevin.mvp_example.Calculator.model;

import com.example.kevin.mvp_example.Calculator.presenter.Presenter;

public class CalculatorModel implements Model{

    private Presenter presenter;
    private double result;
    private double mN1,mN2;

    public CalculatorModel(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void operationSuma(String n1,String n2) {

        if (getData(n1,n2)){
            result = mN1+mN2;

            presenter.showResult(String.valueOf(result));
        }

    }

    boolean getData(String n1,String n2){
        boolean bok = false;

        if(n1!=""){
            mN1 = Double.valueOf(n1);
        }else{
            presenter.showError("Ingresar el primer número");
        }

        if(n2!=""){
            mN2 = Double.valueOf(n2);
        }else{
            presenter.showError("Ingresar el segundo número");
        }

        if (mN1>=0 && mN2>=0){
            bok = true;
        }else {
            presenter.showError("Los números deben ser mayor a 0");
        }

        return bok;
    }
}
