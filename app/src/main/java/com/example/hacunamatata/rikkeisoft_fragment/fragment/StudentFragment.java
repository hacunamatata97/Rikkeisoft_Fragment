package com.example.hacunamatata.rikkeisoft_fragment.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.hacunamatata.rikkeisoft_fragment.R;
import com.example.hacunamatata.rikkeisoft_fragment.activity.MainActivity;
import com.example.hacunamatata.rikkeisoft_fragment.model.Student;

/**
 * Created by hacunamatata on 9/30/2017.
 */

public class StudentFragment extends Fragment implements View.OnClickListener {

    TextView mStudentName;
    EditText mHomeTown, mDOB, mGender, mClass, mCourse;
    Button mFinish;

    Student mStudent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student, container, false);

        //Initialize variables
        mStudentName = v.findViewById(R.id.Display_Name);
        mHomeTown = v.findViewById(R.id.Text_HomeTown);
        mDOB = v.findViewById(R.id.Text_DOB);
        mGender = v.findViewById(R.id.Text_Gender);
        mClass = v.findViewById(R.id.Text_Class);
        mCourse = v.findViewById(R.id.Text_Course);

        mFinish = v.findViewById(R.id.finishBtn);

        //Get bundle and display
        Bundle bundle = getArguments();
        if(bundle != null) {
            String name = bundle.getString(MainActivity.KEY_NAME, "");
            mStudentName.setText(name);
        }

        //Set onclick
        mFinish.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        mStudent = new Student(mStudentName.getText().toString(),
                mHomeTown.getText().toString(),
                mHomeTown.getText().toString(),
                mGender.getText().toString(),
                mClass.getText().toString(),
                mCourse.getText().toString());

        ((MainActivity)getActivity()).gotoFragmentWithObject(mStudent);
    }
}
