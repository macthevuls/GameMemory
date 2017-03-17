package vumt.app.memorygame.numbergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import vumt.app.memorygame.R;

/**
 * Created by Mac The Vu on 3/5/2017.
 */

public class MainScreenGameNumberActivity extends Activity implements View.OnClickListener {
    private Button btnPlay;
    private Button btnBangThanhTich;
    private Button btnHelp;
    private ImageButton imgBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorynumber_main);
        initView();
    }

    private void initView() {
        imgBtnBack = (ImageButton) findViewById(R.id.img_btn_back);
        btnPlay = (Button) findViewById(R.id.btn_play);
        btnBangThanhTich = (Button) findViewById(R.id.btn_bang_thanh_tich);
        btnHelp = (Button) findViewById(R.id.btn_help);
        btnPlay.setOnClickListener(this);
        imgBtnBack.setOnClickListener(this);
        btnBangThanhTich.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_play:
                Intent iNumberMemory = new Intent(this, PlayScreenGameNumberActivity.class);
                startActivity(iNumberMemory);
                break;
            case R.id.img_btn_back:
                finish();
                break;
            case R.id.btn_bang_thanh_tich:
                Toast.makeText(this, "Comming soon...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_help:
                eventClickHelpButton();
                break;
        }
    }

    private void eventClickHelpButton() {
        Intent i = new Intent(this, HelpScreenGameNumberActivity.class);
        startActivity(i);
    }
}
