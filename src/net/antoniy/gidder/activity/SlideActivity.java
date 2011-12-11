package net.antoniy.gidder.activity;

import net.antoniy.gidder.R;
import net.antoniy.gidder.adapter.SlideAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Window;

import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

public class SlideActivity extends FragmentActivity {
	private final static String TAG = SlideActivity.class.getSimpleName();
	
	private SlideAdapter mAdapter;
	private ViewPager mPager;
	private PageIndicator mIndicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.slide);
		
		Log.i(TAG, "Creating slide activity...");
		
		mAdapter = new SlideAdapter(getSupportFragmentManager());
		
		mPager = (ViewPager)findViewById(R.id.slidePager);
		mPager.setAdapter(mAdapter);
		
		mIndicator = (TitlePageIndicator)findViewById(R.id.slideIndicator);
		mIndicator.setViewPager(mPager);
	}

}