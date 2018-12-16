package com.android.launcher3;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MyLaucnher extends LauncherExtension {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void populateCustomContentContainer() {
        super.populateCustomContentContainer();
        FrameLayout customContent = new FrameLayout(this);
        customContent.setBackgroundColor(Color.BLUE);
        addToCustomContentPage(customContent, mCustomContentCallbacks, "");
    }

    CustomContentCallbacks mCustomContentCallbacks = new CustomContentCallbacks() {

        @Override
        public void onShow(boolean fromResume) {

        }

        @Override
        public void onHide() {

        }

        @Override
        public void onScrollProgressChanged(float progress) {

        }

        @Override
        public boolean isScrollingAllowed() {
            return false;
        }
    };

}
