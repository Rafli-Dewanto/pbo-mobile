package com.example.pboandroid.utils;

import android.app.Activity;
import android.content.Intent;

import com.example.pboandroid.R;
import com.example.pboandroid.components.DynamicAppBar;

public class AppBar {
    public static void setupActionBar(Activity activity, String title, Class<?> targetActivity) {
        DynamicAppBar appBar = activity.findViewById(R.id.appbar);
        appBar.setTitle(title);
        appBar.setBackButtonClickListener(v -> {
            Intent intent = new Intent(activity, targetActivity);
            activity.startActivity(intent);
            activity.finish();
        });
    }
}
