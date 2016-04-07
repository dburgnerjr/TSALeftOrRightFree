package com.danielburgnerjr.tsaleftorrightfree;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MenuActivity extends AppCompatActivity {

    String strPackName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        strPackName = getApplicationContext().getPackageName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final Button btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Coming soon", Toast.LENGTH_SHORT).show();
                //Intent intA = new Intent(MenuActivity.this, AboutActivity.class);
                //startActivity(intA);
            }
        });

        final Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Coming soon", Toast.LENGTH_SHORT).show();
                //Intent intA = new Intent(MenuActivity.this, RandomActivity.class);
                //startActivity(intA);
            }
        });

        final Button btnShare = (Button) findViewById(R.id.btnShare);
        btnShare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intI = new Intent(Intent.ACTION_SEND);
                intI.setType("text/plain");
                intI.putExtra(Intent.EXTRA_SUBJECT, "TSA Left or Right Free");
                String sAux = "\nLet me recommend you this application\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?id=" + strPackName + "\n\n";
                intI.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(intI, "choose one"));
            }
        });

        final Button btnUpgrade = (Button) findViewById(R.id.btnUpgrade);
        btnUpgrade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String strPackPremiumName = "com.danielburgnerjr.tsaleftorrightpremium";
                Uri uri = Uri.parse("market://details?id=" + strPackPremiumName);
                Toast.makeText(getApplicationContext(), "Coming soon", Toast.LENGTH_SHORT).show();
/*              Intent newActivity = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(newActivity);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + strPackPremiumName)));
                }
 */         }
        });

    }
}
