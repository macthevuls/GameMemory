package vumt.app.memorygame.picturegame;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import vumt.app.memorygame.R;

/**
 * Created by Mac The Vu on 3/16/2017.
 */

public class Test extends Activity {
    Button buttonFlipX, buttonFlipY;
    ImageView imageView;
    boolean dirX = true;
    boolean dirY = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        imageView = (ImageView) findViewById(R.id.image);
        buttonFlipX = (Button) findViewById(R.id.buttonflipX);
        buttonFlipY = (Button) findViewById(R.id.buttonflipY);

        buttonFlipX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dirX) {
                    dirX = false;
                    buttonFlipX.setText("Flip X Backward");
                    ObjectAnimator flip = ObjectAnimator.ofFloat(imageView, "rotationX", 0f, 180f);
                    flip.setDuration(500);
                    flip.start();
                } else {
                    dirX = true;
                    buttonFlipX.setText("Flip X Forward");
                    ObjectAnimator flip = ObjectAnimator.ofFloat(imageView, "rotationX", 180f, 0f);
                    flip.setDuration(1000);
                    flip.start();
                }
            }
        });

        buttonFlipY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dirY) {
                    dirY = false;
                    buttonFlipY.setText("Flip Y Backward");
                    ObjectAnimator flip = ObjectAnimator.ofFloat(imageView, "rotationY", 0f, 180f);
                    flip.setDuration(2000);
                    flip.start();
                } else {
                    dirY = true;
                    buttonFlipY.setText("Flip Y Forward");
                    ObjectAnimator flip = ObjectAnimator.ofFloat(imageView, "rotationY", 180f, 0f);
                    flip.setDuration(3000);
                    flip.start();
                }
            }
        });
    }
}
