package android.v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	public final static String EXTRA_MESSAGE = "v2.android2.MESSAGE";
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

    	// Eclipse's code
//    	getMenuInflater().inflate(R.menu.menu_main, menu);
//      return true;
    	
    	// Android's page code
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu_main, menu);
    	return super.onCreateOptionsMenu(menu);
    }

    
    public boolean onOptionsItemSelected(MenuItem item) {
    	// Handle presses on the action bar items
    	switch(item.getItemId()) {
    		case R.id.action_help:
//    			fOpenHelp();
    			return true;
    		case R.id.action_ThemeDark:
    			fOpenDarkThemeActivity();
    			return true;
    		case R.id.action_ThemeLight:
    			fOpenLightThemeActivity();
    			return true;
    		case R.id.action_ThemeDarkLight:
    			fOpenDarkLightThemeActivity();
    			return true;
    		case R.id.action_ThemeColor:
    			fOpenColorThemeActivity();
    			return true;
    		case R.id.action_ThemeImage:
    			fOpenImageThemeActivity();
    			return true;
    		default:
    			return super.onOptionsItemSelected(item);
    	}
    }

    
    public void fOpenDarkThemeActivity() {
    	Intent intent = new Intent(this, ThemeDarkActivity.class);
    	startActivity(intent);
    }
    
    
    public void fOpenLightThemeActivity() {
    	Intent intent = new Intent(this, ThemeLightActivity.class);
    	startActivity(intent);
    }
    
    
    public void fOpenDarkLightThemeActivity() {
    	Intent intent = new Intent(this, ThemeDarkLightActivity.class);
    	startActivity(intent);
    }
    
    
    public void fOpenColorThemeActivity() {
    	Intent intent = new Intent(this, ThemeColorActivity.class);
    	startActivity(intent);
    }
    
    
    public void fOpenImageThemeActivity() {
    	Intent intent = new Intent(this, ThemeImageActivity.class);
    	startActivity(intent);
    }
    
    
    /** Called when the user presses the Send button */
    public void sendMessage(View view) {
    	// Do something in response to button
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
}
