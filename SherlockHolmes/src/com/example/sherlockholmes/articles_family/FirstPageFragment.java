package com.example.sherlockholmes.articles_family;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sherlockholmes.R;

public class FirstPageFragment extends Fragment{
	

	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_image_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("The Conan Doyle Family");
	        TextView tv = (TextView) v.findViewById(R.id.pager_text);
	        tv.setText(getArguments().getString("msg"));
	      
	        return v;
	    }

	    public static FirstPageFragment newInstance(String text) {

	        FirstPageFragment f = new FirstPageFragment();
	        Bundle b = new Bundle();
	        b.putString("msg", text);

	        f.setArguments(b);

	        return f;
	    }
	}


