package sample.hug68356.helloworld;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends android.app.Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("MainActivity", "Second param");

        setContentView(R.layout.activity_main);
    }

    public void add(View v){

        EditText number1 = findViewById(R.id.n1);
        EditText number2 = findViewById(R.id.n2);
        TextView result = findViewById(R.id.result);
        if(true){
            int n1 = Integer.parseInt(number1.getText().toString());

            int n2 = Integer.valueOf(number2.getText().toString());
            result.setText("Addition of numbers " + (n1+n2));
        }else{
            result.setText(number1.getText());
        }



    }
}