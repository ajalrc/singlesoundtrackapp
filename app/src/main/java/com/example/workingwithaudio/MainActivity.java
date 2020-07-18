package com.example.workingwithaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    /**
     * Here look below how you are suppose to use Media Player object and initialise the piano music
     * here R is another object that we would be using to call the music  file that we have.
     */
    MediaPlayer pianomusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianomusic=MediaPlayer.create(this, R.raw.paino);
        Switch switch_looping= findViewById(R.id.switch_looping);
        /**
         * after creating the switch we have to do something to it right and so, we would be using set on click listener with
         * many of the unknown values. Here on checked change means the change in swtich what to do  if there is change in switch
         */
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                pianomusic.setLooping(isChecked);// so I am seeing whether to loop based on the value of isChecked
            }
        });
    }
    //so basically here you would be simply calling the variable associated with the music and there are alreadu build in methods to
    //just call the methods associated with playing and pausing the music.
    public void playmusic(View v){
        pianomusic.start();
    }
    public void pausemusic(View v){
        if(pianomusic.isPlaying()){
            pianomusic.pause();
        }
    }

    }
