package vumt.app.memorygame.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import vumt.app.memorygame.utils.GlobalVars;

/**
 * Created by Mac The Vu on 2/20/2017.
 */

public class HiraButton extends View {
    public int number;
    public Boolean isSelected = false;
    public Boolean Enabled = true;

    public HiraButton(Context context) {
        super(context);
        GlobalVars.buttonList.add(this);
    }

    public HiraButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HiraButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        GlobalVars.buttonList.add(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        if (Enabled) {
            if (!isSelected) {
                p.setColor(Color.parseColor("#3773D2"));
                canvas.drawRect(5, 5, getWidth() - 5, getHeight() - 5, p);
            } else {
                p.setColor(Color.parseColor("#6096eb"));
                canvas.drawRect(1, 1, getWidth() - 1, getHeight() - 1, p);
                p.setColor(Color.WHITE);
                p.setTextSize(getWidth() * 0.65f);
                canvas.drawText(number + "", getWidth() / 2 - p.measureText(number + "") / 2, getHeight() / 2 + p.measureText(number + "") / 1.5f, p);
            }
        } else {
            p.setColor(Color.parseColor("#6096eb"));
            canvas.drawRect(1, 1, getWidth() - 1, getHeight() - 1, p);
            p.setColor(Color.WHITE);
            p.setTextSize(getWidth() * 0.65f);
            canvas.drawText(number + "", getWidth() / 2 - p.measureText(number + "") / 2, getHeight() / 2 + p.measureText(number + "") / 1.5f, p);
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec),
                MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (Enabled) {
            GlobalVars.currentClick = this;
            ((Activity) getContext()).onTouchEvent(event);
            return true;
        } else return false;
    }

}
