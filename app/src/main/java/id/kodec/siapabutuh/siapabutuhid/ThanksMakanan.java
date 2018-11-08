package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThanksMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_makanan);

        TextView textDonasiMakanan = (TextView) findViewById(R.id.textDonasiMakanan);
        TextView textTY = (TextView) findViewById(R.id.textTY);
        TextView textTYMakanan = (TextView) findViewById(R.id.textTYMakanan);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiMakanan.setTypeface(allerBold);
        textTY.setTypeface(allerBold);
        textTYMakanan.setTypeface(allerRegular);



        ImageView back = (ImageView) findViewById(R.id.backDonasiMakanan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksMakanan.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
