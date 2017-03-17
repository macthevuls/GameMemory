package vumt.app.memorygame.utils;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Mac The Vu on 3/10/2017.
 */

public class NetworkUtils {
    /**
     * Kiểm tra có connect internet hay không
     *
     * @param context
     * @return
     */
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        return (cm.getActiveNetworkInfo() != null
                && cm.getActiveNetworkInfo().isAvailable() && cm
                .getActiveNetworkInfo().isConnected());
    }
}
