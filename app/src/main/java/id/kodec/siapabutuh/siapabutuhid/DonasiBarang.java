package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DonasiBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_barang);

        TextView textDonasiBarang = (TextView) findViewById(R.id.textDonasiBarang);
        TextView textNamaB = (TextView) findViewById(R.id.textNamaB);
        EditText isiNamaB = (EditText) findViewById(R.id.isiNamaB);
        TextView textAlamatB = (TextView) findViewById(R.id.textAlamatB);
        EditText isiAlamatB = (EditText) findViewById(R.id.isiAlamatB);
        TextView textNoHPB = (TextView) findViewById(R.id.textNoHPB);
        EditText isiNoHPB = (EditText) findViewById(R.id.isiNoHPB);
        TextView textEmailB = (TextView) findViewById(R.id.textEmailB);
        EditText isiEmailB = (EditText) findViewById(R.id.isiEmailB);
        TextView textJenisBarang = (TextView) findViewById(R.id.textJenisBarang);
        EditText isiJenisBarang = (EditText) findViewById(R.id.isiJenisBarang);
        TextView textKeteranganB = (TextView) findViewById(R.id.textKeteranganB);
        EditText isiKeteranganB = (EditText) findViewById(R.id.isiKeteranganB);
        Button buttonDonasiBarang = (Button) findViewById(R.id.buttonDonasiBarang);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiBarang.setTypeface(allerBold);
        textNamaB.setTypeface(allerRegular);
        isiNamaB.setTypeface(allerRegular);
        textAlamatB.setTypeface(allerRegular);
        isiAlamatB.setTypeface(allerRegular);
        textNoHPB.setTypeface(allerRegular);
        isiNoHPB.setTypeface(allerRegular);
        textEmailB.setTypeface(allerRegular);
        isiEmailB.setTypeface(allerRegular);
        textJenisBarang.setTypeface(allerRegular);
        isiJenisBarang.setTypeface(allerRegular);
        textKeteranganB.setTypeface(allerRegular);
        isiKeteranganB.setTypeface(allerRegular);
        buttonDonasiBarang.setTypeface(allerBold);

        ImageView back = (ImageView) findViewById(R.id.backDonasiBarang);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiBarang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        buttonDonasiBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiBarang.this,ThanksBarang.class);
                startActivity(intent);
            }
        });
    }
}
