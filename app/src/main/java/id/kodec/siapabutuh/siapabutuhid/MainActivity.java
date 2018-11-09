package id.kodec.siapabutuh.siapabutuhid;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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

    Dialog epicDialog;
    TextView pilih1M;
    TextView pilih2M;
    TextView pilih1B;
    TextView pilih2B;
    ImageView buttonClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
//        viewPager.setAdapter(viewPagerAdapter);

        TextView textDonasi = (TextView) findViewById(R.id.textDonasi);
        TextView textInfo = (TextView) findViewById(R.id.textInfo);
        TextView textMakanan = (TextView) findViewById(R.id.textMakanan);
        TextView textUang = (TextView) findViewById(R.id.textUang);
        TextView textBarang = (TextView) findViewById(R.id.textBarang);
        TextView textFAQ = (TextView) findViewById(R.id.textFaq);
        TextView textBerita = (TextView) findViewById(R.id.textBerita);
        TextView textInfoo = (TextView) findViewById(R.id.textInfoo);
        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        Typeface allerRegular =Typeface.createFromAsset(getAssets(),"font/Aller_Rg.ttf");

        textDonasi.setTypeface(allerBold);
        textInfo.setTypeface(allerBold);
        textMakanan.setTypeface(allerRegular);
        textUang.setTypeface(allerRegular);
        textBarang.setTypeface(allerRegular);
        textFAQ.setTypeface(allerRegular);
        textBerita.setTypeface(allerRegular);
        textInfoo.setTypeface(allerRegular);

        ImageButton buttonMakanan = (ImageButton) findViewById(R.id.buttonMakanan);
        buttonMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopupM();
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
                ShowPopupB();
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

        epicDialog = new Dialog(this);
        pilih1M = (TextView) findViewById(R.id.pilih1M);
        pilih2M = (TextView) findViewById(R.id.pilih2M);
        pilih1B = (TextView) findViewById(R.id.pilih1B);
        pilih2B = (TextView) findViewById(R.id.pilih2B);



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

    public void ShowPopupM(){
        epicDialog.setContentView(R.layout.epic_popup);
        buttonClose = (ImageView) epicDialog.findViewById(R.id.buttonClose);
        pilih1M = (TextView) epicDialog.findViewById(R.id.pilih1M);
        pilih2M = (TextView) epicDialog.findViewById(R.id.pilih2M);
        CardView cardViewM = (CardView) epicDialog.findViewById(R.id.cardViewM);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        pilih1M.setTypeface(allerBold);
        pilih2M.setTypeface(allerBold);

        cardViewM.setCardBackgroundColor(Color.argb(69, 255, 255, 255));
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        pilih1M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiMakanan.class);
                startActivity(intent);
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(89, 52, 62, 69)));
        epicDialog.show();

    }

    public void ShowPopupB(){
        epicDialog.setContentView(R.layout.epic_popup_barang);
        buttonClose = (ImageView) epicDialog.findViewById(R.id.buttonClose);
        pilih1B = (TextView) epicDialog.findViewById(R.id.pilih1B);
        pilih2B = (TextView) epicDialog.findViewById(R.id.pilih2B);
        CardView cardViewB = (CardView) epicDialog.findViewById(R.id.cardViewB);

        Typeface allerBold =Typeface.createFromAsset(getAssets(),"font/Aller Bold.ttf");
        pilih1B.setTypeface(allerBold);
        pilih2B.setTypeface(allerBold);

        cardViewB.setCardBackgroundColor(Color.argb(69, 255, 255, 255));
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                epicDialog.dismiss();
            }
        });

        pilih1B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DonasiBarang.class);
                startActivity(intent);
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(89, 52, 62, 69)));
        epicDialog.show();

    }


}
