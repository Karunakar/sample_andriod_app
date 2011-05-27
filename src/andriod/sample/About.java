package andriod.sample;

import android.app.Activity;
import android.os.Bundle;

public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("About ");
		setContentView(R.layout.about);
	}
}