package com.rj.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    EditText t2;
    TextView t3,t4,t5,t6;

//    Button b1,b2,b3,b4;

    double s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.T1);
        t2=findViewById(R.id.T2);

        t3=findViewById(R.id.sum);
        t4=findViewById(R.id.sub);
        t5=findViewById(R.id.mul);
        t6=findViewById(R.id.div);

//        b1=findViewById(R.id.B1);
//        b2=findViewById(R.id.B2);
//        b3=findViewById(R.id.B3);
//        b4=findViewById(R.id.B4);

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                s1=Double.parseDouble(t1.getText().toString());
//                s2=Double.parseDouble(t2.getText().toString());
//                t3.setText(s1+s2+"");
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                s1=Double.parseDouble(t1.getText().toString());
//                s2=Double.parseDouble(t2.getText().toString());
//                t4.setText(s1-s2+"");
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                s1=Double.parseDouble(t1.getText().toString());
//                s2=Double.parseDouble(t2.getText().toString());
//                t5.setText(s1*s2+"");
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                s1=Double.parseDouble(t1.getText().toString());
//                s2=Double.parseDouble(t2.getText().toString());
//                t6.setText(s1/s2+"");
//            }
//        });


//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                t3.setText(s1+s2+"");
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                t4.setText(s1-s2+"");
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                t5.setText(s1*s2+"");
//            }
//        });
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                t6.setText(s1/s2+"");
//            }
//        })

    }

    public boolean typeConvert()
    {
        if(t1.getText().toString().isEmpty() && t2.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            {
            s1 = Double.parseDouble(t1.getText().toString());
            s2 = Double.parseDouble(t2.getText().toString());
            return true;
            }
    }
    public void getSum(View v1)
    {
        if(typeConvert())
        t3.setText(s1+s2+"");
    }
    public void getSub(View v2)
    {
        if(typeConvert())
        t4.setText(s1-s2+"");
    }
    public void getMul(View v3)
    {
        if(typeConvert())
            t5.setText(String.format("%.3f",s1*s2)+"");
    }
    public void getDiv(View v4)
    {
        if(typeConvert())
            t6.setText(String.format("%.3f",s1/s2)+"");
    }
}
