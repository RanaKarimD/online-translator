package shariaty.mobile2.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.builder.AnimateGifMode;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //loding gift
        ImageView imageView = (ImageView) findViewById(R.id.lodingv);
        Ion.with(imageView)
                .error(R.drawable.ic_baseline_info_24)
                .animateGif(AnimateGifMode.ANIMATE)
                .load("file:///drawable/loding.gif");

        //information about us
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        }, 3000);

    }
}