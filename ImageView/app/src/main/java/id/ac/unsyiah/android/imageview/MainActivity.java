package id.ac.unsyiah.android.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private Boolean colored = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gantiGambar(View view) {
        String namaGambar;
        if (colored) {
            namaGambar = "logo_unsyiah_2";
        }else{
            namaGambar = "logo_unsyiah";
        }
        colored=!colored;

        int res = getResources().getIdentifier(namaGambar, "drawable", getPackageName());

        ImageView iv = findViewById(R.id.imageIcon);
        iv.setImageResource(res);
    }

    public void gambarAset(View view) {
        String gambarAset = "gambar_notes.png";

        ImageView imv = findViewById(R.id.imageIcon);

        try {
            InputStream stream = getAssets().open(gambarAset);
            Drawable drawable = Drawable.createFromStream(stream, null);
            imv.setImageDrawable(drawable);
        } catch (Exception e) {
            Log.e("Gambar error", e.getMessage());
        }
    }
}
