package tools;

import android.app.Activity;
import android.content.Intent;
import android.v2.ThemeColorTitleBlueActivity;
import android.v2.ThemeColorTitleGreenActivity;
import android.v2.ThemeColorTitleRedActivity;
import android.v2.ThemeDarkActivity;
import android.v2.ThemeDarkLightActivity;
import android.v2.ThemeHideActionBarActivity;
import android.v2.ThemeImageActivity;
import android.v2.ThemeLightActivity;
import android.v2.ThemeOverlayActionBarActivity;
import android.v2.Portrait_Landscape_Activity;


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
    
    
    public static void fOpenColoredTitleBlueThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleBlueActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenColoredTitleGreenThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleGreenActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenColoredTitleRedThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleRedActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenImageThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeImageActivity.class);
    	origin.startActivity(intent);
    }


    public static void fOpenHideActionBarThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeHideActionBarActivity.class);
    	origin.startActivity(intent);
	}


    public static void fOpenOverlayActionBarThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeOverlayActionBarActivity.class);
    	origin.startActivity(intent);
	}
	
    
    public static void fOpenPortraitLandscapeActivity(Activity origin) {
    	Intent intent = new Intent(origin, Portrait_Landscape_Activity.class);
    	origin.startActivity(intent);
    }
}
