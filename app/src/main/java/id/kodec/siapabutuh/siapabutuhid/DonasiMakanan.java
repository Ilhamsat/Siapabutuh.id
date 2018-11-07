package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DonasiMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_makanan);

        ImageView back = (ImageView) findViewById(R.id.backDonasiMakanan);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiMakanan.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonDonasiMakanan = (Button) findViewById(R.id.buttonDonasiMakanan);

        buttonDonasiMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiMakanan.this,ThanksMakanan.class);
                startActivity(intent);
            }
        });
    }
}
