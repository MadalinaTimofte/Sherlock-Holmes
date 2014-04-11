package com.example.sherlockholmes.gallery;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sherlockholmes.R;

/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link CardFlipActivity} and {@link
 * ScreenSlideActivity} samples.</p>
 */
public class ScreenSlideFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
   public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
    int position;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlideFragment createPosition(int pageNumber) {
        ScreenSlideFragment fragment = new ScreenSlideFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlideFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.layout_fullscreen_image, container, false);

        // Set the title view to show the page number.
        
        
        ImageView imageView = (ImageView) rootView.findViewById(R.id.full_image);
        TextView textview = (TextView) rootView.findViewById(R.id.item_text);
        Button btnClose = (Button) rootView.findViewById(R.id.btnClose);
        
        ImageAdapter imageAdapter = new ImageAdapter(getActivity());
        
      //  imageView.setImageResource(imageAdapter.mThumbIds[position]);
      //  textview.setText(imageAdapter.description[position]);
        
        btnClose.setOnClickListener(new View.OnClickListener() {            
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
