package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        ImageButton buttonMakanan = (ImageButton) findViewById(R.id.buttonMakanan);
        buttonMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiMakanan.class);
                startActivity(intent);
            }
        });

        ImageButton buttonUang = (ImageButton) findViewById(R.id.buttonUang);
        buttonUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiUang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonBarang = (ImageButton) findViewById(R.id.buttonBarang);
        buttonBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiBarang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonFAQ = (ImageButton) findViewById(R.id.buttonFaq);
        buttonFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FAQ.class);
                startActivity(intent);
            }
        });

        ImageButton buttonTentang = (ImageButton) findViewById(R.id.buttonInfoo);
        buttonTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tentang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonBerita = (ImageButton) findViewById(R.id.buttonBerita);
        buttonBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Berita.class);
                startActivity(intent);
            }
        });

    }
}
