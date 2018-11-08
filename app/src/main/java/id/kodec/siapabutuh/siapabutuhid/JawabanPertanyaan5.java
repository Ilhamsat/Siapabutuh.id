package id.kodec.siapabutuh.siapabutuhid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class JawabanPertanyaan5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban_pertanyaan5);

        TextView jawabanPertanyaan5 = (TextView) findViewById(R.id.jawabanPertanyaan5);
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView li1 = (TextView) findViewById(R.id.li1);
        TextView li2 = (TextView) findViewById(R.id.li2);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        jawabanPertanyaan5.setTypeface(allerBold);
        text1.setTypeface(allerRegular);
        li1.setTypeface(allerRegular);
        li2.setTypeface(allerRegular);


        Button close = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.7),(int)(height*.6));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
    }
}
