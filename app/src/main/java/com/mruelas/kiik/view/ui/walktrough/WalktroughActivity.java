package com.mruelas.kiik.view.ui.walktrough;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mruelas.kiik.R;
import com.mruelas.kiik.view.ui.LoginActivity;
import com.mruelas.kiik.view.ui.SignupActivity;

public class WalktroughActivity extends AppCompatActivity {

    private ViewPager mPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walktrough);

        mPager = findViewById(R.id.vp_slider);
        pagerAdapter = new SliderAdapter(this);
        mPager.setAdapter(pagerAdapter);


    }


    public void goToLogin(View view) {

        Intent intent = new Intent(WalktroughActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }

    public void goToSignUp(View view) {
        Intent intent = new Intent(WalktroughActivity.this, SignupActivity.class);
        startActivity(intent);
        finish();
    }

}
