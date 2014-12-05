package uk.co.conandoylecollection.articles_aboutexhibitions;

import uk.co.conandoylecollection.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstPageFragment extends Fragment{
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.viewpager_title_text, container, false);

	        TextView title = (TextView) v.findViewById(R.id.pager_title);
	        title.setText("About the exhibitions");
	        TextView web_link = (TextView) v.findViewById(R.id.web_link);
	        web_link.setText("1. The Sharing Sherlock Project http://www.conandoylecollection.co.uk/Sharing-sherlock-project.html\n" +
	        		"2. About Sir Arthur Conan Doyle http://www.conandoylecollection.co.uk/about-doyle-crime-who.html\n" +
	        		"3.	About the Collection http://www.conandoylecollection.co.uk/index.html\n" +
	        		"4. About Sherlock Holmes http://www.conandoylecollection.co.uk/about-doyle-sherlock-holmes.html\n\n");
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


