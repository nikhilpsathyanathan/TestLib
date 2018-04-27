package rainbow.sih.testlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import makesimple.in.MyClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String val =MyClass.Test("hi");
        Toast.makeText(getApplicationContext(),val,Toast.LENGTH_SHORT).show();
    }
}
