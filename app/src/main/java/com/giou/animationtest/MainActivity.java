package com.giou.animationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.btn_alpha)
    Button mBtnAlpha;
    @InjectView(R.id.btn_scale)
    Button mBtnScale;
    @InjectView(R.id.btn_translate)
    Button mBtnTranslate;
    @InjectView(R.id.btn_rotate)
    Button mBtnRotate;
    @InjectView(R.id.tv_test)
    TextView mTvTest;
    @InjectView(R.id.btn_set)
    Button mBtnSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.btn_alpha, R.id.btn_scale, R.id.btn_translate, R.id.btn_rotate,R.id.btn_set})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_alpha:
                Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
                alphaAnimation.setDuration(3000);
                alphaAnimation.setRepeatCount(3);
                alphaAnimation.setRepeatCount(Animation.RESTART);
                mTvTest.startAnimation(alphaAnimation);
                break;
            case R.id.btn_scale:
                Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
                scaleAnimation.setDuration(3000);
                scaleAnimation.setRepeatCount(3);
                scaleAnimation.setRepeatMode(Animation.REVERSE);
                scaleAnimation.setFillAfter(true);
                mTvTest.startAnimation(scaleAnimation);
                break;
            case R.id.btn_translate:
                Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
                translateAnimation.setDuration(3000);
                translateAnimation.setRepeatCount(3);
                mTvTest.startAnimation(translateAnimation);
                break;
            case R.id.btn_rotate:
                Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
                rotateAnimation.setDuration(3000);
                rotateAnimation.setRepeatCount(2);
                rotateAnimation.setRepeatCount(Animation.REVERSE);
                rotateAnimation.setFillAfter(true);
                mTvTest.startAnimation(rotateAnimation);
                break;

            case R.id.btn_set:
                Animation setAnimation = AnimationUtils.loadAnimation(this, R.anim.set_anim);
                setAnimation.setDuration(3000);
                setAnimation.setRepeatCount(3);
                setAnimation.setRepeatCount(Animation.REVERSE);
                mTvTest.startAnimation(setAnimation);
                break;
        }
    }

}
