package vumt.app.memorygame.numbergame.levels;

import android.content.Context;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import vumt.app.memorygame.views.HiraButton;
import vumt.app.memorygame.R;

/**
 * Created by Mac The Vu on 3/1/2017.
 * <p>
 * Level này có 6 ô
 */

public class Level2 {
    public LinearLayout createLayout(Context context, int withScreen) {
        List<Integer> listValues = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 2, 2));
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

        int sizeCell = withScreen / 4;
        HiraButton cell01 = new HiraButton(context);
        cell01.setId(R.id.cell_01);
        cell01.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell02 = new HiraButton(context);
        cell02.setId(R.id.cell_02);
        cell02.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell03 = new HiraButton(context);
        cell03.setId(R.id.cell_03);
        cell03.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell05 = new HiraButton(context);
        cell05.setId(R.id.cell_05);
        cell05.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell06 = new HiraButton(context);
        cell06.setId(R.id.cell_06);
        cell06.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell07 = new HiraButton(context);
        cell07.setId(R.id.cell_07);
        cell07.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        // Set value show_all_btn for cell
        Random randomGenerator = new Random();
        int indexRandom = randomGenerator.nextInt(listValues.size());
        cell01.number = listValues.remove(indexRandom);
        cell02.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell03.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell05.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell06.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell07.number = listValues.remove(randomGenerator.nextInt(listValues.size()));

        cellRow01.addView(cell01);
        cellRow01.addView(cell02);
        cellRow01.addView(cell03);
        cellRow02.addView(cell05);
        cellRow02.addView(cell06);
        cellRow02.addView(cell07);

        LinearLayout cellPanel = new LinearLayout(context);
        cellPanel.setMotionEventSplittingEnabled(false);
        cellPanel.setOrientation(LinearLayout.VERTICAL);
        cellPanel.addView(cellRow01);
        cellPanel.addView(cellRow02);

        return cellPanel;
    }
}
