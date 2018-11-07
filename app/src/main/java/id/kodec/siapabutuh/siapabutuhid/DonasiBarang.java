package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DonasiBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_barang);

        ImageView back = (ImageView) findViewById(R.id.backDonasiBarang);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiBarang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonDonasiBarang = (Button) findViewById(R.id.buttonDonasiBarang);

        buttonDonasiBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiBarang.this,ThanksBarang.class);
                startActivity(intent);
            }
        });
    }
}
