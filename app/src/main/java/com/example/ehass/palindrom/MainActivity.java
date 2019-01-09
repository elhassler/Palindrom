package com.example.ehass.palindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//hkjh
    TextView str;
    Button btn;
    TextView erg;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = (TextView) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        erg = (TextView) findViewById(R.id.textView2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = str.getText().toString();
                if (str.length() == 0) {
                    erg.setText("Sie müssen einen Text eingeben!");
                }
                else if (str.length() < 5) {
                    erg.setText("String muss min. Länge von 6 Zeichen haben!");
                }
                else if (isPalindrom(s)) {
                    erg.setText("String ist ein Palindrom!");
                }
                else {
                    erg.setText("String ist kein Palindrom!");
                }
            }
        });
    }

    public static boolean isPalindrom(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

