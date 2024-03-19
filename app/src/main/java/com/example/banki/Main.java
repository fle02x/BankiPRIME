package com.example.banki;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Main extends AppCompatActivity {
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        login = (Button) findViewById(R.id.go1);
    }
    public void Login(View view) {
        Intent intent = new Intent(Main.this,MainActivity.class);
        startActivity(intent);
    }
}