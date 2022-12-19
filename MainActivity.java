package com.example.avy_media;
import androidx.appcompat.app.AppCompatActivity;
import
import
import
import
import
import android.media.MediaPlayer;
android.os.Bundle;
android.view.View;
android.widget.Button;
android.widget.TextView;
android.widget.Toast;
public
int
int
int
int class MainActivity extends AppCompatActivity {
starttime=0;
stoptime=0;
forwardtime=5000;
backwardtime=5000;
MediaPlayer mediaPlayer,mediaPlayerNew;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
mediaPlayer= MediaPlayer.create(this,R.raw.abc);
mediaPlayerNew=MediaPlayer.create(this,R.raw.abc);
TextView songtitle=findViewById(R.id.textView);songtitle.setText("abc");
Button player=findViewById(R.id.button6);
player.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Toast.makeText(getApplicationContext(),"playing
song",Toast.LENGTH_LONG).show();
mediaPlayer.start();
}
});
Button pause = findViewById(R.id.pause);
pause.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Toast.makeText(getApplicationContext(), "Pausing Song",
Toast.LENGTH_LONG).show();
mediaPlayer.pause();
}
});
Button forward = findViewById(R.id.fwd);
forward.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
int currents = mediaPlayer.getCurrentPosition();
if((currents+forwardtime)<=(stoptime =
mediaPlayer.getDuration())){
mediaPlayer.seekTo(currents+ forwardtime);
}
Toast.makeText(getApplicationContext(), "Playing Song",
Toast.LENGTH_LONG).show();
mediaPlayer.start();
}
});
Button rewind = findViewById(R.id.revind);
rewind.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
int currents = mediaPlayer.getCurrentPosition();
if((currents- backwardtime)<=(stoptime =
mediaPlayer.getDuration()))
{
mediaPlayer.seekTo(currents+ forwardtime);
}Toast.makeText(getApplicationContext(), "Playing Song",
Toast.LENGTH_LONG).show();
mediaPlayer.start();
}
});
Button restart = findViewById(R.id.restart);
restart.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Toast.makeText(getApplicationContext(), "Restarting Song",
Toast.LENGTH_LONG).show();
mediaPlayer.seekTo(0);
mediaPlayer.start();
}
});
}
}
