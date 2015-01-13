package uk.co.conandoylecollection.ex_articles_thelostworld;

import uk.co.conandoylecollection.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/*
 * The layout of the article with content:text, image and web link.
 */
public class FirstPageFragment extends Fragment{
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 

		 	View v = inflater.inflate(R.layout.viewpager_title_image_text, container, false);
	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("The Lost World");
	        ImageView imageview = (ImageView)v.findViewById(R.id.pager_image);
	        imageview.setImageResource(R.drawable.articles_thelostworld);
	        TextView web_link = (TextView) v.findViewById(R.id.web_link);
	        web_link.setText("Watch the The Lost and Found World film\n" +
	        		"http://vimeo.com/84220764 \n\n" +
	        		"Find out more about The Lost World Exhibition\n " +
	        "http://www.conandoylecollection.co.uk/lost-world.html" );
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


