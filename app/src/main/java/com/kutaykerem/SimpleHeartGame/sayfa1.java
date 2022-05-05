package com.kutaykerem.SimpleHeartGame;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class sayfa1 extends AppCompatActivity {


    TextView textView1;
    TextView textView2;
    TextView textView3;


    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;
    ImageView imageView23;
    ImageView imageView24;
    ImageView imageView25;
    ImageView imageView26;
    ImageView imageView27;
    ImageView imageView28;
    ImageView imageView29;
    ImageView imageView30;
    ImageView imageView31;
    ImageView imageView32;
    ImageView imageView33;
    ImageView imageView34;
    ImageView imageView35;
    ImageView imageView36;
    ImageView imageView37;
    ImageView imageView38;
    ImageView imageView39;
    ImageView imageView40;
    ImageView imageView41;
    ImageView imageView42;
    ImageView imageView43;
    ImageView imageView44;
    ImageView imageView45;
    ImageView imageView46;
    ImageView imageView47;
    ImageView imageView48;



    ImageView[] dizi;

    Handler handler;
    Runnable runnable;

    int a = 0;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa1);

        imageView1= findViewById(R.id.imageView1);
        imageView2 =findViewById(R.id.imageView2);
        imageView3= findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        imageView7=findViewById(R.id.imageView7);
        imageView8=findViewById(R.id.imageView8);
        imageView9=findViewById(R.id.imageView9);
        imageView10=findViewById(R.id.imageView10);
        imageView11=findViewById(R.id.imageView11);
        imageView12=findViewById(R.id.imageView12);
        imageView13=findViewById(R.id.imageView13);
        imageView14=findViewById(R.id.imageView14);
        imageView15=findViewById(R.id.imageView15);
        imageView16=findViewById(R.id.imageView16);
        imageView17=findViewById(R.id.imageView17);
        imageView18=findViewById(R.id.imageView18);
        imageView19=findViewById(R.id.imageView19);
        imageView20=findViewById(R.id.imageView20);
        imageView21=findViewById(R.id.imageView21);
        imageView22=findViewById(R.id.imageView22);
        imageView23=findViewById(R.id.imageView23);
        imageView24=findViewById(R.id.imageView24);
        imageView25=findViewById(R.id.imageView25);
        imageView26=findViewById(R.id.imageView26);
        imageView27=findViewById(R.id.imageView27);
        imageView28=findViewById(R.id.imageView28);
        imageView29=findViewById(R.id.imageView29);
        imageView30=findViewById(R.id.imageView30);
        imageView31=findViewById(R.id.imageView31);
        imageView32=findViewById(R.id.imageView32);
        imageView33=findViewById(R.id.imageView33);
        imageView34=findViewById(R.id.imageView34);
        imageView35=findViewById(R.id.imageView35);
        imageView36= findViewById(R.id.imageView36);
        imageView37=findViewById(R.id.imageView37);
        imageView38= findViewById(R.id.imageView38);
        imageView39=findViewById(R.id.imageView39);
        imageView40=findViewById(R.id.imageView40);
        imageView41=findViewById(R.id.imageView41);
        imageView42=findViewById(R.id.imageView42);
        imageView43=findViewById(R.id.imageView43);
        imageView44=findViewById(R.id.imageView44);
        imageView45=findViewById(R.id.imageView45);
        imageView46=findViewById(R.id.imageView46);
        imageView47=findViewById(R.id.imageView47);
        imageView48=findViewById(R.id.imageView48);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        dizi = new ImageView[]{imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,imageView19,imageView20,imageView21,imageView22,imageView23,imageView24,imageView25,imageView26,imageView27,imageView28,imageView29,imageView30,imageView31,imageView32,imageView33,imageView34,imageView35,imageView36,imageView37,imageView38,imageView39,imageView40,imageView41,imageView42,imageView43,imageView44,imageView45,imageView46,imageView47,imageView48};

        Hideimage();

        a = 0;
        textView1.setText("Derece:" + a);

        sharedPreferences = this.getSharedPreferences("com.kutaykerem.kalpoyunu", Context.MODE_PRIVATE);

        int a = sharedPreferences.getInt("Rekor:",0);

       if (a == 0){
           textView3.setText("Rekor:");
       }else if (a != 0){
           textView3.setText("Rekor:" + a);
       }

    }

    public void kaydet(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(sayfa1.this);

        alert.setTitle("Kaydet");
        alert.setMessage("Kaydetmek istiyor musunuz ?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            sharedPreferences.edit().putInt("Rekor:",a).apply();



            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();


    }


    public void delete(View view){

        int delete = sharedPreferences.getInt("Rekor:",a);

        sharedPreferences.edit().remove("Rekor:").apply();
        textView3.setText("Rekor:");




    }


    public void cık(View view){

        AlertDialog.Builder cık = new AlertDialog.Builder(sayfa1.this);
        cık.setTitle("ÇIKIŞ");
        cık.setMessage("Çıkmak istiyor Musunuz ?");
        cık.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent geri = new Intent(sayfa1.this, com.kutaykerem.SimpleHeartGame.MainActivity.class);
                startActivity(geri);

            }
        });

        cık.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        cık.show();

    }

 public void arttır(View view){

        a ++;
        textView1.setText("Derece:"+ a);

    }




    public void Hideimage(){

        CountDownTimer countDownTimer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long l) {

                textView2.setText("Kalan Zaman:" + l / 1000);

            }

            @Override
            public void onFinish() {
                textView2.setText("Süreniz Bitti !");
                Toast.makeText(sayfa1.this,"Süreniz Bitti !",Toast.LENGTH_LONG).show();
                handler.removeCallbacks(runnable);
                for (ImageView image : dizi){
                    image.setVisibility(View.INVISIBLE);
                }

            }
        }.start();



        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                for (ImageView image : dizi){
                    image.setVisibility(View.INVISIBLE);
                }
                Random random = new Random();
                int i = random.nextInt(48);
                dizi[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this,500);

            }
        };
        handler.post(runnable);

    }


}