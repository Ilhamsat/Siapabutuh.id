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

public class JawabanPertanyaan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban_pertanyaan2);

        TextView jawabanPertanyaan2 = (TextView) findViewById(R.id.jawabanPertanyaan2);
        TextView list1 = (TextView) findViewById(R.id.list1);
        TextView list2 = (TextView) findViewById(R.id.list2);
        TextView list3 = (TextView) findViewById(R.id.list3);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        jawabanPertanyaan2.setTypeface(allerBold);
        list1.setTypeface(allerRegular);
        list2.setTypeface(allerRegular);
        list3.setTypeface(allerRegular);


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
