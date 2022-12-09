package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText text_field;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_symbol_1;
    Button button_symbol_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // устанавливаем в качестве интерфейса файл activity_main.xml
        setContentView(R.layout.activity_main);

        // получаем элемент c id - editTextPhone
        this.text_field = findViewById(R.id.editTextPhone);

        // получаем все кнопки
        this.button0 = findViewById(R.id.button0);
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
        this.button9 = findViewById(R.id.button9);
        this.button_symbol_1 = findViewById(R.id.button_symbol_1);
        this.button_symbol_2 = findViewById(R.id.button_symbol_2);
    }

    // обработка нажатия на числовую кнопку
    public void onButtonClick(View view){

        Button button = (Button)view;
        this.text_field.append(button.getText());
    }

    // обработка нажатия на кнопку операции
    public void onOperationClick(View view){

        ;
    }
}