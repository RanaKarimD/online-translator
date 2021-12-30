package shariaty.mobile2.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WordTranslation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_translation);
    }

    public  void onClickBackToMainPage(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}