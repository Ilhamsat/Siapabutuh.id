package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThanksUang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_uang);

        TextView textDonasiMakanan = (TextView) findViewById(R.id.textDonasiUang);
        TextView textTY = (TextView) findViewById(R.id.textTY);
        TextView textTYUang = (TextView) findViewById(R.id.textTYUang);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiMakanan.setTypeface(allerBold);
        textTY.setTypeface(allerBold);
        textTYUang.setTypeface(allerRegular);


        ImageView back = (ImageView) findViewById(R.id.backDonasiUang);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksUang.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
