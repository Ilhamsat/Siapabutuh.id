package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Berita extends AppCompatActivity {
    List<Info> infoList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        ImageView back = (ImageView) findViewById(R.id.backBerita);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Berita.this,MainActivity.class);
                startActivity(intent);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        infoList = new ArrayList<>();
        infoList.add(
                new Info(
                        1,
                        "Siapabutuh.id Mendapat Penghargaan",
                        "10 November 2018",
                        "Selengkapnya>>",
                        R.drawable.slide1));
        infoList.add(
                new Info(
                        1,
                        "Siapabutuh.id Mendapat Penghargaan",
                        "10 November 2018",
                        "Selengkapnya>>",
                        R.drawable.slide1));
        infoList.add(
                new Info(
                        1,
                        "Siapabutuh.id Mendapat Penghargaan",
                        "10 November 2018",
                        "Selengkapnya>>",
                        R.drawable.slide1));
        infoList.add(
                new Info(
                        1,
                        "Siapabutuh.id Mendapat Penghargaan",
                        "10 November 2018",
                        "Selengkapnya>>",
                        R.drawable.slide1));

        InfoAdapter adapter = new InfoAdapter(this, infoList);
//setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
