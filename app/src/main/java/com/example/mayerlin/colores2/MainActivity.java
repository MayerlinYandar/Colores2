package com.example.mayerlin.colores2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar seekBarRed, seekBarGreen, seekBarBlue, seekBarAlpha;
    View viewBackground;
    int seekR, seekG, seekA, seekB;

    TextView NumberText;
    TextView NumberText2;
    TextView NumberText3;
    TextView NumberText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarRed = (SeekBar) findViewById(R.id.id_sb_red);
        seekBarGreen = (SeekBar) findViewById(R.id.id_sb_green);
        seekBarBlue = (SeekBar) findViewById(R.id.id_sb_blue);
        seekBarAlpha = (SeekBar) findViewById(R.id.id_sb_alpha);
        viewBackground = (View) findViewById(R.id.id_v_background);

        NumberText = (TextView) findViewById(R.id.seekNumber);
        NumberText2 = (TextView) findViewById(R.id.seekNumber2);
        NumberText3 = (TextView) findViewById(R.id.seekNumber3);
        NumberText4 = (TextView) findViewById(R.id.seekNumber4);

        seekBarRed.setOnSeekBarChangeListener(this);
        seekBarGreen.setOnSeekBarChangeListener(this);
        seekBarBlue.setOnSeekBarChangeListener(this);
        seekBarAlpha.setOnSeekBarChangeListener(this);
    }

    public void updateBackground(){
        seekR = seekBarRed.getProgress();
        seekG = seekBarGreen.getProgress();
        seekB = seekBarBlue.getProgress();
        seekA = seekBarAlpha.getProgress();

        int color = Color.argb(seekR, seekB, seekG, seekA);
        viewBackground.setBackgroundColor(color);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        UpdateBackground();
        NumberSeekR=seekBarRed.getProgress();
        NumberText.setText(String.valueOf(NumberSeekR));
        NumberseekG=seekBarGreen.getProgress();
        NumberText2.setText(String.valueOf(NumberseekG));
        NumberseekB=seekBarBlue.getProgress();
        NumberText3.setText(String.valueOf(NumberseekB));
        NumberseekA=seekBarAlpha.getProgress();
        NumberText4.setText(String.valueOf(NumberseekA));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
