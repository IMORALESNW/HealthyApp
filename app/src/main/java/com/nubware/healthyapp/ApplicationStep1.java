package com.nubware.healthyapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

/**
 * Created by ACOLOR on 2015-04-03.
 */
public class ApplicationStep1 extends WizardStep {
    @ContextVariable
    private String firstname;
    @ContextVariable
    private String lastname;
    @ContextVariable
    private String profession;

    EditText firstNameEt;
    EditText lastNameEt;
    EditText professionEt;
    //Otros controles
    Spinner provincesSpin;

    Boolean firstNameFlag = false;
    Boolean lastNameFlag = false;

    public ApplicationStep1(){}

    private void fillProvinces(Spinner dropProvinces){

    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {
            activateNext();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.application_step1, container, false);

        firstNameEt = (EditText) v.findViewById(R.id.txtFirstName);
        lastNameEt = (EditText) v.findViewById(R.id.txtLastName);
        professionEt = (EditText) v.findViewById(R.id.txtProfession);
        //Otros Controles
        provincesSpin = (Spinner) v.findViewById(R.id.dropProvince);

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.provinces_array, android.R.layout.simple_spinner_item);

        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //provincesSpin.setAdapter(adapter);

        firstNameEt.setText(firstname);
        lastNameEt.setText(lastname);
        professionEt.setText(profession);

        //firstNameEt.addTextChangedListener(textWatcher);
        //lastNameEt.addTextChangedListener(textWatcher);

        return v;
    }

    @Override
    public void onExit(int exitCode){
        switch (exitCode){
            case WizardStep.EXIT_NEXT:
                bindDataFields();
                break;
            case WizardStep.EXIT_PREVIOUS:
                break;
        }
    }

    private void bindDataFields(){
        firstname = firstNameEt.getText().toString();
        lastname = lastNameEt.getText().toString();
        profession = professionEt.getText().toString();
    }

    private void activateNext(){
        if (firstNameEt.getText().length() > 0 && lastNameEt.getText().length() > 0){
           notifyCompleted();
        }
        else{
            notifyIncomplete();
        }
    }
}
