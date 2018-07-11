package com.example.sourav.spanyou;

import android.annotation.SuppressLint;
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
    TextView player1TV;
    ImageView wheelIMG, upIMG, downIMG;
    String playerName1="Player 1: ", playerName2="Player 2: ";

    Random random;

    int degree=0, degreeOld=0;
    // there is 37 sector have 9.72 degre
    private static final float factor=4.80f;

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
                        player1TV.setText(playerName1);
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
                    text=playerName1+"22 Black";
                }
                if ((degrees>=(factor*3) && degrees < (factor*5))){
                    text=playerName1+"18 Red";
                }
                if ((degrees>=(factor*5) && degrees < (factor*7))){
                    text=playerName1+"29 Black";
                }
                if ((degrees>=(factor*7) && degrees < (factor*9))){
                    text=playerName1+"7 Red";
                }
                if ((degrees>=(factor*9) && degrees < (factor*11))){
                    text=playerName1+"28 Black";
                }
                if ((degrees>=(factor*11) && degrees < (factor*13))){
                    text=playerName1+"12 Red";
                }
                if ((degrees>=(factor*13) && degrees < (factor*15))){
                    text=playerName1+"35 Black";
                }
                if ((degrees>=(factor*15) && degrees < (factor*17))){
                    text=playerName1+"3 Red";
                }
                if ((degrees>=(factor*17) && degrees < (factor*19))){
                    text=playerName1+"26 Black";
                }
                if ((degrees>=(factor*19) && degrees < (factor*21))){
                    text=playerName1+playerName1+"0 Green";
                }
                if ((degrees>=(factor*21) && degrees < (factor*23))){
                    text=playerName1+"32 Red";
                }
                if ((degrees>=(factor*23) && degrees < (factor*25))){
                    text=playerName1+"15 Black";
                }
                if ((degrees>=(factor*25) && degrees < (factor*27))){
                    text=playerName1+"19 Red";
                }
                if ((degrees>=(factor*27) && degrees < (factor*29))){
                    text=playerName1+"4 Black";
                }
                if ((degrees>=(factor*29) && degrees < (factor*31))){
                    text=playerName1+"21 Red";
                }
                if ((degrees>=(factor*31) && degrees < (factor*33))){
                    text=playerName1+"2 Black";
                }
                if ((degrees>=(factor*33) && degrees < (factor*35))){
                    text=playerName1+"25 Red";
                }
                if ((degrees>=(factor*35) && degrees < (factor*37))){
                    text=playerName1+"17 Black";
                }
                if ((degrees>=(factor*37) && degrees < (factor*39))){
                    text=playerName1+"34 Red";
                }
                if ((degrees>=(factor*39) && degrees < (factor*41))){
                    text=playerName1+"6 Black";
                }
                if ((degrees>=(factor*41) && degrees < (factor*43))){
                    text=playerName1+"27 Red";
                }
                if ((degrees>=(factor*43) && degrees < (factor*45))){
                    text=playerName1+"13 Black";
                }
                if ((degrees>=(factor*45) && degrees < (factor*47))){
                    text=playerName1+"36 Red";
                }
                if ((degrees>=(factor*47) && degrees < (factor*49))){
                    text=playerName1+"11 Black";
                }
                if ((degrees>=(factor*49) && degrees < (factor*51))){
                    text=playerName1+"30 Red";
                }
                if ((degrees>=(factor*51) && degrees < (factor*53))){
                    text=playerName1+"8 Black";
                }
                if ((degrees>=(factor*53) && degrees < (factor*55))){
                    text=playerName1+"23 Red";
                }
                if ((degrees>=(factor*55) && degrees < (factor*57))){
                    text=playerName1+"10 Black";
                }
                if ((degrees>=(factor*57) && degrees < (factor*59))){
                    text=playerName1+"5 Red";
                }
                if ((degrees>=(factor*59) && degrees < (factor*61))){
                    text=playerName1+"24 Black";
                }
                if ((degrees>=(factor*61) && degrees < (factor*63))){
                    text=playerName1+"16 Red";
                }
                if ((degrees>=(factor*63) && degrees < (factor*65))){
                    text=playerName1+"33 Black";
                }
                if ((degrees>=(factor*65) && degrees < (factor*67))){
                    text=playerName1+"1 Red";
                }
                if ((degrees>=(factor*67) && degrees < (factor*69))){
                    text=playerName1+"20 Black";
                }
                if ((degrees>=(factor*69) && degrees < (factor*71))){
                    text=playerName1+"14 Red";
                }
                if ((degrees>=(factor*71) && degrees < (factor*73))){
                    text=playerName1+"31 Black";
                }
                if ((degrees>=(factor*73) && degrees < 360) || (degrees>= 0 && degrees<(factor*1))){
                    text=playerName1+"9 Red";
                }

                return text;
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
            @SuppressLint("SetTextI18n")
            @Override
            public void onAnimationStart(Animation animation) {
                player1TV.setText(playerName2);

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
            text=playerName2+"22 Black";
        }
        if ((degrees>=(factor*3) && degrees < (factor*5))){
            text=playerName2+"18 Red";
        }
        if ((degrees>=(factor*5) && degrees < (factor*7))){
            text=playerName2+"29 Black";
        }
        if ((degrees>=(factor*7) && degrees < (factor*9))){
            text=playerName2+"7 Red";
        }
        if ((degrees>=(factor*9) && degrees < (factor*11))){
            text=playerName2+"28 Black";
        }
        if ((degrees>=(factor*11) && degrees < (factor*13))){
            text=playerName2+"12 Red";
        }
        if ((degrees>=(factor*13) && degrees < (factor*15))){
            text=playerName2+"35 Black";
        }
        if ((degrees>=(factor*15) && degrees < (factor*17))){
            text=playerName2+"3 Red";
        }
        if ((degrees>=(factor*17) && degrees < (factor*19))){
            text=playerName2+"26 Black";
        }
        if ((degrees>=(factor*19) && degrees < (factor*21))){
            text=playerName2+playerName1+"0 Green";
        }
        if ((degrees>=(factor*21) && degrees < (factor*23))){
            text=playerName2+"32 Red";
        }
        if ((degrees>=(factor*23) && degrees < (factor*25))){
            text=playerName2+"15 Black";
        }
        if ((degrees>=(factor*25) && degrees < (factor*27))){
            text=playerName2+"19 Red";
        }
        if ((degrees>=(factor*27) && degrees < (factor*29))){
            text=playerName2+"4 Black";
        }
        if ((degrees>=(factor*29) && degrees < (factor*31))){
            text=playerName2+"21 Red";
        }
        if ((degrees>=(factor*31) && degrees < (factor*33))){
            text=playerName2+"2 Black";
        }
        if ((degrees>=(factor*33) && degrees < (factor*35))){
            text=playerName2+"25 Red";
        }
        if ((degrees>=(factor*35) && degrees < (factor*37))){
            text=playerName2+"17 Black";
        }
        if ((degrees>=(factor*37) && degrees < (factor*39))){
            text=playerName2+"34 Red";
        }
        if ((degrees>=(factor*39) && degrees < (factor*41))){
            text=playerName2+"6 Black";
        }
        if ((degrees>=(factor*41) && degrees < (factor*43))){
            text=playerName2+"27 Red";
        }
        if ((degrees>=(factor*43) && degrees < (factor*45))){
            text=playerName2+"13 Black";
        }
        if ((degrees>=(factor*45) && degrees < (factor*47))){
            text=playerName2+"36 Red";
        }
        if ((degrees>=(factor*47) && degrees < (factor*49))){
            text=playerName2+"11 Black";
        }
        if ((degrees>=(factor*49) && degrees < (factor*51))){
            text=playerName2+"30 Red";
        }
        if ((degrees>=(factor*51) && degrees < (factor*53))){
            text=playerName2+"8 Black";
        }
        if ((degrees>=(factor*53) && degrees < (factor*55))){
            text=playerName2+"23 Red";
        }
        if ((degrees>=(factor*55) && degrees < (factor*57))){
            text=playerName2+"10 Black";
        }
        if ((degrees>=(factor*57) && degrees < (factor*59))){
            text=playerName2+"5 Red";
        }
        if ((degrees>=(factor*59) && degrees < (factor*61))){
            text=playerName2+"24 Black";
        }
        if ((degrees>=(factor*61) && degrees < (factor*63))){
            text=playerName2+"16 Red";
        }
        if ((degrees>=(factor*63) && degrees < (factor*65))){
            text=playerName2+"33 Black";
        }
        if ((degrees>=(factor*65) && degrees < (factor*67))){
            text=playerName2+"1 Red";
        }
        if ((degrees>=(factor*67) && degrees < (factor*69))){
            text=playerName2+"20 Black";
        }
        if ((degrees>=(factor*69) && degrees < (factor*71))){
            text=playerName2+"14 Red";
        }
        if ((degrees>=(factor*71) && degrees < (factor*73))){
            text=playerName2+"31 Black";
        }
        if ((degrees>=(factor*73) && degrees < 360) || (degrees>= 0 && degrees<(factor*1))){
            text=playerName2+"9 Red";
        }

        return text;
    }
}
