package me.cakeninja.adding_the_action_bar;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the message from the Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Create the TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //Set the TextView as the activity layout
        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
