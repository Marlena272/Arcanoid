package com.example.zumirka.arkanoid02;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Zumirka on 2016-10-20.
 */

public class SpriteObject {
    private Bitmap bitmap;
    private double x;
    private double y;
    private double move_x;
    private double move_y;
    int i;
    public SpriteObject(int x,int y)
    {
        this.x=x;
        this.y=y;
        i=0;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public Bitmap getBitmap(){return bitmap;}
    public void setMove_x(double mx){move_x=mx;}
    public void setMove_y(double my){move_y=my;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
    public void draw(Canvas c){

        i++;
        Paint p=new Paint();
        p.setColor(Color.BLUE);
        c.drawCircle((float)x,(float)y,20,p);
        p.setTextSize(100);
        c.drawText(String.valueOf(i),50,150,p);
    }
    public void update(int adj){
        x+=(adj*move_x);
        y+=(adj*move_y);
    }
}
