package com.example.basicmvvmexample;

import androidx.lifecycle.MutableLiveData;

public class MathRepository {
    public MutableLiveData<String> result = new MutableLiveData<>("0");
    public void Sum(String num1 , String num2){
        int numb1 = Integer.parseInt(num1);
        int numb2 = Integer.parseInt(num2);
        int sum = numb1 + numb2;
        result.setValue(String.valueOf(sum));
    }
    public void Mult(String num1 , String num2){
        int numb1 = Integer.parseInt(num1);
        int numb2 = Integer.parseInt(num2);
        int mult = numb1 * numb2;
        result.setValue(String.valueOf(mult));
    }
}
