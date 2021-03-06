package com.ptp.phamtanphat.animation0406;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void AnimationAlpha(View v){
        SetAnimation(R.anim.animation_alpha, v);
    }
    public void AnimationScale(View v){
        //X se tang khi di tu phai sang trai
        //Y se tang khi di tu duoi len tren
        SetAnimation(R.anim.animation_scale, v);
    }
    public void AnimationRotate(View v){
        //X se tang khi di tu phai sang trai
        //Y se tang khi di tu tren xuong duoi
        SetAnimation(R.anim.animation_rotate, v);
    }
    public void AnimationTranslate(View v){
        //X se tang khi di tu phai sang trai
        //Y se tang khi di tu tren xuong duoi
        SetAnimation(R.anim.animation_translate, v);
    }
    public void SetAnimation(int animation , View v){
        animationView = AnimationUtils.loadAnimation(MainActivity.this,animation);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationView);
            }
        });
    }
}
