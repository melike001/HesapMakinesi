package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_equal;
    Button button_seven,button_eight,button_nine,button_div;
    Button button_four,button_five,button_six,button_multi;
    Button button_one,button_two,button_three,button_minus;
    Button button_AC,button_zero,button_dot,button_plus;

    TextView soru,result;

    boolean plus,minus,multi,div;

    float valueOne,valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        soru=findViewById(R.id.soru);

        button_equal=(Button) findViewById(R.id.button_equal);
        button_seven=(Button) findViewById(R.id.button_seven);
        button_eight=(Button) findViewById(R.id.button_eight);
        button_nine=(Button) findViewById(R.id.button_nine);
        button_div=(Button) findViewById(R.id.button_div);
        button_four=(Button) findViewById(R.id.button_four);
        button_five=(Button) findViewById(R.id.button_five);
        button_six=(Button) findViewById(R.id.button_six);
        button_multi=(Button) findViewById(R.id.button_multi);
        button_one=(Button) findViewById(R.id.button_one);
        button_two=(Button) findViewById(R.id.button_two);
        button_three=(Button) findViewById(R.id.button_three);
        button_minus=(Button) findViewById(R.id.button_minus);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_zero=(Button) findViewById(R.id.button_zero);
        button_dot=(Button) findViewById(R.id.button_dot);
        button_plus=(Button) findViewById(R.id.button_plus);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                soru.setText(result.getText());
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                soru.setText(result.getText());
            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                soru.setText(result.getText());
            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                soru.setText(result.getText());
            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                soru.setText(result.getText());
            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                soru.setText(result.getText());
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                soru.setText(result.getText());
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                soru.setText(result.getText());
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                soru.setText(result.getText());
            }
        });

        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                soru.setText(result.getText());
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                soru.setText(result.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else{
                    valueOne=Float.parseFloat(result.getText()+"");
                    plus=true;
                    result.setText(null);
                }
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne=Float.parseFloat(result.getText()+"");
                minus=true;
                result.setText(null);
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne=Float.parseFloat(result.getText()+"");
                div=true;
                result.setText(null);
            }
        });

        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne=Float.parseFloat(result.getText()+"");
                multi=true;
                result.setText(null);
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo=Float.parseFloat(result.getText()+"");
                if(plus==true){
                    result.setText(valueOne+valueTwo+"");
                    soru.setText(valueOne+"+"+valueTwo);
                    plus=false;
                }
                if(minus==true){
                    result.setText(valueOne-valueTwo+"");
                    soru.setText(valueOne+"-"+valueTwo);
                    minus=false;
                }
                if(div==true){
                    result.setText(valueOne/valueTwo+"");
                    soru.setText(valueOne+"/"+valueTwo);
                    div=false;
                }
                if(multi==true){
                    result.setText(valueOne*valueTwo+"");
                    soru.setText(valueOne+"*"+valueTwo);
                    multi=false;
                }
            }
        });


    }

}