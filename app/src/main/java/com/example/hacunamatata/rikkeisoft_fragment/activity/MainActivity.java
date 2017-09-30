package com.example.hacunamatata.rikkeisoft_fragment.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.hacunamatata.rikkeisoft_fragment.R;
import com.example.hacunamatata.rikkeisoft_fragment.fragment.StudentFragment;
import com.example.hacunamatata.rikkeisoft_fragment.fragment.StudentInfoFragment;
import com.example.hacunamatata.rikkeisoft_fragment.fragment.StudentNameFragment;
import com.example.hacunamatata.rikkeisoft_fragment.model.Student;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_NAME = "KEY_NAME";
    public static final String KEY_OBJECT = "KEY_OBJECT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        StudentNameFragment studentNameFragment = new StudentNameFragment();

        transaction.replace(R.id.frame_content, studentNameFragment).commit();
    }

    public void gotoFragmentWithName(String text) {
        StudentFragment studentFragment = new StudentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_NAME, text);
        studentFragment.setArguments(bundle);

        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frame_content, studentFragment).addToBackStack(null).commit();
    }

    public void gotoFragmentWithObject(Student student) {
        StudentInfoFragment studentInfoFragment = new StudentInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(MainActivity.KEY_OBJECT, student);
        studentInfoFragment.setArguments(bundle);

        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frame_content, studentInfoFragment).addToBackStack(null).commit();
    }
}
