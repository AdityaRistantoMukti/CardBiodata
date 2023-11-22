package com.arm.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
Button btn_toast;
ImageView ig_img,fb_img,gmail_img;
LottieAnimationView loadingAnimation,loading_ig,loading_fb,loading_gmail;
LinearLayout ig,fb,mail,top_layout,card_layout,sosial_media,profile_layout;
TextView title;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast = findViewById(R.id.button_toast);
        loadingAnimation = findViewById(R.id.loading_animation);
        loading_ig = findViewById(R.id.loading_ig);
        loading_fb = findViewById(R.id.loading_fb);
        loading_gmail = findViewById(R.id.loading_gmail);
        ig_img = findViewById(R.id.ig);
        fb_img = findViewById(R.id.fb_img);
        gmail_img = findViewById(R.id.gmail_img);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Loading animation terlihat
                loadingAnimation.setVisibility(View.VISIBLE);
                loadingAnimation.playAnimation();
                // Membuat tulisan didalam Button menghilang
                btn_toast.setText("");

                // Handler
                new Handler().postDelayed(this::resetButton, 2000);
            }
            private void resetButton(){
                // Membuat Loading Animation Menghilang
                loadingAnimation.pauseAnimation();
                loadingAnimation.setVisibility(View.INVISIBLE);
                // Membuat text pada Button kembali terlihat
                btn_toast.setText("Click Button");
                // Membuat Toast
                Toast.makeText(getApplicationContext(),
                        "Haloooo 🙋‍♂️", Toast.LENGTH_SHORT).show();
            }
        });

        // Instagram
        ig = findViewById(R.id.instagram_layout);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Loading animation terlihat
                sosial_media.setVisibility(View.VISIBLE);
                loading_ig.setVisibility(View.VISIBLE);
                loading_ig.playAnimation();
                // Membuat Gambar menghilang
                ig_img.setVisibility(View.INVISIBLE);

                // Handler
                new Handler().postDelayed(this::resetImg, 2000);

            }
            private void resetImg(){
                // Membuat Loading Animation Menghilang
                loading_ig.pauseAnimation();
                loading_ig.setVisibility(View.INVISIBLE);
                // Membuat Gambar kembali terlihat
                ig_img.setVisibility(View.VISIBLE);
                // Membuat Toast
                Toast.makeText(getApplicationContext(),
                        "@adttt21",Toast.LENGTH_SHORT).show();
            }
        });

        fb = findViewById(R.id.facebook);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Loading animation terlihat
                sosial_media.setVisibility(View.VISIBLE);
                loading_fb.setVisibility(View.VISIBLE);
                loading_fb.playAnimation();
                // Membuat Gambar menghilang
                fb_img.setVisibility(View.INVISIBLE);

                // Handler
                new Handler().postDelayed(this::resetImg, 2000);

            }
            private void resetImg(){
                // Membuat Loading Animation Menghilang
                loading_fb.pauseAnimation();
                loading_fb.setVisibility(View.INVISIBLE);
                // Membuat Gambar kembali terlihat
                fb_img.setVisibility(View.VISIBLE);
                // Membuat Toast
                Toast.makeText(getApplicationContext(),
                        "fb",Toast.LENGTH_SHORT).show();
            }

        });

        mail = findViewById(R.id.gmail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Loading animation terlihat
                sosial_media.setVisibility(View.VISIBLE);
                loading_gmail.setVisibility(View.VISIBLE);
                loading_gmail.playAnimation();
                // Membuat Gambar menghilang
                gmail_img.setVisibility(View.INVISIBLE);

                // Handler
                new Handler().postDelayed(this::resetImg, 2000);

            }
            private void resetImg(){
                // Membuat Loading Animation Menghilang
                loading_gmail.pauseAnimation();
                loading_gmail.setVisibility(View.INVISIBLE);
                // Membuat Gambar kembali terlihat
                gmail_img.setVisibility(View.VISIBLE);
                // Membuat Toast
                Toast.makeText(getApplicationContext(),
                        "adityaristanto70@gmail.com",Toast.LENGTH_SHORT).show();
            }


        });


//        Animate
//        Top Layout
        top_layout = findViewById(R.id.top_layout);
        top_layout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_down));

//
         Handler handler = new Handler();
         Runnable runnable = new Runnable() {
             @Override
             public void run() {

//                 Title
                 title = findViewById(R.id.title);
                 title.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
//                 Card Layout
                 card_layout = findViewById(R.id.card_layout);
                 card_layout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
//                 Sosial Media
                 sosial_media = findViewById(R.id.sosial_media);
                 sosial_media.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
//                 Profile Layout
                 profile_layout = findViewById(R.id.profile_layout);
                 profile_layout.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
             }
         };

         handler.postDelayed(runnable,1000);

    }
}