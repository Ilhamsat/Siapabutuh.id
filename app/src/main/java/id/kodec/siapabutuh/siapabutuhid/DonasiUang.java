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

public class DonasiUang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi_uang);

        TextView textDonasiUang = (TextView) findViewById(R.id.textDonasiUang);
        TextView textNamaU = (TextView) findViewById(R.id.textNamaU);
        EditText isiNamaU = (EditText) findViewById(R.id.isiNamaU);
        TextView textAlamatU = (TextView) findViewById(R.id.textAlamatU);
        EditText isiAlamatU = (EditText) findViewById(R.id.isiAlamatU);
        TextView textNoHPU = (TextView) findViewById(R.id.textNoHPU);
        EditText isiNoHPU = (EditText) findViewById(R.id.isiNoHPU);
        TextView textEmailU = (TextView) findViewById(R.id.textEmailU);
        EditText isiEmailU = (EditText) findViewById(R.id.isiEmailU);
        TextView textJumlahUang = (TextView) findViewById(R.id.textJumlahUang);
        EditText isiJumlahUang = (EditText) findViewById(R.id.isiJumlahUang);
        TextView textRekening = (TextView) findViewById(R.id.textRekening);
        EditText isiRekening = (EditText) findViewById(R.id.isiRekening);
        TextView textKeteranganU = (TextView) findViewById(R.id.textKeteranganU);
        EditText isiKeteranganU = (EditText) findViewById(R.id.isiKeteranganU);
        Button buttonDonasiUang = (Button) findViewById(R.id.buttonDonasiUang);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiUang.setTypeface(allerBold);
        textNamaU.setTypeface(allerRegular);
        isiNamaU.setTypeface(allerRegular);
        textAlamatU.setTypeface(allerRegular);
        isiAlamatU.setTypeface(allerRegular);
        textNoHPU.setTypeface(allerRegular);
        isiNoHPU.setTypeface(allerRegular);
        textEmailU.setTypeface(allerRegular);
        isiEmailU.setTypeface(allerRegular);
        textJumlahUang.setTypeface(allerRegular);
        isiJumlahUang.setTypeface(allerRegular);
        textRekening.setTypeface(allerRegular);
        isiRekening.setTypeface(allerRegular);
        textKeteranganU.setTypeface(allerRegular);
        isiKeteranganU.setTypeface(allerRegular);
        buttonDonasiUang.setTypeface(allerBold);


        ImageView back = (ImageView) findViewById(R.id.backDonasiUang);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiUang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        buttonDonasiUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonasiUang.this,ThanksUang.class);
                startActivity(intent);
            }
        });
    }
}
