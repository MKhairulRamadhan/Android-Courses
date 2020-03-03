package com.example.latihan4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView data;
    Boolean clickColor = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        data = findViewById(R.id.tvData);
        data.setText("");

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    InputStream stream;
                    if (clickColor){
                        stream = getAssets().open("logo_unsyiah_2.png");
                        clickColor = false;
                        data.setText(getString(R.string.data));
                    }else {
                        stream = getAssets().open("logo_unsyiah.png");
                        clickColor = true;
                        data.setText("");
                    }
                    Drawable drawable = Drawable.createFromStream(stream, null);
                    img.setImageDrawable(drawable);
                }catch(Exception e){
                    Log.e("Gambar error" , e.getMessage().toString());
                }

            }
        });

    }
}
