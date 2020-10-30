package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private FirebaseAuth mAuth ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance() ;

    }
    @Override
    publi void onStart() {
        super.onStart()
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser) ;
    }
}
