package edu.hsmw.localyou;

import edu.hsmw.localyou.adapter.TabsPagerAdapter;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private TabsPagerAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Aktuelle Beiträge", "Archive", "Aufträge" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

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
	
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		
		ListView listView1 = (ListView) findViewById(R.id.listView1);
		Product[] items = {
				
				new Product (11, "LocalYou - Erfolgreiches Studentenprojekt aus Mittweida", 2),
	            new Product(1, "Milk", 21.50),
	            new Product(2, "Butter", 15.99),
	            new Product(3, "Yogurt", 14.90),
	            new Product(4, "Toothpaste", 7.99),
	            new Product(5, "Ice Cream", 10.00),
	            new Product(6, "Milk", 21.50),
	            new Product(7, "Butter", 15.99),
	            new Product(8, "Yogurt", 14.90),
	            new Product(9, "Toothpaste", 7.99),
	            new Product(10, "Ice Cream", 10.00),
	        };
	       
	        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
	                    android.R.layout.simple_list_item_1, items);
       
        listView1.setAdapter(adapter);
		
	}

}
