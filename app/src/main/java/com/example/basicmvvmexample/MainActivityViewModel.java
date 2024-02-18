package com.example.basicmvvmexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public MutableLiveData<String> result;
    public MathRepository mrepo = new MathRepository();
    public MainActivityViewModel(){
        result = mrepo.result;
    }
    public void Sum(String num1 , String num2){
        mrepo.Sum(num1,num2);
    }
    public void Mult(String num1 , String num2){
        mrepo.Mult(num1,num2);
    }
}
