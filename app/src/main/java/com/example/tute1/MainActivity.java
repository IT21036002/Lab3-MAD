package com.example.tute1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tute1.data.Message;

public class MainActivity extends AppCompatActivity {

    EditText editmessage;
    Button btnSend;
    Message message;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editmessage= findViewById(R.id.editmessage);
        btnSend= findViewById(R.id.btnSend);
        message= new Message();

        public void displayMessage(View view){
            message.setMessage(editmessage.getText().toString());
            Toast.makeText(this,message.getMessage(),Toast.LENGTH_LONG).show();





        }


    }
}