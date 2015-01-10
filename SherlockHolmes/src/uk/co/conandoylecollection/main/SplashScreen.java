package uk.co.conandoylecollection.main;

import uk.co.conandoylecollection.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/*
 * The Splash screen is showed.
 */
public class SplashScreen extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash_screen);


	Handler handle = new Handler();
	handle.postDelayed(new Runnable() {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Intent in = new Intent(SplashScreen.this, MainActivity.class);
		SplashScreen.this.finish();
		startActivity(in);
	}
}, 3000);

}}