package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        ImageView back = (ImageView) findViewById(R.id.backFAQ);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FAQ.this,MainActivity.class);
                startActivity(intent);
            }
        });

        TextView pertanyaan1 = (TextView) findViewById(R.id.pertanyaan1);
        pertanyaan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JawabanPertanyaan1.class);
                startActivity(intent);
            }
        });

        TextView pertanyaan2 = (TextView) findViewById(R.id.pertanyaan2);
        pertanyaan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JawabanPertanyaan2.class);
                startActivity(intent);
            }
        });

        TextView pertanyaan3 = (TextView) findViewById(R.id.pertanyaan3);
        pertanyaan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JawabanPertanyaan3.class);
                startActivity(intent);
            }
        });

        TextView pertanyaan4 = (TextView) findViewById(R.id.pertanyaan4);
        pertanyaan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JawabanPertanyaan4.class);
                startActivity(intent);
            }
        });

        TextView pertanyaan5 = (TextView) findViewById(R.id.pertanyaan5);
        pertanyaan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JawabanPertanyaan5.class);
                startActivity(intent);
            }
        });

    }
}
