package com.janug.backpacker.presenter;

import android.content.Context;
import android.content.Intent;

import com.janug.backpacker.activities.SlideActivity;
import com.janug.backpacker.activities.SplashActivity;

public class SplashPresenter {
    Context context;

    public SplashPresenter(SplashActivity splashActivity) {
    }

    Intent getSlide = new Intent();

    public Intent setSlide() {
        Intent intent = new Intent(context, SlideActivity.class);
        return intent;
    }
}
