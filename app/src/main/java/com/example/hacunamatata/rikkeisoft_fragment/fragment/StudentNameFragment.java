package com.example.hacunamatata.rikkeisoft_fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.hacunamatata.rikkeisoft_fragment.R;
import com.example.hacunamatata.rikkeisoft_fragment.activity.MainActivity;

/**
 * Created by hacunamatata on 9/30/2017.
 */

public class StudentNameFragment extends Fragment implements View.OnClickListener  {

    EditText mName;
    Button mNext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student_name, container, false);

        //Initialize variables
        mName = v.findViewById(R.id.Text_StudentName);
        mNext = v.findViewById(R.id.nextBtn);

        //Set onclick
        mNext.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        ((MainActivity)getActivity()).gotoFragmentWithName(mName.getText().toString());
    }
}
