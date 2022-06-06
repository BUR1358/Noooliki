package com.bur.noliki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class PlayerName extends AppCompatActivity {
    private EditText playerNameEditText;
    private AppCompatButton startGameBtn;
    private String getPlyerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_player_name);
        playerNameEditText = findViewById(R.id.playerNameEditText);
        startGameBtn = findViewById(R.id.starGameBtn);
        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPlyerName = playerNameEditText.getText().toString();
                if (getPlyerName.isEmpty()) {
                    Toast.makeText(PlayerName.this, R.string.please_enter_name, Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(PlayerName.this, MainActivity.class);
                    intent.putExtra("playerName", getPlyerName);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}