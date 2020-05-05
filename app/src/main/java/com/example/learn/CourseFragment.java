package com.example.learn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CourseFragment extends Fragment {
    GridView simpleListView;
    String[] courseNames = {"djanjo", "mobileapp", "python"};
    int[] courseImages = {R.drawable.django, R.drawable.mobileapp, R.drawable.pythonn};

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course,container,false);


    }
}
