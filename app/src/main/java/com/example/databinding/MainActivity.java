package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        contact = new Contact();
        mainBinding.setContact(contact);

        mainBinding.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });

        mainBinding.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String firstName = mainBinding.fname.getText().toString();
               String lastName =mainBinding.lName.getText().toString();
                update(firstName,lastName);

            }
        });
    }
    public void update(String firstName,String lastName){
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
    }
}


