package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Aprg;
    TextView Iprg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aprg = findViewById(R.id.textView);
        Iprg = findViewById(R.id.textView2);


        Aprg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),ModuleDetailActivity.class);
                intent.putExtra("value","C346");
                intent.putExtra("value1","Android Programming");
                intent.putExtra("value2",2018);
                intent.putExtra("value3",1);
                intent.putExtra("value4",4);
                intent.putExtra("value5","W66M");
                startActivity(intent);

            }
        });
        Iprg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(),ModuleDetailActivity.class);
                intent1.putExtra("value","C349");
                intent1.putExtra("value1","IPad Programming");
                intent1.putExtra("value2",2018);
                intent1.putExtra("value3",1);
                intent1.putExtra("value4",4);
                intent1.putExtra("value5","W66M");
                startActivity(intent1);

            }
        });

    }
}
