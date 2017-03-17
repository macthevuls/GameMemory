package vumt.app.memorygame.numbergame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import vumt.app.memorygame.R;

/**
 * Created by Mac The Vu on 3/14/2017.
 */

public class HelpScreenGameNumberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorynumber_help);

        ImageButton imgBtnBack = (ImageButton) findViewById(R.id.img_btn_back);
        imgBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
