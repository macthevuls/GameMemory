package vumt.app.memorygame.numbergame;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import vumt.app.memorygame.numbergame.levels.Level10;
import vumt.app.memorygame.numbergame.levels.Level11;
import vumt.app.memorygame.numbergame.levels.Level12;
import vumt.app.memorygame.utils.AndroidDeviceHeplper;
import vumt.app.memorygame.utils.GlobalVars;
import vumt.app.memorygame.views.HiraButton;
import vumt.app.memorygame.R;
import vumt.app.memorygame.numbergame.levels.Level1;
import vumt.app.memorygame.numbergame.levels.Level2;
import vumt.app.memorygame.numbergame.levels.Level3;
import vumt.app.memorygame.numbergame.levels.Level4;
import vumt.app.memorygame.numbergame.levels.Level5;
import vumt.app.memorygame.numbergame.levels.Level6;
import vumt.app.memorygame.numbergame.levels.Level7;
import vumt.app.memorygame.numbergame.levels.Level8;
import vumt.app.memorygame.numbergame.levels.Level9;

public class PlayScreenGameNumberActivity extends Activity implements View.OnClickListener {
    private LinearLayout controlPanel;
    private LinearLayout cellPanel;
    private LinearLayout llGameOver;
    private LinearLayout llPassLevel;
    private LinearLayout llBlurScreen;
    private ImageButton imgBtnShowAll;
    private ImageButton imgBtnReset;
    private Button btnYes;
    private Button btnNo;
    private Button btnQuit;
    private Button btnNext;
    private Button btnSaveScore;

    private TextView txtTime;
    private TextView txtPoint;

    private int withScreen = 0;
    private int heightScreen = 0;
    private int numberOne = -1;
    private int numberTwo = -1;
    private int idNumberOne = -1;
    private int idNumberTwo = -1;
    private int numCellOpen = 0;
    private int pointCurrent = 0;
    private int pointOfLastLevel = 0;

    private Handler handler = new Handler();
    private CountDownTimer countDownTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorynumber_play);
        initView();

        withScreen = AndroidDeviceHeplper.getWithScreen(this);
        heightScreen = AndroidDeviceHeplper.getHeightScreen(this);

        // Resize control panel height to match screen
        int hControlPanel = withScreen / 3;
        controlPanel.getLayoutParams().height = hControlPanel;
        controlPanel.requestLayout();

        initGame();
    }

    private void initView() {
        llBlurScreen = (LinearLayout) findViewById(R.id.layout_blur_screen);
        llGameOver = (LinearLayout) findViewById(R.id.layout_gameover);
        llPassLevel = (LinearLayout) findViewById(R.id.layout_passlevel);
        cellPanel = (LinearLayout) findViewById(R.id.cellPanel);
        txtTime = (TextView) findViewById(R.id.txt_timer);
        txtPoint = (TextView) findViewById(R.id.txt_point);
        controlPanel = (LinearLayout) findViewById(R.id.controlPanel);
        imgBtnShowAll = (ImageButton) findViewById(R.id.img_btn_showall);
        imgBtnReset = (ImageButton) findViewById(R.id.img_btn_reset);
        btnYes = (Button) findViewById(R.id.btn_yes);
        btnNo = (Button) findViewById(R.id.btn_no);
        btnQuit = (Button) findViewById(R.id.btn_quit);
        btnNext = (Button) findViewById(R.id.btn_next_level);
        btnSaveScore = (Button) findViewById(R.id.btn_upload_score);
        btnSaveScore.setOnClickListener(this);
        imgBtnShowAll.setOnClickListener(this);
        imgBtnReset.setOnClickListener(this);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
        btnQuit.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    private void initGame() {
        numberOne = -1;
        numberTwo = -1;
        idNumberOne = -1;
        idNumberTwo = -1;
        numCellOpen = 0;
        GlobalVars.currentClick = null;
        if (withScreen < heightScreen) {
            cellPanel.removeAllViews();
            int levelNumber = GlobalVars.CURRENT_LEVEL;
            if (levelNumber == 1) {
                countDown(9);
                Level1 lv = new Level1();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 2) {
                countDown(11);
                Level2 lv = new Level2();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 3) {
                countDown(13);
                Level3 lv = new Level3();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 4) {
                countDown(15);
                Level4 lv = new Level4();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 5) {
                countDown(17);
                Level5 lv = new Level5();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 6) {
                countDown(190);
                Level6 lv = new Level6();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 7) {
                countDown(210);
                Level7 lv = new Level7();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 8) {
                countDown(230);
                Level8 lv = new Level8();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 9) {
                countDown(250);
                Level9 lv = new Level9();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 10) {
                countDown(270);
                Level10 lv = new Level10();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 11) {
                countDown(290);
                Level11 lv = new Level11();
                cellPanel.addView(lv.createLayout(this, withScreen));
            } else if (levelNumber == 12) {
                countDown(310);
                Level12 lv = new Level12();
                cellPanel.addView(lv.createLayout(this, withScreen));
            }
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // Open only current cell
                if (GlobalVars.currentClick != null) {
                    if (GlobalVars.currentClick.Enabled) {
                        GlobalVars.currentClick.isSelected = true;
                        GlobalVars.currentClick.invalidate();

                        if (numberOne == -1) {
                            numberOne = GlobalVars.currentClick.number;
                            idNumberOne = GlobalVars.currentClick.getId();
                        } else if (numberTwo == -1) {
                            if (idNumberOne != GlobalVars.currentClick.getId()) {
                                numberTwo = GlobalVars.currentClick.number;
                                idNumberTwo = GlobalVars.currentClick.getId();
                            }
                        }

                        if ((numberOne != -1) && (numberTwo != -1) && (idNumberOne != -1) && (idNumberTwo != -1)) {
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    if ((findViewById(idNumberOne) != null) && (findViewById(idNumberTwo) != null)) {
                                        if (numberOne != numberTwo) {
                                            ((HiraButton) findViewById(idNumberOne)).isSelected = false;
                                            ((HiraButton) findViewById(idNumberTwo)).isSelected = false;
                                            (findViewById(idNumberOne)).invalidate();
                                            (findViewById(idNumberTwo)).invalidate();
                                        } else {
                                            pointCurrent += 100;
                                            txtPoint.setText(pointCurrent + "");
                                            ((HiraButton) findViewById(idNumberOne)).Enabled = false;
                                            ((HiraButton) findViewById(idNumberTwo)).Enabled = false;
                                            numCellOpen += 2;

                                            // show dialog Passed Level
                                            if (numCellOpen == GlobalVars.CURRENT_LEVEL * 2 + 2) {
                                                pointOfLastLevel = pointCurrent;
                                                cancelTimer();
                                                if (GlobalVars.CURRENT_LEVEL < 12) {
                                                    llBlurScreen.setVisibility(View.VISIBLE);
                                                    llPassLevel.setVisibility(View.VISIBLE);
                                                }
                                            }
                                        }
                                    }
                                    numberOne = -1;
                                    numberTwo = -1;
                                    idNumberOne = -1;
                                    idNumberTwo = -1;
                                    GlobalVars.currentClick = null;
                                }
                            }, 150);
                        }
                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GlobalVars.currentClick = null;
        GlobalVars.buttonList.clear();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_btn_showall:
                showAll();
                break;
            case R.id.img_btn_reset:
                eventButtonResetGame();
                break;
            case R.id.btn_yes:
                eventButtonYes();
                break;
            case R.id.btn_no:
            case R.id.btn_quit:
                GlobalVars.CURRENT_LEVEL = 1;
                finish();
                break;
            case R.id.btn_next_level:
                eventNextLevel();
                break;
            case R.id.btn_upload_score:
                Toast.makeText(this, "Comming soon...", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void eventButtonResetGame() {
        txtPoint.setText(pointOfLastLevel + "");
        pointCurrent = pointOfLastLevel;
        cancelTimer();
        initGame();
    }

    private void eventButtonYes() {
        GlobalVars.CURRENT_LEVEL = 1;
        pointCurrent = 0;
        pointOfLastLevel = 0;
        llBlurScreen.setVisibility(View.GONE);
        llGameOver.setVisibility(View.GONE);
        txtPoint.setText(pointOfLastLevel + "");
        initGame();
    }

    private void eventNextLevel() {
        llBlurScreen.setVisibility(View.GONE);
        llPassLevel.setVisibility(View.GONE);
        if (GlobalVars.CURRENT_LEVEL < 12) {
            GlobalVars.CURRENT_LEVEL += 1;
        }
        initGame();
    }

    private void showAll() {
        cancelTimer();
        for (int i = 0; i < GlobalVars.buttonList.size(); i++) {
            HiraButton hira = GlobalVars.buttonList.get(i);
            hira.isSelected = true;
            hira.invalidate();
            hira.Enabled = false;
        }
    }

    private void countDown(int timeLeft) {
        countDownTime = new CountDownTimer(timeLeft * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (millisUntilFinished / 1000 <= 5) {
                    txtTime.setTextColor(Color.RED);
                } else {
                    txtTime.setTextColor(Color.WHITE);
                }
                txtTime.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                txtTime.setText("0");
                // Show dialog GameOver
                if (numCellOpen < GlobalVars.CURRENT_LEVEL * 2 + 2) {
                    llBlurScreen.setVisibility(View.VISIBLE);
                    llGameOver.setVisibility(View.VISIBLE);
                }
            }
        };
        countDownTime.start();
    }

    private void cancelTimer() {
        if (countDownTime != null) {
            countDownTime.cancel();
        }
    }

    @Override
    public void onBackPressed() {
        GlobalVars.CURRENT_LEVEL = 1;
        super.onBackPressed();
    }
}
