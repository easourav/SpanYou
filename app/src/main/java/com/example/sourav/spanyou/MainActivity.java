package com.example.sourav.spanyou;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button span1BTN, span2BTN;
    TextView player1TV, player2TV;
    ImageView wheelIMG, upIMG, downIMG;

    Random random;

    int degree=0, degreeOld=0;
    // there is 37 sector have 9.72 degre
    private static final float factor=4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        span1BTN=findViewById(R.id.btnPlayer1Span);
        player1TV=findViewById(R.id.tvPlayer1Score);
        wheelIMG=findViewById(R.id.ivSpanWheel);

       //wheelIMG.setImageDrawable("spanwheel.png");

        random=new Random();

        span1BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degreeOld=degree%360;
                degree= random.nextInt(3600)+720;
                RotateAnimation rotateAnimation=new RotateAnimation(degreeOld,degree,RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotateAnimation.setDuration(3600);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(new DecelerateInterpolator());
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                wheelIMG.startAnimation(rotateAnimation);
            }
        });
    }

    public void span2(View view) {
        degreeOld=degree%360;
        degree= random.nextInt(3600)+720;
        RotateAnimation rotateAnimation=new RotateAnimation(degreeOld,degree,RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(3600);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        wheelIMG.startAnimation(rotateAnimation);
    }
}
