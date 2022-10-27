package com.example.collegemanagementapp.faculty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.collegemanagementapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UpdateFaculty extends AppCompatActivity {
FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_faculty);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UpdateFaculty.this,AddTeacher.class));
            }
        });
    }
}