package uk.co.conandoylecollection.ex_articles_catchathief;

import uk.co.conandoylecollection.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstPageFragment extends Fragment{
	
	
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 

		 	View v = inflater.inflate(R.layout.viewpager_title_image_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("To Catch a Thief");
	        ImageView imageview = (ImageView)v.findViewById(R.id.pager_image);
	        imageview.setImageResource(R.drawable.articles_catchathief);
	        TextView web_link = (TextView) v.findViewById(R.id.web_link);
	        web_link.setText("http://www.conandoylecollection.co.uk/to-catch-a-thief.html");
	        Linkify.addLinks(web_link, Linkify.ALL);
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


