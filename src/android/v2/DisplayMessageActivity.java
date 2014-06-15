package android.v2;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		// Create the text view
		TextView textView = new TextView(this);
		textView.setTextSize(19);
		textView.setText(message);
		
		setContentView(R.layout.activity_display_message);
		// Set the text view as the activity layout
		setContentView(textView);
		
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		
		// If minSdkVersion is 11 or Higher
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
			getActionBar().hide();
		}
		else {
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
			getSupportActionBar().hide();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_display_message, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle presses on the action bar items
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
			case R.id.action_help:
				// fOpenHelp();
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
	}

}
