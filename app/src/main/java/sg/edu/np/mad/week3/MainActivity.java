package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //Declare Variables
    MediaPlayer babyLaughMedia;
    VideoView rabbidVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        babyLaughMedia = MediaPlayer.create(this, R.raw.baby_laughing);
        babyLaughMedia.start();

        rabbidVideo = (VideoView) findViewById(R.id.videoView);
        rabbidVideo.setVideoURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid)
        );
        rabbidVideo.start();
    }

}
