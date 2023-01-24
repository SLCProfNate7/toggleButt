package comp208.misener.togglebutt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean toggle = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayHi(View view){
        toggle = !toggle;

        TextView tv =  (TextView)findViewById(R.id.greetings); //get reference to the Textview item
        if (toggle){
            tv.setText("General Kenobi!"); //set the textView to a new string
        }
        else{
            tv.setText("Hello There!"); //set the textView to a new string
        }

    }



}