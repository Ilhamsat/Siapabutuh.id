package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DonasiUang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_uang);

        ImageView back = (ImageView) findViewById(R.id.backDonasiUang);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiUang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button buttonDonasiUang = (Button) findViewById(R.id.buttonDonasiUang);

        buttonDonasiUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiUang.this,ThanksUang.class);
                startActivity(intent);
            }
        });
    }
}
