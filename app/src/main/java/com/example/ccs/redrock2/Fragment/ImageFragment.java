package com.example.ccs.redrock2.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ccs.redrock2.R;

public class ImageFragment extends Fragment {
    View view;
    ImageView imageView;
    TextView textView;
    int resID;
    String text;

    public void setData(int resID, String text) {
        this.resID = resID;
        this.text = text;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_image_layout, container, false);

        imageView = view.findViewById(R.id.myImage);
        textView = view.findViewById(R.id.myText);

        imageView.setImageResource(resID);
        textView.setText(text);
        return view;
    }
}
