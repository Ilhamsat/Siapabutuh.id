package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThanksMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks_makanan);

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
