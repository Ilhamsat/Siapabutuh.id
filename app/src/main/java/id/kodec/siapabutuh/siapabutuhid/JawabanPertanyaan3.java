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

public class JawabanPertanyaan3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban_pertanyaan3);

        TextView jawabanPertanyaan3 = (TextView) findViewById(R.id.jawabanPertanyaan3);
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView lis1 = (TextView) findViewById(R.id.lis1);
        TextView lis2 = (TextView) findViewById(R.id.lis2);
        TextView text2 = (TextView) findViewById(R.id.text2);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        jawabanPertanyaan3.setTypeface(allerBold);
        text1.setTypeface(allerRegular);
        lis1.setTypeface(allerRegular);
        lis2.setTypeface(allerRegular);
        text2.setTypeface(allerRegular);


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
