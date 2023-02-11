package com.demo.group10act2242;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    SharedPreferences sharedpreferences;
    TextView name, email, age, contnum;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Email = "emailKey";
    public static final String Age = "ageKey";
    public static final String ContactNumber = "contnumKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        name = (TextView) findViewById(R.id.etName);
        email = (TextView) findViewById(R.id.etEmail);
        age = (TextView) findViewById(R.id.etAge);
        contnum = (TextView) findViewById(R.id.etcontnum);
        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Email)) {
            email.setText(sharedpreferences.getString(Email, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));
        }
        if (sharedpreferences.contains(ContactNumber)) {
            contnum.setText(sharedpreferences.getString(ContactNumber, ""));
        }
    }

    public void Save(View view) {
        String n = name.getText().toString();
        String e = email.getText().toString();
        String a = age.getText().toString();
        String c = contnum.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Email, e);
        editor.putString(Age, a);
        editor.putString(ContactNumber, c);
        editor.apply();
    }

    public void clear(View view) {
        name = (TextView) findViewById(R.id.etName);
        email = (TextView) findViewById(R.id.etEmail);
        age = (TextView) findViewById(R.id.etAge);
        contnum = (TextView) findViewById(R.id.etcontnum);
        name.setText("");
        email.setText("");
        age.setText("");
        contnum.setText("");
    }

    public void Get(View view) {
        name = (TextView) findViewById(R.id.etName);
        age = (TextView) findViewById(R.id.etAge);
        email = (TextView) findViewById(R.id.etEmail);
        contnum = (TextView) findViewById(R.id.etcontnum);
        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
        }
        if (sharedpreferences.contains(Age)) {
            age.setText(sharedpreferences.getString(Age, ""));
        }
        if (sharedpreferences.contains(Email)) {
            email.setText(sharedpreferences.getString(Email, ""));
        }
        if (sharedpreferences.contains(ContactNumber)) {
            contnum.setText(sharedpreferences.getString(ContactNumber, ""));
        }
    }
}