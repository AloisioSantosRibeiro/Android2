package android.v2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ThemeImageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme_image);
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
		getMenuInflater().inflate(R.menu.menu_theme_image, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				return true;
	    	case R.id.action_ThemeDark:
	    		tools.MenuFunctions.fOpenDarkThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemeLight:
	    		tools.MenuFunctions.fOpenLightThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemeDarkLight:
	    		tools.MenuFunctions.fOpenDarkLightThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemeColor:
	    		tools.MenuFunctions.fOpenColorThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemeImage:
	    		tools.MenuFunctions.fOpenImageThemeActivity(this);
	    		return true;
	    	default:
	    		return super.onOptionsItemSelected(item);
		}
//		return super.onOptionsItemSelected(item);
	}

}
