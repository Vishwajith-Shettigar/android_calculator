package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.mariuszgromada.math.mxparser.*;
public class MainActivity extends AppCompatActivity {
 private ImageButton but3,but1,butplus,butminus ,butequal,but2,but4,but5,but6,but7,but8,but9,but0,but00,butc,butdiv,butmul,butdot,butmod,butback;

    private AdView mAdView;

    public boolean maxentry()
    {
        if (textView.length()<50)
        {
            return false;

        }
        return true;

    }

    public void message()
    {
        Toast.makeText(this, "Limit Reached ", Toast.LENGTH_SHORT).show();
    }
    private TextView textView;
    @SuppressLint("WrongViewCast")
    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });




        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        but1 = findViewById(R.id.imageButton8);
        but2=findViewById(R.id.imageButton7);
        but3 = findViewById(R.id.button3);
        but4=findViewById(R.id.imageButton4);
        but5=findViewById(R.id.imageButton3);
        but6=findViewById(R.id.imageButton2);
        but7=findViewById(R.id.imageButton16);
        but8=findViewById(R.id.imageButton15);
        but9=findViewById(R.id.imageButton14);
        but00=findViewById(R.id.imageButton12);
        but0=findViewById(R.id.imageButton11);
        butdot=findViewById(R.id.imageButton10);
        butc=findViewById(R.id.imageButton20);
        butmod=findViewById(R.id.imageButton19);
        butback=findViewById(R.id.imageButton18);
        butdiv=findViewById(R.id.imageButton17);
        butmul=findViewById(R.id.imageButton13);

        butplus = findViewById(R.id.imageButton5);
        butminus=findViewById(R.id.imageButton);
        butequal=findViewById(R.id.imageButton9);



        textView=findViewById(R.id.textView);

        // onclick



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"1");

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {


                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"2");
            }
        });




        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"3");





            }
        });



        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"6");
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"9");
            }
        });

        but00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"00");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+"0");
            }
        });

        butdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (maxentry())
                {
                    message();
                    return;
                }
                textView .setText( textView.getText().toString()+".");
            }
        });



        butback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text=textView.getText().toString();
                StringBuffer sb= new StringBuffer(text);
                if(sb.length()!=0)
                {
                    sb.deleteCharAt(sb.length()-1);
                    textView.setText(sb.toString());
                }
                else
                    return;

//invoking the method


            }
        });



//
        butmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( textView.getText().toString()+"^");
            }
        });

//
        butc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( " ");
            }
        });
//
        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( textView.getText().toString()+"/");
            }
        });

//
        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( textView.getText().toString()+"*");
            }
        });
//

//
//
//
//



        butplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( textView.getText().toString()+"+");
            }
        });

        butminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView .setText( textView.getText().toString()+"-");
            }
        });


        butequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String exp=textView.getText().toString();
      if(exp.length()>1)
      {
            String userexp=textView.getText().toString();
             Expression exp1= new Expression(userexp);
             String res= String.valueOf(exp1.calculate());
              textView.setText(res);

      }
      return;


               
            }
        });








    }



//        public static double eval(final String str) {
//            return new Object() {
//                int pos = -1, ch;
//
//                void nextChar() {
//                    ch = (++pos < str.length()) ? str.charAt(pos) : -1;
//                }
//
//                boolean eat(int charToEat) {
//                    while (ch == ' ') nextChar();
//                    if (ch == charToEat) {
//                        nextChar();
//                        return true;
//                    }
//                    return false;
//                }
//
//                double parse() {
//                    nextChar();
//                    double x = parseExpression();
//                    if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
//                    return x;
//                }
//
//                // Grammar:
//                // expression = term | expression `+` term | expression `-` term
//                // term = factor | term `*` factor | term `/` factor
//                // factor = `+` factor | `-` factor | `(` expression `)`
//                //        | number | functionName factor | factor `^` factor
//
//                double parseExpression() {
//                    double x = parseTerm();
//                    for (;;) {
//                        if      (eat('+')) x += parseTerm(); // addition
//                        else if (eat('-')) x -= parseTerm(); // subtraction
//                        else return x;
//                    }
//                }
//
//                double parseTerm() {
//                    double x = parseFactor();
//                    for (;;) {
//                        if      (eat('*')) x *= parseFactor(); // multiplication
//                        else if (eat('/')) x /= parseFactor(); // division
//                        else return x;
//                    }
//                }
//
//                double parseFactor() {
//                    if (eat('+')) return parseFactor(); // unary plus
//                    if (eat('-')) return -parseFactor(); // unary minus
//
//                    double x;
//                    int startPos = this.pos;
//                    if (eat('(')) { // parentheses
//                        x = parseExpression();
//                        eat(')');
//                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
//                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
//                        x = Double.parseDouble(str.substring(startPos, this.pos));
//                    } else if (ch >= 'a' && ch <= 'z') { // functions
//                        while (ch >= 'a' && ch <= 'z') nextChar();
//                        String func = str.substring(startPos, this.pos);
//                        x = parseFactor();
//                        if (func.equals("sqrt")) x = Math.sqrt(x);
//                        else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
//                        else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
//                        else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
//                        else throw new RuntimeException("Unknown function: " + func);
//                    } else {
//                        throw new RuntimeException("Unexpected: " + (char)ch);
//                    }
//
//                    if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
//
//                    return x;
//                }
//            }.parse();
//        }
    }
