package vumt.app.memorygame.utils;

import java.util.ArrayList;

import vumt.app.memorygame.views.HiraButton;

/**
 * Created by Mac The Vu on 2/20/2017.
 */

public class GlobalVars {
    public static ArrayList<HiraButton> buttonList = new ArrayList<HiraButton>();
    public static HiraButton currentClick = null;
    public static int CURRENT_LEVEL = 1;
    public static String NAME_SHAREDPREFERENCES = "SHAREDPREF_MEMORYGAME";
    public static String API_LINK_INFO_USER = "https://dl.dropboxusercontent.com/u/75317395/Game_Memory/info_user.txt";

    public static String ITEM_TAG = "item";
    public static String ID_TAG = "id";
    public static String USERNAME_TAG = "username";
    public static String HIGHTSCORE_TAG = "hightscore";

}
