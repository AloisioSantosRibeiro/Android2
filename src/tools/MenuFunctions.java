package tools;

import android.app.Activity;
import android.content.Intent;
import android.v2.ThemeColorActivity;
import android.v2.ThemeDarkActivity;
import android.v2.ThemeDarkLightActivity;
import android.v2.ThemeImageActivity;
import android.v2.ThemeLightActivity;
import android.v2.ThemeOverlayActionBarActivity;


public class MenuFunctions {
	
    public static void fOpenDarkThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeDarkActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenLightThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeLightActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenDarkLightThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeDarkLightActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenColorThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenImageThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeImageActivity.class);
    	origin.startActivity(intent);
    }


    public static void fOpenOverlayActionBarThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeOverlayActionBarActivity.class);
    	origin.startActivity(intent);
	}

}
