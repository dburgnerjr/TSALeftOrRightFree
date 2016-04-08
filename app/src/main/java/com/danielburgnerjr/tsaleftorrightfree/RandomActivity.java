package com.danielburgnerjr.tsaleftorrightfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.*;

public class RandomActivity extends AppCompatActivity {

    private ImageView imvLeftArrow;
    private ImageView imvRightArrow;
    private Button btnTryAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        imvLeftArrow   = (ImageView)findViewById(R.id.imgLeft);
        imvRightArrow   = (ImageView)findViewById(R.id.imgRight);
        btnTryAgain   = (Button)findViewById(R.id.btnTryAgain);

        imvLeftArrow.setVisibility(View.GONE);
        imvRightArrow.setVisibility(View.GONE);
        btnTryAgain.setVisibility(View.GONE);

        randomize();
    }

    protected void randomize() {
        Random rndR;
        int nChoice = rndR.nextInt(2);

        // if nChoice = 0 left arrow, else right arrow
        if (nChoice == 0) {
            imvLeftArrow.setVisibility(View.VISIBLE);
            imvRightArrow.setVisibility(View.INVISIBLE);
            btnTryAgain.setVisibility(View.INVISIBLE);
        } else {
            imvLeftArrow.setVisibility(View.INVISIBLE);
            imvRightArrow.setVisibility(View.VISIBLE);
            btnTryAgain.setVisibility(View.INVISIBLE);
        }
        for (int nI = 0; nI < 5000; nI++) {

        }
        if (nChoice == 0) {
            imvLeftArrow.setVisibility(View.INVISIBLE);
        } else {
            imvRightArrow.setVisibility(View.INVISIBLE);
        }
        btnTryAgain.setVisibility(View.VISIBLE);
    }
}
