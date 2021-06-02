package sg.edu.rp.c346.id20045435.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.tvTranslatedText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);  // Inflate means use
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        // Handle action bar item clicks here.
        if (item.getItemId() == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello");
        }
        else if (item.getItemId() == R.id.ItalianSelection) {
            tvTranslatedText.setText("Ciao");
        }
        else {
            tvTranslatedText.setText("Error Translation");
        }
        return super.onOptionsItemSelected(item);
    }
}