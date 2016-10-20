package com.example.zumirka.arkanoid02;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;

import static android.R.attr.onClick;

/**
 * Created by Zumirka on 2016-10-20.
 */

public class GameView extends View implements View.OnClickListener{


    private SpriteObject character;
    private Context context;
    public GameView(Context context) {
        super(context);
        this.context=context;
        character=new SpriteObject(50,50);
        character.setMove_x(2);
        character.setMove_y(2);

        this.setOnClickListener(this);

    }
    public void onClick(View v) {
        invalidate();
        character.update(5);
    }
    public void onDraw(Canvas c)
    {
        character.draw(c);
    }

}
