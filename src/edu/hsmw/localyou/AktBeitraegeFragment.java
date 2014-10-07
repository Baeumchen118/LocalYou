package edu.hsmw.localyou;

import edu.hsmw.localyou.R;
import edu.hsmw.localyou.adapter.PostArrayAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AktBeitraegeFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 	Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_aktbeitraege, container, false);
		
		Post post1 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post2 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post3 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post4 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post5 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post6 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post7 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post8 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post9 = new Post(null, null, 0 ,"Text erster Eintrag");
		Post post10 = new Post(null, null, 0 ,"Text erster Eintrag");
		
		
		Post[] posts = new Post[10];
		posts[0] = post1;
		posts[1] = post2;
		posts[2] = post3;
		posts[3] = post4;
		posts[4] = post5;
		posts[5] = post6;
		posts[6] = post7;
		posts[7] = post8;
		posts[8] = post9;
		posts[9] = post10;
		
		ListView listView = (ListView) rootView.findViewById(R.id.listView1);
		PostArrayAdapter herbert = new PostArrayAdapter(getActivity(), posts);
		listView.setAdapter(herbert);;
		
		
		
		return rootView;
		
		}
}


