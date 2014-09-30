package edu.hsmw.localyou;

import edu.hsmw.localyou.adapter.TabsPagerAdapter;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Aktuelle Beiträge", "Archive", "Aufträge" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialization
		viewPager = (ViewPager) findViewById(R.id.pager);
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(mAdapter);
		
		actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		TabListener tabListener = new TabListener() {
			
			
			@Override
			public void onTabSelected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onTabReselected(Tab tab, FragmentTransaction ft) {
				// TODO Auto-generated method stub
				
			}		
			
			@Override
			public void onTabUnselected(Tab tab, FragmentTransaction ft) {
				

				
			}

		};
		
		// Adding Tabs
				for (String tab_name : tabs) {
					actionBar.addTab(actionBar.newTab()
							 .setText(tab_name)
							 .setTabListener(tabListener));
				}
		
		

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
		
		
	}
	

	
	
//Product[] items = {
//			
//			new Product(1, "Milk", 21.50),
//            new Product(2, "Butter", 15.99),
//            new Product(3, "Yogurt", 14.90),
//            new Product(4, "Toothpaste", 7.99),
//            new Product(5, "Ice Cream", 10.00),
//            new Product(6, "Milk", 21.50),
//            new Product(7, "Butter", 15.99),
//            new Product(8, "Yogurt", 14.90),
//            new Product(9, "Toothpaste", 7.99),
//            new Product(10, "Ice Cream", 10.00),
//        };
//
//ListView lv = (ListView) findViewById(R.id.listView1);
//
//ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1, items);
//
//lv.setAdapter(adapter);

}
