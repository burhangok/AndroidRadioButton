package com.example.lab08.gridlayout;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    public RadioGroup egitimDurumu;
    public RadioButton secilenEgitim;
    public String secilenEgitimDurumu;
    public Button kaydetB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egitimDurumu=findViewById(R.id.egitimSecenekleri);


/* Seçimlerde bir hareketlilik olursa yani seçeneklerden birisi seçilirse çalışacak kod
        egitimDurumu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                secilenEgitim=findViewById(checkedId);

                secilenEgitimDurumu=secilenEgitim.getText()+"";

                Toast.makeText(MainActivity.this, secilenEgitimDurumu, Toast.LENGTH_SHORT).show();
            }
        });
*/



// Butona tıklanıldıktan sonra seçimleri kontrol ediyoruz
        kaydetB=findViewById(R.id.kaydet);



        kaydetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secilenEgitim= findViewById(egitimDurumu.getCheckedRadioButtonId());
                secilenEgitimDurumu=secilenEgitim.getText().toString();
                Toast.makeText(MainActivity.this, secilenEgitimDurumu, Toast.LENGTH_SHORT).show();
            }
        });
    }



}

