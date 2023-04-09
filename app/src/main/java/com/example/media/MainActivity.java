package com.example.media;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4;
    private TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        textView5 = findViewById(R.id.textView5);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float nota1 = Float.parseFloat(editText1.getText().toString());
                float nota2 = Float.parseFloat(editText2.getText().toString());
                float nota3 = Float.parseFloat(editText3.getText().toString());
                float nota4 = Float.parseFloat(editText4.getText().toString());
                float media = (nota1 + nota2 + nota3 + nota4) / 4;

                textView5.setText("Média: " + media);
            }
        });
    }
}
