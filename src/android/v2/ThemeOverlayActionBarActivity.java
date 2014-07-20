package android.v2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ThemeOverlayActionBarActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme_overlay_action_bar);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
		else {
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.theme_overlay_action_bar, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
			case R.id.action_help:
//				fOpenHelp();
				return true;
			case R.id.action_ThemesAndroid:
				tools.MenuFunctions.fOpenLightThemeActivity(this);
				return true;
			case R.id.action_ThemesColoredTitles:
				tools.MenuFunctions.fOpenColoredTitleBlueThemeActivity(this);
				return true;
			case R.id.action_ThemesImage:
				tools.MenuFunctions.fOpenImageThemeActivity(this);
				return true;
			case R.id.action_ThemesHideActionBar:
    			tools.MenuFunctions.fOpenHideActionBarThemeActivity(this);
				return true;
			case R.id.action_ThemesOverlayActionBar:
				tools.MenuFunctions.fOpenOverlayActionBarThemeActivity(this);
				return true;
			default:
				return super.onOptionsItemSelected(item);
    	}
	}

	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void fHideActionBar(View button_hideActionBar) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().hide();
		}
		else {
			getSupportActionBar().hide();
		}
	}

	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void fShowActionBar(View button_showActionBar) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().show();
		}
		else {
			getSupportActionBar().show();
		}
	}

}
