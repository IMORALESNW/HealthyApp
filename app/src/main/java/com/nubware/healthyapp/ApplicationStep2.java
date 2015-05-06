package com.nubware.healthyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;

import org.codepond.wizardroid.WizardStep;

/**
 * Created by ACOLOR on 2015-05-02.
 */
public class ApplicationStep2 extends WizardStep {

    RadioGroup rdioTest;

    public ApplicationStep2(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.application_step2, container, false);



        return v;
    }

    @Override
    public void onExit(int exitCode){
        switch (exitCode){
            case WizardStep.EXIT_NEXT:

                int resTest;

                rdioTest = (RadioGroup) getView().findViewById(R.id.radioCancer);

               // rdioTest.getpro
                resTest = rdioTest.getCheckedRadioButtonId();


                if(resTest == R.id.radioCancerNo)
                {
                    //resTest.
                }
                else if(resTest == R.id.radioCancerYes)
                {

                }

                //bindDataFields();
                break;
            case WizardStep.EXIT_PREVIOUS:
                break;
        }
    }
}
