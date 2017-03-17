package vumt.app.memorygame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import vumt.app.memorygame.numbergame.MainScreenGameNumberActivity;
import vumt.app.memorygame.picturegame.Test;

/**
 * Created by Mac The Vu on 3/4/2017.
 */

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btnNumberMemory;
    private Button btnColorMemory;
    private Button btnPictureMemory;

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnNumberMemory = (Button) findViewById(R.id.btn_numbermemory);
        btnColorMemory = (Button) findViewById(R.id.btn_colormemory);
        btnPictureMemory = (Button) findViewById(R.id.btn_picturememory);
        btnPictureMemory.setOnClickListener(this);
        btnColorMemory.setOnClickListener(this);
        btnNumberMemory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_numbermemory:
                Intent iNumberMemory = new Intent(this, MainScreenGameNumberActivity.class);
                startActivity(iNumberMemory);
                break;
            case R.id.btn_colormemory:
                eventButtonColorMemory();
                break;
            case R.id.btn_picturememory:
                Intent iPictuteMemory = new Intent(this, Test.class);
                startActivity(iPictuteMemory);
                break;
        }
    }

    private void eventButtonColorMemory() {
        Toast.makeText(this, "Comming soon...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click Back again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
