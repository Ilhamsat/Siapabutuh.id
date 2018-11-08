package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        TextView textTentang = (TextView) findViewById(R.id.textTentang);
        TextView descTentang = (TextView) findViewById(R.id.descTentang);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textTentang.setTypeface(allerBold);
        descTentang.setTypeface(allerRegular);


        ImageView back = (ImageView) findViewById(R.id.backTentang);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tentang.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
