package com.example.havadurumu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.InputStream;


public class MainActivity extends AppCompatActivity {
    TextView derece;
    TextView sehir;
    ImageView img;
    ProgressBar yuklenme;
    int Fahrenheit_to_Celcius;
    int ilkKarakter, ikinciKarakter;
    String celcius;
    String sehirAdi;
    String imgName;
    String imgUri;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        derece = findViewById(R.id.derece);
        yuklenme = findViewById(R.id.progressBar);
        sehir = findViewById(R.id.sehirAdi);
        if(isNetworkAvailable()) new task().execute("https://www.google.com/search?ei=5BSvXumPFtC36ATUlapo&q=hava+durumu&oq=hava+durumu&gs_lcp=CgZwc3ktYWIQAzIMCAAQgwEQQxBGEIACMgIIADICCAAyAggAMgIIADIFCAAQgwEyBQgAEIMBMgUIABCDATICCAAyBQgAEIMBOgQIABBHOgcIABCDARBDUMGyBljWvgZgm8AGaABwAngBgAHfAogBgxKSAQcwLjQuNC4ymAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwjpkabEsJjpAhXQG5oKHdSKCg0Q4dUDCAs&uact=5");
        else {yuklenme.setVisibility(View.GONE); derece.setText("Bağlantı Yok");}
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private class task extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... p) {
            try {
                String url = p[0];
                Document d = Jsoup.connect(url).get();

                Element e1 = d.selectFirst("div[class=\"vk_bk sol-tmp\"]");
                String dereceHtml = e1.selectFirst("span").toString();
                ilkKarakter = dereceHtml.indexOf(">");
                ikinciKarakter = dereceHtml.indexOf("<", dereceHtml.indexOf("<") + 1);
                celcius = dereceHtml.substring(ilkKarakter + 1, ikinciKarakter);

                Element e2 = d.selectFirst("div[class=\"vk_gy vk_h\"]");
                String sehirHtml = e2.toString();
                ilkKarakter = sehirHtml.indexOf(">");
                ikinciKarakter = sehirHtml.indexOf("<", sehirHtml.indexOf("<") + 1);
                sehirAdi = sehirHtml.substring(ilkKarakter + 1, ikinciKarakter);

                Element e3 = d.selectFirst("div[class=\"wob_df wob_ds\"]");
                String imgHtml = e3.selectFirst("img").toString();
                imgUri = "";
                int baslangic = imgHtml.indexOf("\"", imgHtml.indexOf("src")) + 1;
                int bitis = imgHtml.indexOf("\"", baslangic);
                for (int i = baslangic; i < bitis; i++) {
                    imgUri += imgHtml.charAt(i);
                }
                System.out.println("İmg URİ : " + imgUri);
                Picasso.with(MainActivity.this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBxTEtIzTykWwckXBAk9Z0GKePebU8A452-tR51ZgGnqXm6pqf").placeholder(R.drawable.download).into(img);
                /*Element e1 = d.selectFirst("div[class=\"today_nowcard-temp\"]");
                String d1 = e1.selectFirst("span").toString();
                int karakterIlk = d1.indexOf(">");
                int karakterIkı = d1.indexOf("<", d1.indexOf("<") + 1);
                String dereceString = d1.substring(karakterIlk + 1, karakterIkı);
                double fahrenheit = Integer.parseInt(dereceString);
                Fahrenheit_to_Celcius = (int) (Math.round((fahrenheit - 32) * (0.5556)));

                Element e2 = d.selectFirst("h1[class=\"h4 today_nowcard-location\"]");
                String sehirHtml = e2.selectFirst("h1").toString();
                int karakter = sehirHtml.indexOf(">");
                int karakter2 = sehirHtml.indexOf("<", sehirHtml.indexOf("<") + 1);
                sehirAdi = sehirHtml.substring(karakter + 1, karakter2);*/

            } catch (Exception e) {

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            yuklenme.setVisibility(View.GONE);
            sehir.setText(sehirAdi);
            derece.setText(celcius + "°");

            //derece.setText(Fahrenheit_to_Celcius + "°");

        }

    }

}
