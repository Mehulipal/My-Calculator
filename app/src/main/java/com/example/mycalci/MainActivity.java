package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnClr,btnPlus,btnMinus,btnEqual,btnInto,btnDiv;
    EditText ed1;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnClr=(Button)findViewById(R.id.btnClr);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnInto=(Button)findViewById(R.id.btnInto);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        ed1=(EditText)  findViewById(R.id.editText);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText("");
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText("");
                }
            }
        });
        btnInto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                {
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText("");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Float.parseFloat(ed1.getText()+"");
                if(Add==true){
                    ed1.setText(Res1+Res2+"");
                    Add=false;
                }
                if(Sub==true){
                    ed1.setText(Res1-Res2+"");
                    Sub=false;
                }
                if(Mul==true){
                    ed1.setText(Res1*Res2+"");
                    Mul=false;
                }
                if(Div==true){
                    ed1.setText(Res1/Res2+"");
                    Div=false;
                }
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");

            }
        });



    }
}
