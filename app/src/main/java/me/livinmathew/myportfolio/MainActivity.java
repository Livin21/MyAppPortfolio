package me.livinmathew.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.moviesBTN:
                say("This button will launch my Movies Listing App");
                break;
            case R.id.stockBTN:
                say("This button will launch Stock Hawk App");
                break;
            case R.id.buildItBiggerBTN:
                say("This button will launch Build It Bigger App");
                break;
            case R.id.ubiquitousBTN:
                say("This button will launch GO UBIQUITOUS App");
                break;
            case R.id.materialBTN:
                say("This button will launch my material App");
                break;
            case R.id.capstoneBTN:
                say("This button will launch my capstone App");
                break;
        }
    }

    private void say(String s) {
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }


}
