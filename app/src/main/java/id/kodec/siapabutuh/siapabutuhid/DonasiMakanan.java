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

public class DonasiMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_makanan);

        TextView textDonasiMakanan = (TextView) findViewById(R.id.textDonasiMakanan);
        TextView textNamaM = (TextView) findViewById(R.id.textNamaM);
        EditText isiNamaM = (EditText) findViewById(R.id.isiNamaM);
        TextView textAlamatM = (TextView) findViewById(R.id.textAlamatM);
        EditText isiAlamatM = (EditText) findViewById(R.id.isiAlamatM);
        TextView textNoHPM = (TextView) findViewById(R.id.textNoHPM);
        EditText isiNoHPM = (EditText) findViewById(R.id.isiNoHPM);
        TextView textEmailM = (TextView) findViewById(R.id.textEmailM);
        EditText isiEmailM = (EditText) findViewById(R.id.isiEmailM);
        TextView textJenisMakanan = (TextView) findViewById(R.id.textJenisMakanan);
        EditText isiJenisMakanan = (EditText) findViewById(R.id.isiJenisMakanan);
        TextView textKadaluarsa = (TextView) findViewById(R.id.textKadaluarsa);
        EditText isiKadaluarsa = (EditText) findViewById(R.id.isiTanggalKadaluarsa);
        TextView textKeteranganM = (TextView) findViewById(R.id.textKeteranganM);
        EditText isiKeteranganM = (EditText) findViewById(R.id.isiKeteranganM);
        Button buttonDonasiMakanan = (Button) findViewById(R.id.buttonDonasiMakanan);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiMakanan.setTypeface(allerBold);
        textNamaM.setTypeface(allerRegular);
        isiNamaM.setTypeface(allerRegular);
        textAlamatM.setTypeface(allerRegular);
        isiAlamatM.setTypeface(allerRegular);
        textNoHPM.setTypeface(allerRegular);
        isiNoHPM.setTypeface(allerRegular);
        textEmailM.setTypeface(allerRegular);
        isiEmailM.setTypeface(allerRegular);
        textJenisMakanan.setTypeface(allerRegular);
        isiJenisMakanan.setTypeface(allerRegular);
        textKadaluarsa.setTypeface(allerRegular);
        isiKadaluarsa.setTypeface(allerRegular);
        textKeteranganM.setTypeface(allerRegular);
        isiKeteranganM.setTypeface(allerRegular);
        buttonDonasiMakanan.setTypeface(allerBold);

        ImageView back = (ImageView) findViewById(R.id.backDonasiMakanan);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiMakanan.this,MainActivity.class);
                startActivity(intent);
            }
        });

        buttonDonasiMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiMakanan.this,ThanksMakanan.class);
                startActivity(intent);
            }
        });


    }

    public void kolomclick(View view) {
        
    }
}
