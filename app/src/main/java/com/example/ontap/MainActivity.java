package com.example.ontap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvhinh;
    public static ArrayList<HinhAnh>arrayImage=new ArrayList<>();
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        adapter =new HinhAnhAdapter(this,arrayImage,R.layout.dong_hinh_anh);
        gvhinh.setAdapter(adapter);
        gvhinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayImage.get(position).getLink(), Toast.LENGTH_SHORT).show();
                //Intent intent=new Intent(MainActivity.this,WebActivity.class);
                setContentView(R.layout.activity_web);
                WebView webView=findViewById(R.id.web_1);
                webView.loadUrl(arrayImage.get(position).getLink());
                webView.getSettings().setJavaScriptEnabled(true);
                //startActivity(intent);

            }
        });
    }

    private void init() {
        gvhinh=findViewById(R.id.gvh);
        arrayImage=new ArrayList<>();
        arrayImage.add(new HinhAnh("Cocacola",R.drawable.cocacola,"https://www.cocacolavietnam.com"));
        arrayImage.add(new HinhAnh("Pesi",R.drawable.pepsi,"https://www.suntorypepsico.vn/vi"));
        arrayImage.add(new HinhAnh("Iphone",R.drawable.iphone,"https://www.apple.com/vn/iphone/"));
        arrayImage.add(new HinhAnh("MiLo",R.drawable.milo,"https://www.nestlemilo.com.vn/"));
        arrayImage.add(new HinhAnh("FPT",R.drawable.fpt,"https://fptshop.com.vn/"));
        arrayImage.add(new HinhAnh("Samsung",R.drawable.samsung,"https://www.samsung.com/vn/"));
        arrayImage.add(new HinhAnh("Xiaomi",R.drawable.xiaomi,"https://www.mi.com/vn"));
        arrayImage.add(new HinhAnh("VinaMilk",R.drawable.vinamik,"https://www.vinamilk.com.vn/"));
        arrayImage.add(new HinhAnh("VinGroup",R.drawable.vingroup,"https://www.vingroup.net/"));
        arrayImage.add(new HinhAnh("Nestle",R.drawable.nestle,"https://www.nestle.com.vn/"));

    }
}
