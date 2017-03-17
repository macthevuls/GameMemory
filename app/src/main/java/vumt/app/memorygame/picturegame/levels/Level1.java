package vumt.app.memorygame.picturegame.levels;

import android.content.Context;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import vumt.app.memorygame.R;
import vumt.app.memorygame.views.CustomImageView;
import vumt.app.memorygame.views.HiraButton;

/**
 * Created by Mac The Vu on 3/16/2017.
 */
public class Level1 {
    public LinearLayout createLayout(Context context, int withScreen) {
        LinearLayout cellRow01 = new LinearLayout(context);
        LinearLayout cellRow02 = new LinearLayout(context);
        cellRow01.setId(R.id.cell_row_01);
        cellRow02.setId(R.id.cell_row_02);
        cellRow01.setOrientation(LinearLayout.HORIZONTAL);
        cellRow02.setOrientation(LinearLayout.HORIZONTAL);
        cellRow01.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow02.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow01.setMotionEventSplittingEnabled(false);
        cellRow02.setMotionEventSplittingEnabled(false);

        int sizeCell = withScreen / 3;
        CustomImageView cell01 = new CustomImageView(context);
        cell01.setId(R.id.cell_01);
        cell01.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        LinearLayout cellPanel = new LinearLayout(context);
        cellPanel.setMotionEventSplittingEnabled(false);
        cellPanel.setOrientation(LinearLayout.VERTICAL);
        cellPanel.addView(cellRow01);
        cellPanel.addView(cellRow02);
        return cellPanel;
    }
}
