package my.tworoot2.cuetmocktestseries.utils;

import android.content.Context;
import android.widget.Toast;

public class Source {


    public static void displayToastShort(String s, Context context) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }

    public static void displayToastLong(String s, Context context) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }
}
