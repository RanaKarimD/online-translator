package shariaty.mobile2.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

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
        alertBuilder.setMessage("Shariati University Mobile Programming Project ");

        alertBuilder.setPositiveButton("OK", null);

        AlertDialog alert = alertBuilder.create();
        alert.show();
    }

    public  void onClickGoToWordTranslation (View view){
        Intent intent=new Intent(this,WordTranslation.class);
        startActivity(intent);
    }
}