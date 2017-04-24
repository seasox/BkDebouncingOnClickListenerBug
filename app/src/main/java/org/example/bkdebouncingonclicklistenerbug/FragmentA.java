package org.example.bkdebouncingonclicklistenerbug;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class FragmentA extends Fragment {

    @BindView(R.id.text) TextView text;
    @BindView(R.id.button) Button button;

    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, parent, false);

        unbinder = ButterKnife.bind(this, view);

        text.setText("Hello Fragment A");
        button.setText("Goto Fragment B");

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (true) {
            button.performClick();
        }
    }

    @OnClick(R.id.button)
    public void onClick() {
        ((MainActivity)getActivity()).launchFragmentB();
    }

}
