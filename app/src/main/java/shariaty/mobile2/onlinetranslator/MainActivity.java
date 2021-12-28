package shariaty.mobile2.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder alertBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClickinfo(View view){
        alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle("about us");
        alertBuilder.setMessage("shariati ");

        alertBuilder.setPositiveButton("OK", null);

        AlertDialog alert = alertBuilder.create();
        alert.show();
    }
}