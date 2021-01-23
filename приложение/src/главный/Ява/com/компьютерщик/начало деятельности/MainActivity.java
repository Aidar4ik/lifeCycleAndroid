
package com.geektech.startactivityhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textVie;
    EditText editText1, editText2, editText3;
    private int a, b, c, sum;
    private String KEY = "key";
    private String s="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        textVie = findViewById(R.id.textView);
        editText1 = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);
        editText3 = findViewById(R.id.et3);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(editText1.getText() == null && editText2.getText() == null && editText3.getText() == null)) {
                    a = Integer.parseInt(editText1.getText().toString());
                    b = Integer.parseInt(editText2.getText().toString());
                    c = Integer.parseInt(editText3.getText().toString());
                    sum = (a + b) / c;
                    s= String.valueOf(sum);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY, s);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        s=savedInstanceState.getString(KEY);
        textVie.setText(s);
    }
}
