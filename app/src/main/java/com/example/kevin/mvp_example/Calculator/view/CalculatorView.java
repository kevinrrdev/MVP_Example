package com.example.kevin.mvp_example.Calculator.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kevin.mvp_example.Calculator.presenter.CalculatorPresenter;
import com.example.kevin.mvp_example.Calculator.presenter.Presenter;
import com.example.kevin.mvp_example.R;

public class CalculatorView extends AppCompatActivity implements View {

    private EditText mEtN1,mEtN2;
    private Button mBtnCalculator;
    private TextView mTvResultado;

    private Presenter presenter;
    private String n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.kevin.mvp_example.R.layout.activity_calculator_view);
        mEtN1 = findViewById(R.id.etN1);
        mEtN2 = findViewById(R.id.etN2);
        mTvResultado = findViewById(R.id.tvResultado);

        mBtnCalculator = findViewById(R.id.btnCalcular);

        presenter =new CalculatorPresenter(this);

        setUp();




    }

    void setUp(){
        mBtnCalculator.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                getData();
                presenter.operationSuma(n1,n2);

            }
        });
    }

    void getData(){
        n1 = mEtN1.getText().toString();

        n2 = mEtN2.getText().toString();
    }


    @Override
    public void showResult(String result) {
        mTvResultado.setText(result);

    }

    @Override
    public void showError(String error) {
        mTvResultado.setText(error);
    }
}
