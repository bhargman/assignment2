package com.csci38004.assignment2;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.SeekBar;

/**
 * Note: See {@link AppCompatSeekBar.OnSeekBarChangeListener} to see how to setup interaction
 * listeners for a seek bar.
 */
public class ObjectAnimationsActivity extends AppCompatActivity {

    private View preview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animations);

        preview = findViewById(R.id.preview);
    }

    /**
     * TODO:
     * Call this method from a {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
     * to update {@link ObjectAnimationsActivity#preview}'s backgroundColor. Use each seekbar's
     * {@link AppCompatSeekBar#getProgress()} method to get the progress as an int. Then pass each
     * progress' int to {@link Color#argb(int, int, int, int)} to convert the ints to a {@link Color}.
     * Lastly, use {@link ObjectAnimator#ofArgb(Object, String, int...)} to update the preview's
     * "backgroundColor" property with an animation duration of 300L.
     */
    private void updatePreview() {

    }
}
