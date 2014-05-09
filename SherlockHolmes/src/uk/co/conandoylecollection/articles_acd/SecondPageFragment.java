package uk.co.conandoylecollection.articles_acd;

import uk.co.conandoylecollection.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

  

public class SecondPageFragment extends Fragment{
	

	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("University Life");
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

