package com.example.hacunamatata.rikkeisoft_fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.hacunamatata.rikkeisoft_fragment.R;
import com.example.hacunamatata.rikkeisoft_fragment.activity.MainActivity;
import com.example.hacunamatata.rikkeisoft_fragment.model.Student;

/**
 * Created by hacunamatata on 9/30/2017.
 */

public class StudentInfoFragment extends Fragment {

    TextView mName, mHomeTown, mDOB, mGender, mClass, mCourse;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student_info, container, false);

        //Initialize variables
        mName = v.findViewById(R.id.Display_StudentName);
        mHomeTown = v.findViewById(R.id.Display_HomeTown);
        mDOB = v.findViewById(R.id.Display_DOB);
        mGender = v.findViewById(R.id.Display_Gender);
        mClass = v.findViewById(R.id.Display_Class);
        mCourse = v.findViewById(R.id.Display_Course);

        //Get bundle and display
        Bundle bundle = getArguments();

        if (bundle != null) {
            Student student = bundle.getParcelable(MainActivity.KEY_OBJECT);

            mName.setText(student.getName());
            mHomeTown.setText(student.getHomeTown());
            mDOB.setText(student.getDOB());
            mGender.setText(student.getGender());
            mClass.setText(student.getAClass());
            mCourse.setText(student.getCourse());
        }

        return v;
    }
}
