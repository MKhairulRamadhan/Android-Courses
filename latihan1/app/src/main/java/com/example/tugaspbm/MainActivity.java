package com.example.tugaspbm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    EditText name, nim, fakultas;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        nim = findViewById(R.id.nim);
        fakultas = findViewById(R.id.fakultas);
        result =findViewById(R.id.result);

    }

    public void submit(View v){

        String namaMhs = name.getText().toString();
        String nimMhs = nim.getText().toString();
        String fakultasMhs = fakultas.getText().toString();
        result.setText(("Nama : " + namaMhs + "\nNim : " + nimMhs + "\nFakultas : " + fakultasMhs));
        Log.i(TAG, "Nama : " + namaMhs + "\nNim : " + nimMhs + "\nFakultas : " + fakultasMhs);
        Toast.makeText(this, "Nama : " + namaMhs + "\nNim : " + nimMhs + "\nFakultas : " + fakultasMhs, Toast.LENGTH_SHORT).show();
    }

}
