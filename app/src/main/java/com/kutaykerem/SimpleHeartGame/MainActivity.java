package com.kutaykerem.SimpleHeartGame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



  }

  public void Basla(View view){

        Intent ileri = new Intent(MainActivity.this, com.kutaykerem.SimpleHeartGame.sayfa1.class);
        startActivity(ileri);


}

  public void cıkıs(View view){

      AlertDialog.Builder çıkış = new AlertDialog.Builder(MainActivity.this);
      çıkış.setTitle("Çıkış");
      çıkış.setMessage("Çıkmak istediğinze emin misiniz ?");
      çıkış.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {

              Intent setIntent = new Intent(Intent.ACTION_MAIN);
              setIntent.addCategory(Intent.CATEGORY_HOME);
              setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              startActivity(setIntent);

          }
      });

      çıkış.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {

          }
      });
      çıkış.show();

  }

    private void finish(MainActivity mainActivity, Class<sayfa1> sayfa1Class) {
    }

}