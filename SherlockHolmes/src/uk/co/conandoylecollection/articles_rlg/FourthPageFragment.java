package uk.co.conandoylecollection.articles_rlg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uk.co.conandoylecollection.R;
public class FourthPageFragment extends Fragment{

	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("Conan Doyle and Portsmouth");
	        TextView tv = (TextView) v.findViewById(R.id.pager_text);
	        tv.setText(getArguments().getString("msg"));
	      
	        

	        return v;
	    }

	    public static FourthPageFragment newInstance(String text) {

	        FourthPageFragment f = new FourthPageFragment();
	        Bundle b = new Bundle();
	        b.putString("msg", text);

	        f.setArguments(b);

	        return f;
	    }
	}


