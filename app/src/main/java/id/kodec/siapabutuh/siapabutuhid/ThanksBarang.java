package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThanksBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_barang);

        TextView textDonasiBarang = (TextView) findViewById(R.id.textDonasiBarang);
        TextView textTY = (TextView) findViewById(R.id.textTY);
        TextView textTYBarang = (TextView) findViewById(R.id.textTYBarang);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasiBarang.setTypeface(allerBold);
        textTY.setTypeface(allerBold);
        textTYBarang.setTypeface(allerRegular);


        ImageView back = (ImageView) findViewById(R.id.backDonasiBarang);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksBarang.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
