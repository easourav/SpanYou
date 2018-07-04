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
                player1TV.setText("");

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                player1TV.setText(currentNumber(360-(degree%360)));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        wheelIMG.startAnimation(rotateAnimation);
    }
    private String currentNumber(int degrees){
        String text ="";
        if ((degrees>=(factor*1) && degrees < (factor*3))){
            text="22 Black";
        }
        if ((degrees>=(factor*3) && degrees < (factor*5))){
            text="18 Red";
        }
        if ((degrees>=(factor*5) && degrees < (factor*7))){
            text="29 Black";
        }
        if ((degrees>=(factor*7) && degrees < (factor*9))){
            text="7 Red";
        }
        if ((degrees>=(factor*9) && degrees < (factor*11))){
            text="28 Black";
        }
        if ((degrees>=(factor*11) && degrees < (factor*13))){
            text="12 Red";
        }
        if ((degrees>=(factor*13) && degrees < (factor*15))){
            text="35 Black";
        }
        if ((degrees>=(factor*15) && degrees < (factor*17))){
            text="3 Red";
        }
        if ((degrees>=(factor*17) && degrees < (factor*19))){
            text="26 Black";
        }
        if ((degrees>=(factor*19) && degrees < (factor*21))){
            text="0 Green";
        }
        if ((degrees>=(factor*21) && degrees < (factor*23))){
            text="32 Red";
        }
        if ((degrees>=(factor*23) && degrees < (factor*25))){
            text="15 Black";
        }
        if ((degrees>=(factor*25) && degrees < (factor*27))){
            text="19 Red";
        }
        if ((degrees>=(factor*27) && degrees < (factor*29))){
            text="4 Black";
        }
        if ((degrees>=(factor*29) && degrees < (factor*31))){
            text="21 Red";
        }
        if ((degrees>=(factor*31) && degrees < (factor*33))){
            text="2 Black";
        }
        if ((degrees>=(factor*33) && degrees < (factor*35))){
            text="25 Red";
        }
        if ((degrees>=(factor*35) && degrees < (factor*37))){
            text="17 Black";
        }
        if ((degrees>=(factor*37) && degrees < (factor*39))){
            text="34 Red";
        }
        if ((degrees>=(factor*39) && degrees < (factor*41))){
            text="6 Black";
        }
        if ((degrees>=(factor*41) && degrees < (factor*43))){
            text="27 Red";
        }
        if ((degrees>=(factor*43) && degrees < (factor*45))){
            text="13 Black";
        }
        if ((degrees>=(factor*45) && degrees < (factor*47))){
            text="36 Red";
        }
        if ((degrees>=(factor*47) && degrees < (factor*49))){
            text="11 Black";
        }
        if ((degrees>=(factor*49) && degrees < (factor*51))){
            text="30 Red";
        }
        if ((degrees>=(factor*51) && degrees < (factor*53))){
            text="8 Black";
        }
        if ((degrees>=(factor*53) && degrees < (factor*55))){
            text="23 Red";
        }
        if ((degrees>=(factor*55) && degrees < (factor*57))){
            text="10 Black";
        }
        if ((degrees>=(factor*57) && degrees < (factor*59))){
            text="5 Red";
        }
        if ((degrees>=(factor*59) && degrees < (factor*61))){
            text="24 Black";
        }
        if ((degrees>=(factor*61) && degrees < (factor*63))){
            text="16 Red";
        }
        if ((degrees>=(factor*63) && degrees < (factor*65))){
            text="33 Black";
        }
        if ((degrees>=(factor*65) && degrees < (factor*67))){
            text="1 Red";
        }
        if ((degrees>=(factor*67) && degrees < (factor*69))){
            text="20 Black";
        }
        if ((degrees>=(factor*69) && degrees < (factor*71))){
            text="14 Red";
        }
        if ((degrees>=(factor*71) && degrees < (factor*73))){
            text="31 Black";
        }
        if ((degrees>=(factor*73) && degrees < 360) || (degrees>= 0 && degrees<(factor*1))){
            text="9 Red";
        }

        return text;
    }
}
