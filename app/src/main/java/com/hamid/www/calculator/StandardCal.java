package com.hamid.www.calculator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class StandardCal extends AppCompatActivity {


    private TextView answerTV, equationTv;
    private int count = 0;
    private int row = 1;
    private String equation = "";
    private String uiEquation = "";
    private Double result = 0.0;
    private DBHelper dbHelper;
    private Boolean bracketOpened = false;
    private CharSequence sqrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_cal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        equationTv = (TextView) findViewById(R.id.edit_text);
        answerTV = (TextView) findViewById(R.id.text_view);
        dbHelper = new DBHelper(this);

        Resources res = getResources();
        String text = res.getString(R.string.sqrt);
        sqrt = Html.fromHtml(text);

        answerTV.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String textCopied = answerTV.getText().toString();
                if(textCopied.isEmpty()){
                    return false;
                }else {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("", textCopied);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(),textCopied + " copied to clipboard", Toast.LENGTH_SHORT).show();
                return true;}
            }
        });

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.converter:
                startActivity(new Intent(this,UnitsOptionsActivity.class));
                break;
            case R.id.num0:

                equation = equation + "0";
                uiEquation = uiEquation + "0";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num1:
                equation = equation + "1";
                uiEquation = uiEquation + "1";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num2:
                equation = equation + "2";
                uiEquation = uiEquation + "2";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num3:
                equation = equation + "3";
                uiEquation = uiEquation + "3";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num4:
                equation = equation + "4";
                uiEquation = uiEquation+ "4";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num5:
                equation = equation + "5";
                uiEquation = uiEquation + "5";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num6:
                equation = equation + "6";
                uiEquation = uiEquation + "6";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num7:
                equation = equation + "7";
                uiEquation = uiEquation + "7";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num8:
                equation = equation + "8";
                uiEquation = uiEquation + "8";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.num9:
                equation = equation + "9";
                uiEquation = uiEquation + "9";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.dot:
                if (count == 0 && equationTv.length() != 0) {
                    equation = equation + ".";
                    uiEquation = uiEquation + "d";
                    equationTv.setText(convertToArabic(uiEquation));
                    count++;
                }
                row++;
                break;
            case R.id.clear:
                equationTv.setText("");
                answerTV.setText("");
                equation = "";
                uiEquation = "";
                count = 0;
                row = 0;
                equationTv.setTextSize(40);
                break;

            case R.id.backSpace:
                if (equation.length() > 0) {
                    if (equation.endsWith(".")) {
                        count = 0;
                        equation = equation.substring(0, equation.length() - 1);
                        uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                        row--;
                    }
                    if(equation.endsWith("(")) {
                        equation = equation.substring(0,equation.length()-1);
                        uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                        row--;
                        if(equation.endsWith("sqrt")){
                            equation = equation.substring(0,equation.length()-4);
                            uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                            row--;
                        }else {
                            equation = equation.substring(0,equation.length()-1);
                            uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                            row--;
                        }
                    }
                    else if(equation.endsWith(")")){
                        equation = equation.substring(0,equation.length()-1);
                        uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                        row--;
                        bracketOpened = true;
                    }
                    else {
                        equation = equation.substring(0,equation.length()-1);
                        uiEquation = uiEquation.substring(0,uiEquation.length()-1);
                        row--;
                    }
                    equationTv.setText(convertToArabic(uiEquation));
                }
                break;

            case R.id.plus:
                count =0;
                equation = equation + "+";
                uiEquation = uiEquation + "+";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.minus:
                count =0;
                equation = equation + "-";
                uiEquation = uiEquation + "-";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.divide:
                count =0;
                equation = equation + "/";
                uiEquation = uiEquation + "/";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.multiply:
                count =0;
                equation = equation + "*";
                uiEquation = uiEquation + "*";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;
            case R.id.sqrt:
                if (equation.endsWith("+") || equation.endsWith("-") || equation.endsWith("/") || equation.endsWith("*")) {
                    uiEquation = uiEquation + "s(" ;
                    equation = equation + "sqrt(";
                    row = row +2;
                } else if (!(equation.equals(""))) {
                    uiEquation = uiEquation + "*s(";
                    equation = equation + "*sqrt(";
                    row = row + 3;
                }
                else {
                    uiEquation = uiEquation + "s(";
                    equation = equation + "sqrt(";
                    row = row + 2;
                }
                bracketOpened = true;
                equationTv.setText(convertToArabic(uiEquation));
                break;

            case R.id.square:
                if (equation.length() != 0) {
                    equation = equation + "^2";
                    uiEquation = uiEquation + "^(2)";
                    equationTv.setText(convertToArabic(uiEquation));
                    row = row + 2;
                } else {
                    Toast.makeText(StandardCal.this, getText(R.string.empty_sqrt), Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.posneg:
                equation = equation + "-";
                uiEquation = uiEquation + "-";
                equationTv.setText(convertToArabic(uiEquation));
                row++;
                break;

            case R.id.equal:
                /*for more knowledge on DoubleEvaluator and its tutorial go to the below link
                http://javaluator.sourceforge.net/en/home/*/
                if (equationTv.length() != 0) {

                    //e2.getText().toString();

                }
//                e1.setText("");
                if (equation.length() == 0)
                    equation = "0";
                try {
                    //evaluate the expression
                    result = new ExtendedDoubleEvaluator().evaluate(equation);
                    String resultStr = String.valueOf(result);
                    String finalAnswer = convertToArabic(resultStr);
                    answerTV.setText(finalAnswer);
                    //insert expression and result in sqlite database if expression is valid and not 0.0
                               if (!resultStr.equals("0.0")) {
                                   dbHelper.insert("STANDARD", equationTv.getText().toString() + " = " + finalAnswer);
                               }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.Brackets:
                if(bracketOpened){
                    equation = equation + ")";
                    uiEquation = uiEquation + ")";
                    equationTv.setText(convertToArabic(uiEquation));
                    row++;
                    bracketOpened = false;
                }else {
                    if (equation.endsWith("+") || equation.endsWith("-") || equation.endsWith("/") || equation.endsWith("*")) {
                        uiEquation = uiEquation + "(";
                        equation = equation + "(";
                        row++;
                    } else if(!(equation.equals(""))) {
                        uiEquation = uiEquation + "*(";
                        equation = equation + "*(";
                        row = row + 2;
                    }
                    else {
                        uiEquation = uiEquation + "(";
                        equation = equation + "(";
                        row++;
                    }
                    equationTv.setText(convertToArabic(uiEquation));
                    bracketOpened = true;
                }
                break;

            case R.id.history:
                Intent i = new Intent(this, History.class);
                i.putExtra("calcName", "STANDARD");
                startActivity(i);
                break;
        }
    }

    public String convertToArabic(String whatEver) {
        String[] separated = whatEver.split("");
        String currentValue;
        String arabicResult = "";

        if (whatEver.equals("null")) {
            separated = whatEver.split("");
        }
        for (int i = 0; i < separated.length; i++) {
            currentValue = separated[i];
            switch (currentValue) {
                case "0":
                    currentValue = String.valueOf(getText(R.string.n_0));
                    break;
                case "1":
                    currentValue = String.valueOf(getText(R.string.n_1));
                    break;
                case "2":
                    currentValue = String.valueOf(getText(R.string.n_2));
                    break;
                case "3":
                    currentValue = String.valueOf(getText(R.string.n_3));
                    break;
                case "4":
                    currentValue = String.valueOf(getText(R.string.n_4));
                    break;
                case "5":
                    currentValue = String.valueOf(getText(R.string.n_5));
                    break;
                case "6":
                    currentValue = String.valueOf(getText(R.string.n_6));
                    break;
                case "7":
                    currentValue = String.valueOf(getText(R.string.n_7));
                    break;
                case "8":
                    currentValue = String.valueOf(getText(R.string.n_8));
                    break;
                case "9":
                    currentValue = String.valueOf(getText(R.string.n_9));
                    break;
                case ".":
                    if (separated[i + 1].equals("0")) {
                        try {
                            if (separated[i + 2].equals("")) {
                                currentValue = ",";
                            }
                        } catch (IndexOutOfBoundsException e) {
                            currentValue = "";
                            i = separated.length;
                        }
                    } else {
                        currentValue = ",";
                    }
                    break;
                case "":
                case "^":
                case "+":
                case "-":

                    break;
                case "/":
                    currentValue = "÷";
                            break;
                case "*":
                    currentValue = "×";
                    break;
                case "s":
                    currentValue = String.valueOf(getText(R.string.square_root));
                    break;
                case "d":
                    currentValue = ",";
                    break;
                case "(":
                case ")":
                    break;
            }
            arabicResult =  arabicResult + currentValue ;
        }

        if(row>19 && row<=22){
            resizeTextView(0);
        }else if(row>22 && row<=25){
            resizeTextView(1);
        }else if(row>25 && row<=28){
            resizeTextView(2);
        }else if(row>28 && row<=31){
            resizeTextView(3);
        }else if(row>31 && row<=34){
            resizeTextView(4);
        }
        return arabicResult;
    }

    private void resizeTextView(int level) {
        if(level == 0){
            equationTv.setTextSize(35);
        }else if(level == 1){
            equationTv.setTextSize(30);
        }else if(level == 2){
            equationTv.setTextSize(25);
        }else if(level == 3){
            equationTv.setTextSize(20);
        }else if(level == 4){
            equationTv.setTextSize(15);
        }
    }

}