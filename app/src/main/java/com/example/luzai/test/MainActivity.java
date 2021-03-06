package com.example.luzai.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox checkAllBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fir);
        eatBox = (CheckBox) findViewById(R.id.eat);
        sleepBox = (CheckBox) findViewById(R.id.sleep);
        checkAllBox = (CheckBox) findViewById(R.id.checkall);

        CheckBoxListener listener = new CheckBoxListener();
        eatBox.setOnCheckedChangeListener(listener);
        sleepBox.setOnCheckedChangeListener(listener);
        checkAllBox.setOnCheckedChangeListener(listener);


    }
    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.getId() == R.id.checkall){
                eatBox.setChecked(isChecked);
                sleepBox.setChecked(isChecked);
                System.out.println("all checked "+isChecked);
            }
        }
    }
}
