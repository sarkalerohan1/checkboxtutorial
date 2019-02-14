package java.tata.hitesh.checkboxtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    TextView textView;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.test);
        cb1=findViewById(R.id.cb1);
        cb1=findViewById(R.id.cb2);
        cb1=findViewById(R.id.cb3);
        cb1=findViewById(R.id.cb4);
        cb1=findViewById(R.id.cb5);
        cb1=findViewById(R.id.cb6);
        cb1.setOnClickListener(this);
        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        cb4.setOnClickListener(this);
        cb5.setOnClickListener(this);
        cb6.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cb1:
                if (cb1.isChecked())
                    Toast.makeText(this,cb1.getText(),Toast.LENGTH_SHORT).show();
            case R.id.cb2:
                if (cb2.isChecked())
                    Toast.makeText(this,cb2.getText(),Toast.LENGTH_SHORT).show();
            case R.id.cb3:
                if (cb3.isChecked())
                    Toast.makeText(this,cb3.getText(),Toast.LENGTH_SHORT).show();
            case R.id.cb4:
                if (cb4.isChecked())
                    Toast.makeText(this,cb4.getText(),Toast.LENGTH_SHORT).show();
            case R.id.cb5:
                if (cb5.isChecked())
                    Toast.makeText(this,cb5.getText(),Toast.LENGTH_SHORT).show();
            case R.id.cb6:
                if (cb6.isChecked())
                    Toast.makeText(this,cb6.getText(),Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
