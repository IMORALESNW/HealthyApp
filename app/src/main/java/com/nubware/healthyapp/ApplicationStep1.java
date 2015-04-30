package com.nubware.healthyapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
    @ContextVariable
    private String street;
    @ContextVariable
    private String city;
    @ContextVariable
    private String province;
    @ContextVariable
    private String postalcode;
    @ContextVariable
    private String homephone;
    @ContextVariable
    private String workphone;
    @ContextVariable
    private String mobile;
    @ContextVariable
    private String email;
    @ContextVariable
    private String receiveinfo;

    EditText firstNameEt;
    EditText lastNameEt;
    EditText professionEt;
    EditText streetEt;
    EditText cityEt;
    Spinner provincesSpin;
    EditText postalcodeEt;
    EditText homephoneEt;
    EditText workphoneEt;
    EditText mobileEt;
    EditText emailEt;

    Boolean firstNameFlag = false;
    Boolean lastNameFlag = false;

    public ApplicationStep1(){}

    /*private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {
            activateNext();
        }
    };*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.application_step1, container, false);

        firstNameEt = (EditText) v.findViewById(R.id.txtFirstName);
        lastNameEt = (EditText) v.findViewById(R.id.txtLastName);
        professionEt = (EditText) v.findViewById(R.id.txtProfession);
        streetEt = (EditText) v.findViewById(R.id.txtStreet);
        cityEt = (EditText) v.findViewById(R.id.txtCity);
        provincesSpin = (Spinner) v.findViewById(R.id.dropProvince);
        postalcodeEt = (EditText) v.findViewById(R.id.txtPostalCode);
        homephoneEt = (EditText) v.findViewById(R.id.txtHomePhone);
        workphoneEt = (EditText) v.findViewById(R.id.txtWorkPhone);
        mobileEt = (EditText) v.findViewById(R.id.txtMobile);
        emailEt = (EditText) v.findViewById(R.id.txtEmail);

        firstNameEt.setText(firstname);
        lastNameEt.setText(lastname);
        professionEt.setText(profession);
        streetEt.setText(street);
        cityEt.setText(city);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity().getApplicationContext(), R.array.provinces_array, R.layout.spinner_item);

        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);

        provincesSpin.setAdapter(adapter);

        postalcodeEt.setText(postalcode);
        homephoneEt.setText(homephone);
        workphoneEt.setText(workphone);
        mobileEt.setText(mobile);
        emailEt.setText(email);

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
        street = streetEt.getText().toString();
        city = cityEt.getText().toString();
        //province = provincesSpin.getSelectedItem().toString(); //???????
        postalcode = postalcodeEt.getText().toString();
        homephone = homephoneEt.getText().toString();
        workphone = workphoneEt.getText().toString();
        mobile = mobileEt.getText().toString();
        email = emailEt.getText().toString();
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
