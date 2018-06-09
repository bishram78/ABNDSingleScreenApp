package com.abnd.bussinesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivGoogleP;
    private ImageView ivFacebook;
    private ImageView ivTwitter;
    private ImageView ivInstagram;
    private TextView tvContactNumber;
    private TextView tvOfficeAddress;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);

        readLayoutViews();
        contactNumberClickEvent();
        officeAddressClickEvent();
        googlePlusClickEvent();
        facebookClickEvent();
        twitterClickEvent();
        instagramClickEvent();
    }

    public void readLayoutViews() {
        ivFacebook = findViewById(R.id.id_abc_iv_facebook);
        ivGoogleP = findViewById(R.id.id_abc_iv_google_p);
        ivInstagram = findViewById(R.id.id_abc_iv_instagram);
        ivTwitter = findViewById(R.id.id_abc_iv_twitter);
        tvContactNumber = findViewById(R.id.id_abc_tv_mob_no);
        tvOfficeAddress = findViewById(R.id.id_abc_tv_office_address);
    }

    public void contactNumberClickEvent() {
        tvContactNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: +91 77 62 935350"));
                startActivity(intent);
            }
        });
    }

    public void officeAddressClickEvent() {
        tvOfficeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo: 22.5474, 85.85.8025"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    public void googlePlusClickEvent() {
        ivGoogleP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/"));
                startActivity(intent);
            }
        });
    }

    public void facebookClickEvent() {
        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);
            }
        });
    }

    public void twitterClickEvent() {
        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
                startActivity(intent);
            }
        });
    }

    public void instagramClickEvent() {
        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(intent);
            }
        });
    }
}
