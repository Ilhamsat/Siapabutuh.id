package id.kodec.siapabutuh.siapabutuhid;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import id.kodec.siapabutuh.siapabutuhid._sliders.FragmentSlider;
import id.kodec.siapabutuh.siapabutuhid._sliders.SliderIndicator;
import id.kodec.siapabutuh.siapabutuhid._sliders.SliderPagerAdapter;
import id.kodec.siapabutuh.siapabutuhid._sliders.SliderView;

public class MainActivity extends AppCompatActivity {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;
    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
//        viewPager.setAdapter(viewPagerAdapter);

        ImageButton buttonMakanan = (ImageButton) findViewById(R.id.buttonMakanan);
        buttonMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiMakanan.class);
                startActivity(intent);
            }
        });

        ImageButton buttonUang = (ImageButton) findViewById(R.id.buttonUang);
        buttonUang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiUang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonBarang = (ImageButton) findViewById(R.id.buttonBarang);
        buttonBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiBarang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonFAQ = (ImageButton) findViewById(R.id.buttonFaq);
        buttonFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FAQ.class);
                startActivity(intent);
            }
        });

        ImageButton buttonTentang = (ImageButton) findViewById(R.id.buttonInfoo);
        buttonTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tentang.class);
                startActivity(intent);
            }
        });

        ImageButton buttonBerita = (ImageButton) findViewById(R.id.buttonBerita);
        buttonBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Berita.class);
                startActivity(intent);
            }
        });

        sliderView = (SliderView) findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) findViewById(R.id.pagesContainer);
        setupSlider();

    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));

        mAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(this, mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

}
