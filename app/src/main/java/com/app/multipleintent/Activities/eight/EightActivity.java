package com.app.multipleintent.Activities.eight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.multipleintent.Activities.fifth.FifthActivity;
import com.app.multipleintent.Activities.first.MainActivity;
import com.app.multipleintent.Activities.forth.ForthActivity;
import com.app.multipleintent.Activities.nine.NineActivity;
import com.app.multipleintent.Activities.second.SecondActivity;
import com.app.multipleintent.Activities.seven.SevenActivity;
import com.app.multipleintent.Activities.sixth.SixActivity;
import com.app.multipleintent.Activities.ten.TenActivity;
import com.app.multipleintent.Activities.third.ThirdActivity;
import com.app.multipleintent.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class EightActivity extends AppCompatActivity {

    Button first, second, third, forth, fifth, sixth, seven, nine, ten;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        iniUi();
        click();
        setData();
        passData();

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "QIlI7YquuRY";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });


    }

    private void passData() {

        //Media Player Object
        MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.first);
        MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.second);
        MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.third);
        MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.forth);
        MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.fifth);
        MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.six);
        MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.seven);
        MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.nine);
        MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.ten);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer1.start();
                    Intent intent = new Intent(EightActivity.this, MainActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
              }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer2.start();
                    Intent intent = new Intent(EightActivity.this, SecondActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer3.start();
                    Intent intent = new Intent(EightActivity.this, ThirdActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer4.start();
                    Intent intent = new Intent(EightActivity.this, ForthActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer5.start();
                    Intent intent = new Intent(EightActivity.this, FifthActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer6.start();
                    Intent intent = new Intent(EightActivity.this, SixActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer7.start();
                    Intent intent = new Intent(EightActivity.this, SevenActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }

        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                mediaPlayer9.start();
                Intent intent = new Intent(EightActivity.this, NineActivity.class);
                intent.putExtra("message", message4);
                Log.d("data", message4);
                startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message4 = editText.getText().toString();

                    mediaPlayer10.start();
                    Intent intent = new Intent(EightActivity.this, TenActivity.class);
                    intent.putExtra("message", message4);
                    Log.d("data",message4);
                    startActivity(intent);
                }
        });
    }

    private void setData() {
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        textView.setText(message);

        Bundle bundle2 = getIntent().getExtras();
        String message2 = bundle2.getString("message");
        textView.setText(message2);
    }

    private void click() {

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        });

        forth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, ForthActivity.class);
                startActivity(intent);
                finish();
            }
        });


        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, FifthActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, SixActivity.class);
                startActivity(intent);
                finish();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, SevenActivity.class);
                startActivity(intent);
                finish();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, NineActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightActivity.this, TenActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void iniUi() {
        first = (Button)findViewById(R.id.first_btn4);
        second = (Button)findViewById(R.id.second_btn4);
        third = (Button)findViewById(R.id.third_btn4);
        forth = (Button)findViewById(R.id.forth_btn);
        fifth = (Button)findViewById(R.id.fifth_btn4);
        sixth = (Button)findViewById(R.id.sixth_btn4);
        seven = (Button)findViewById(R.id.seven_btn4);
        nine = (Button)findViewById(R.id.eight_btn4);
        ten = (Button)findViewById(R.id.ten_btn4);
        
        //passData
        textView = (TextView)findViewById(R.id.data_TV8);
        editText = (EditText)findViewById(R.id.data_ET8);
    }
}