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

public class Infoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoo);

        ImageView back = (ImageView) findViewById(R.id.backInfo);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Infoo.this,MainActivity.class);
                startActivity(intent);
            }
        });

        TextView atasInfo = (TextView) findViewById(R.id.textInfo);
        TextView descInfo = (TextView) findViewById(R.id.descInfo);
        TextView alamat1 = (TextView) findViewById(R.id.alamat1);
        TextView alamat2 = (TextView) findViewById(R.id.alamat2);
        TextView textKontak = (TextView) findViewById(R.id.textKontak);
        TextView kontak1 = (TextView) findViewById(R.id.kontak1);
        TextView kontak2 = (TextView) findViewById(R.id.kontak2);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        descInfo.setTypeface(allerBold);
        alamat1.setTypeface(allerRegular);
        alamat2.setTypeface(allerRegular);
        textKontak.setTypeface(allerBold);
        kontak1.setTypeface(allerRegular);
        kontak2.setTypeface(allerRegular);
        atasInfo.setTypeface(allerBold);


    }
}
