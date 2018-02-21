package sdu.cs58.wattana.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1.ประกาศตัวแปร
    EditText number1EditText,number2EditText;
    Button addButton;
    TextView resultTextView;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.ผู้ตัวแปรบน จาวา กับ อิลิเม้นท์บน XML
    number1EditText = findViewById(R.id.edtNnumber1);
    number2EditText = findViewById(R.id.editNumber2);
    addButton = findViewById(R.id.btnAdd);
    resultTextView = findViewById(R.id.txvResult);

    addButton .setOnClickListener(new View.OnClickListener() {
        @Override

        //3.แปรค่าท่รับจากEditTextเป็นตัวเลขเเล้วเก็บตัวแปรชนิดint
        public void onClick(View view) {
        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
        num2 = Integer.parseInt(number1EditText.getText().toString().trim());
        result = num1+num2;
        //4.เเสดงผมลัพธ์การคำนวณ
        resultTextView.setText(result+"");


        }
    });




    }//จบ Method
}//จบคลาส
