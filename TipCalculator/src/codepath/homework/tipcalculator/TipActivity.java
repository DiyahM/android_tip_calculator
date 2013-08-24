package codepath.homework.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class TipActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip, menu);
		return true;
	}
	
	public void setTenPercentTip(View v) {
		setTipField(.1);	
	}
	
	public void setFifteenPercentTip(View v) {
		setTipField(.15);
	}
	
	public void setTwentyPercentTip(View v) {
		setTipField(.2);
	}
	
	private void setTipField(Double percentage) {
		String strTotal = ((EditText) findViewById(R.id.etTotal)).getText().toString();
		if (!strTotal.isEmpty()) {
		  Double tipAmt = Double.parseDouble(strTotal) * percentage;
		  DecimalFormat df = new DecimalFormat("0.00");
		  ((TextView) findViewById(R.id.tvTipAmt)).setText("$" + String.valueOf(df.format(tipAmt)));
		}
		
	}

}
