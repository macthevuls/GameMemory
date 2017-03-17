package vumt.app.memorygame.numbergame.levels;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import vumt.app.memorygame.views.HiraButton;
import vumt.app.memorygame.R;

/**
 * Created by Mac The Vu on 3/2/2017.
 * <p>
 * Level này có 26 ô
 */

public class Level12 {
    public LinearLayout createLayout(Context context, int withScreen) {
        List<Integer> listValues = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12));
        LinearLayout cellRow01 = new LinearLayout(context);
        LinearLayout cellRow02 = new LinearLayout(context);
        LinearLayout cellRow03 = new LinearLayout(context);
        LinearLayout cellRow04 = new LinearLayout(context);
        LinearLayout cellRow05 = new LinearLayout(context);
        LinearLayout cellRow06 = new LinearLayout(context);
        cellRow01.setId(R.id.cell_row_01);
        cellRow02.setId(R.id.cell_row_02);
        cellRow03.setId(R.id.cell_row_03);
        cellRow04.setId(R.id.cell_row_04);
        cellRow05.setId(R.id.cell_row_05);
        cellRow06.setId(R.id.cell_row_06);
        cellRow01.setOrientation(LinearLayout.HORIZONTAL);
        cellRow02.setOrientation(LinearLayout.HORIZONTAL);
        cellRow03.setOrientation(LinearLayout.HORIZONTAL);
        cellRow04.setOrientation(LinearLayout.HORIZONTAL);
        cellRow05.setOrientation(LinearLayout.HORIZONTAL);
        cellRow06.setOrientation(LinearLayout.HORIZONTAL);
        cellRow01.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow02.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow03.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow04.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow05.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow06.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        cellRow01.setMotionEventSplittingEnabled(false);
        cellRow02.setMotionEventSplittingEnabled(false);
        cellRow03.setMotionEventSplittingEnabled(false);
        cellRow04.setMotionEventSplittingEnabled(false);
        cellRow05.setMotionEventSplittingEnabled(false);
        cellRow06.setMotionEventSplittingEnabled(false);

        int sizeCell = withScreen / 6;
        HiraButton cell01 = new HiraButton(context);
        cell01.setId(R.id.cell_01);
        cell01.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell02 = new HiraButton(context);
        cell02.setId(R.id.cell_02);
        cell02.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell03 = new HiraButton(context);
        cell03.setId(R.id.cell_03);
        cell03.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell04 = new HiraButton(context);
        cell04.setId(R.id.cell_04);
        cell04.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell05 = new HiraButton(context);
        cell05.setId(R.id.cell_05);
        cell05.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell06 = new HiraButton(context);
        cell06.setId(R.id.cell_06);
        cell06.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell07 = new HiraButton(context);
        cell07.setId(R.id.cell_07);
        cell07.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell08 = new HiraButton(context);
        cell08.setId(R.id.cell_08);
        cell08.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell09 = new HiraButton(context);
        cell09.setId(R.id.cell_09);
        cell09.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell10 = new HiraButton(context);
        cell10.setId(R.id.cell_10);
        cell10.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell11 = new HiraButton(context);
        cell11.setId(R.id.cell_11);
        cell11.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        View cell12 = new View(context);
        cell12.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell13 = new HiraButton(context);
        cell13.setId(R.id.cell_13);
        cell13.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        View cell14 = new View(context);
        cell14.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell15 = new HiraButton(context);
        cell15.setId(R.id.cell_15);
        cell15.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell16 = new HiraButton(context);
        cell16.setId(R.id.cell_16);
        cell16.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        View cell17 = new View(context);
        cell17.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell18 = new HiraButton(context);
        cell18.setId(R.id.cell_18);
        cell18.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        View cell19 = new View(context);
        cell19.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell20 = new HiraButton(context);
        cell20.setId(R.id.cell_20);
        cell20.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell21 = new HiraButton(context);
        cell21.setId(R.id.cell_21);
        cell21.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell22 = new HiraButton(context);
        cell22.setId(R.id.cell_22);
        cell22.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell23 = new HiraButton(context);
        cell23.setId(R.id.cell_23);
        cell23.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell24 = new HiraButton(context);
        cell24.setId(R.id.cell_24);
        cell24.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell25 = new HiraButton(context);
        cell25.setId(R.id.cell_25);
        cell25.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell26 = new HiraButton(context);
        cell26.setId(R.id.cell_26);
        cell26.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell27 = new HiraButton(context);
        cell27.setId(R.id.cell_27);
        cell27.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell28 = new HiraButton(context);
        cell28.setId(R.id.cell_28);
        cell28.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell29 = new HiraButton(context);
        cell29.setId(R.id.cell_29);
        cell29.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        HiraButton cell30 = new HiraButton(context);
        cell30.setId(R.id.cell_30);
        cell30.setLayoutParams(new LinearLayout.LayoutParams(sizeCell, sizeCell));

        // Set value show_all_btn for cell
        Random randomGenerator = new Random();
        int indexRandom = randomGenerator.nextInt(listValues.size());
        cell01.number = listValues.remove(indexRandom);
        cell02.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell03.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell04.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell05.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell06.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell07.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell08.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell09.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell10.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell11.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell13.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell15.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell16.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell18.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell20.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell21.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell22.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell23.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell24.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell25.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell26.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell27.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell28.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell29.number = listValues.remove(randomGenerator.nextInt(listValues.size()));
        cell30.number = listValues.remove(randomGenerator.nextInt(listValues.size()));

        cellRow01.addView(cell01);
        cellRow01.addView(cell02);
        cellRow01.addView(cell03);
        cellRow01.addView(cell04);
        cellRow01.addView(cell05);
        cellRow02.addView(cell06);
        cellRow02.addView(cell07);
        cellRow02.addView(cell08);
        cellRow02.addView(cell09);
        cellRow02.addView(cell10);
        cellRow03.addView(cell11);
        cellRow03.addView(cell12);
        cellRow03.addView(cell13);
        cellRow03.addView(cell14);
        cellRow03.addView(cell15);
        cellRow04.addView(cell16);
        cellRow04.addView(cell17);
        cellRow04.addView(cell18);
        cellRow04.addView(cell19);
        cellRow04.addView(cell20);
        cellRow05.addView(cell21);
        cellRow05.addView(cell22);
        cellRow05.addView(cell23);
        cellRow05.addView(cell24);
        cellRow05.addView(cell25);
        cellRow06.addView(cell26);
        cellRow06.addView(cell27);
        cellRow06.addView(cell28);
        cellRow06.addView(cell29);
        cellRow06.addView(cell30);

        LinearLayout cellPanel = new LinearLayout(context);
        cellPanel.setMotionEventSplittingEnabled(false);
        cellPanel.setOrientation(LinearLayout.VERTICAL);
        cellPanel.addView(cellRow01);
        cellPanel.addView(cellRow02);
        cellPanel.addView(cellRow03);
        cellPanel.addView(cellRow04);
        cellPanel.addView(cellRow05);
        cellPanel.addView(cellRow06);

        return cellPanel;
    }
}