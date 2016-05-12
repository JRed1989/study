package org.red.demo.activity;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends Activity implements OnClickListener,OnLongClickListener{
	
	private static final String TAG = "MyActivity";
	
	private Button btn_ok,btn_cancel;
	private EditText input;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitity_main);
		btn_ok = (Button) findViewById(R.id.btn_ok);
		btn_cancel  =  (Button) findViewById(R.id.btn_cancel);
		input  =  (EditText) findViewById(R.id.input);
		btn_ok.setOnClickListener(this);
		btn_cancel.setOnClickListener(this);
		btn_ok.setOnLongClickListener(this);
		Log.e(TAG, "onCreate");
	}
	 
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e(TAG, "onStart");
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e(TAG, "onResume");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e(TAG, "onPause");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e(TAG, "onStop");
	}
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e(TAG, "onDestroy");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.e(TAG, "onRestart");
	}

	@Override
	public boolean onLongClick(View v) {
		if(v == btn_ok){
			Toast toast = Toast.makeText(getApplicationContext(), "I'm ok! I love android!", Toast.LENGTH_LONG);
			toast.show();
		}
		return false;
	}

	@Override
	public void onClick(View v) {
		if(v == btn_ok){
			input.setText("这真是极好的!");
		}else if(v ==  btn_cancel){
			input.setText("");
		}
		
		
	}

}
