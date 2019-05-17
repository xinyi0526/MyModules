package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv; //String
    TextView tv1; //String
    TextView tv2;  //INT
    TextView tv3;  //INT
    TextView tv4;  //INT
    TextView tv5;  //String

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tv = findViewById(R.id.textView3);
        tv1 = findViewById(R.id.textView4);
        tv2 = findViewById(R.id.textView5);
        tv3 = findViewById(R.id.textView6);
        tv4 = findViewById(R.id.textView7);
        tv5 = findViewById(R.id.textView8);

        Intent intentRecieved = getIntent();
        String value = intentRecieved.getStringExtra("value");
        tv.setText("Module Code: " + value);

        Intent intentRecieved1 = getIntent();
        String value1 = intentRecieved1.getStringExtra("value1");
        tv1.setText("Module Name: " + value1);

        Intent intentRecieved2 = getIntent();
        int value2 = intentRecieved2.getIntExtra("value2",0);
        tv2.setText("Academic Year : " + value2);

        Intent intentRecieved3 = getIntent();
        int value3 = intentRecieved3.getIntExtra("value3",0);
        tv3.setText("Semester : " + value3);

        Intent intentRecieved4 = getIntent();
        int value4 = intentRecieved4.getIntExtra("value4",0);
        tv4.setText("Module Credit : " + value4);

        Intent intentRecieved5 = getIntent();
        String value5 = intentRecieved5.getStringExtra("value5");
        tv5.setText("Venue: " + value5);

    }
}
