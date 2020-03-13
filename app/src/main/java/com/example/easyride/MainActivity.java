package com.example.easyride;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easyride.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

  public static final String mode = "";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button driver_mode_button = findViewById(R.id.driver_mode_button);
    Button rider_mode_button = findViewById(R.id.rider_mode_button);

    driver_mode_button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        i.putExtra(mode, "driver" );
        startActivity(i);

      }
    });

    rider_mode_button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        i.putExtra(mode, "rider" );
        startActivity(i);

      }
    });



  }
}
