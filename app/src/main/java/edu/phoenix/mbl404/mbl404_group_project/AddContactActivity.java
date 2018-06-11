package edu.phoenix.mbl404.mbl404_group_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {

    private TextView evClinic, evLocation, evStatus, evWebsite, evCall;
    Button add_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        evClinic = findViewById(R.id.evClinic);
        evLocation = findViewById(R.id.evLocation);
        evStatus = findViewById(R.id.evStatus);
        evWebsite = findViewById(R.id.evWebsite);
        evCall = findViewById(R.id.evCall);
        add_btn = findViewById(R.id.add_btn2);


        evClinic.setText("");
        evLocation.setText("");
        evStatus.setText("");
        evWebsite.setText("");
        evCall.setText("");

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contacts.addItem(new RolodexLoader(evClinic.getText().toString(),
                        evLocation.getText().toString(), evStatus.getText().toString(),
                        evWebsite.getText().toString(), Long.parseLong(evCall.getText().toString())));
                startActivity(new Intent(AddContactActivity.this, MainActivity.class));
                Toast.makeText(AddContactActivity.this, "Added Record to Rolodex", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
