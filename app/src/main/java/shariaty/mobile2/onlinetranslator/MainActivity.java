package shariaty.mobile2.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Spinner fromspinner, spinnerto;
    private TextInputEditText inputEditText;
    private Button button;
    String[] FromLang = {"english", "persian"};
    String[] ToLang = {"english", "persian"};
    int froml, tol, Cl;
    AlertDialog.Builder alertBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerto = findViewById(R.id.spinnerto);
        fromspinner = findViewById(R.id.fromSpinner);
        inputEditText = findViewById(R.id.textInput);
        button = findViewById(R.id.button);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, FromLang);
        fromspinner.setAdapter(adapter);
        fromspinner.setAdapter(adapter);


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ToLang);
        spinnerto.setAdapter(adapter2);
        spinnerto.setAdapter(adapter2);


        fromspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
               // String item = adapterView.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(adapterView.getContext(), "Select language ", Toast.LENGTH_LONG).show();
            }
        });
    }


    public void onClickinfo(View view) {
        alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle("about us");
        alertBuilder.setMessage("Shariati University Mobile Programming Project ");

        alertBuilder.setPositiveButton("OK", null);

        AlertDialog alert = alertBuilder.create();
        alert.show();
    }

    public void onClickGoToWordTranslation(View view) {
        Intent intent = new Intent(this, WordTranslation.class);
        startActivity(intent);
    }
}