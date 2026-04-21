package com.example.portfolioapp;

import android.os.Bundle;
import android.os.Environment;
import android.widget.*;
import java.io.*;
import androidx.appcompat.app.AppCompatActivity;

public class StorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        EditText etNote = findViewById(R.id.etNote);

        findViewById(R.id.btnSaveNote).setOnClickListener(v -> {
            try {
                File file = new File(getExternalFilesDir(null), "notes.txt");
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(etNote.getText().toString().getBytes());
                fos.close();
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
