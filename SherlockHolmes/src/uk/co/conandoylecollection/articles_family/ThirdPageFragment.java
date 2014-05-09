package uk.co.conandoylecollection.articles_family;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.conandoylecollection.R;

public class ThirdPageFragment extends Fragment{
	

	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_image_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("The Conan Doyle Children");
	        ImageView imageview = (ImageView)v.findViewById(R.id.pager_image);
	        imageview.setImageResource(R.drawable.articles_conanandsons);
	        TextView tv = (TextView) v.findViewById(R.id.pager_text);
	        tv.setText(getArguments().getString("msg"));
	     
	        
	        

	        return v;
	    }

	    public static ThirdPageFragment newInstance(String text) {

	        ThirdPageFragment f = new ThirdPageFragment();
	        Bundle b = new Bundle();
	        b.putString("msg", text);

	        f.setArguments(b);

	        return f;
	    }
	}

