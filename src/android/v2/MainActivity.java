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
