package com.example.sherlockholmes.articles_spiritualism;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sherlockholmes.R;

public class SecondPageFragment extends Fragment{

	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_text, container, false);

	       
	        TextView title  = (TextView)v.findViewById(R.id.pager_title);
	        title.setText("The Cottingley Fairies");
	        TextView tv = (TextView) v.findViewById(R.id.pager_text);
	        tv.setText(getArguments().getString("msg"));
	        
          
	        return v;
	    }

	    public static SecondPageFragment newInstance(String text) {

	        SecondPageFragment f = new SecondPageFragment();
	        Bundle b = new Bundle();
	        b.putString("msg", text);

	        f.setArguments(b);

	        return f;
	    }
	}


