package com.app.multipleintent.Activities.first;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.app.multipleintent.Activities.eight.EightActivity;
import com.app.multipleintent.Activities.fifth.FifthActivity;
import com.app.multipleintent.Activities.forth.ForthActivity;
import com.app.multipleintent.Activities.nine.NineActivity;
import com.app.multipleintent.Activities.second.SecondActivity;
import com.app.multipleintent.Activities.seven.SevenActivity;
import com.app.multipleintent.Activities.sixth.SixActivity;
import com.app.multipleintent.Activities.ten.TenActivity;
import com.app.multipleintent.Activities.third.ThirdActivity;
import com.app.multipleintent.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    Button second,third,forth,fifth,sixth,seven,eight,nine,ten, button;
    EditText data;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
        click();
        passData();
        setData();

        //way to play youtube video
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "tj5sLSFjVj4";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
    }

    private void setData() {

        Bundle bundle2 = getIntent().getExtras();
        if(bundle2 != null) {
            String message2 = bundle2.getString("message");
            textView.setText(message2);
            Log.d("success ",message2);
        }
    }

    void initUi() {
        second = (Button)findViewById(R.id.first_btn4);
        third = (Button)findViewById(R.id.third_btn);
        forth = (Button)findViewById(R.id.third_btn4);
        fifth = (Button)findViewById(R.id.forth_btn);
        sixth = (Button)findViewById(R.id.fifth_btn4);
        seven = (Button)findViewById(R.id.sixth_btn4);
        eight = (Button)findViewById(R.id.seven_btn4);
        nine = (Button)findViewById(R.id.eight_btn4);
        ten = (Button)findViewById(R.id.ten_btn4);

        //data pass
        data = (EditText)findViewById(R.id.data_ET1);
        textView = (TextView)findViewById(R.id.data_TV1);

        button = (Button)findViewById(R.id.btn);
    }


   public void passData() {

        //media player object.
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.second);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.third);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.forth);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.fifth);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.six);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.seven);
        MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.eighgt);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.nine);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.ten);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();
                    mediaPlayer2.start();
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();
                    mediaPlayer3.start();
                    Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer4.start();
                    Intent intent = new Intent(MainActivity.this,ForthActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer5.start();
                    Intent intent = new Intent(MainActivity.this,FifthActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer6.start();
                    Intent intent = new Intent(MainActivity.this,SixActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer7.start();
                    Intent intent = new Intent(MainActivity.this,SevenActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer8.start();
                    Intent intent = new Intent(MainActivity.this,EightActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer9.start();
                    Intent intent = new Intent(MainActivity.this,NineActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = data.getText().toString();

                    mediaPlayer10.start();
                    Intent intent = new Intent(MainActivity.this,TenActivity.class);
                    intent.putExtra("message",message);
                    startActivity(intent);
            }
        });
    }

    void click() {
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        });

        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForthActivity.class);
                startActivity(intent);
                finish();
            }
        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SixActivity.class);
                startActivity(intent);
                finish();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SevenActivity.class);
                startActivity(intent);
                finish();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EightActivity.class);
                startActivity(intent);
                finish();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NineActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TenActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}

