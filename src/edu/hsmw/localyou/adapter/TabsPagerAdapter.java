package edu.hsmw.localyou.adapter;

import edu.hsmw.localyou.ArchivFragement;
import edu.hsmw.localyou.AuftraegeFragement;
import edu.hsmw.localyou.AktBeitraegeFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new AktBeitraegeFragment();
		case 1:
			// Games fragment activity
			return new ArchivFragement();
		case 2:
			// Movies fragment activity
			return new AuftraegeFragement();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
