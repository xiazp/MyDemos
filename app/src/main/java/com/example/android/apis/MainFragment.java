package com.example.android.apis;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.apis.view.ScreenSlidePagerActivity;
import com.example.android.apis.view.backgroud.BackgroupActivity;


public class MainFragment extends Fragment implements MainContract.View, View.OnClickListener {

    private RecyclerView mRecyclerView;
    private MainContract.Presenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        initView(view);

        return view;
    }

    private void initView(View view){
        mRecyclerView = view.findViewById(R.id.rcvItems);
        mRecyclerView.setAdapter(new ItemAdapter());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btScreenSlide:
                startActivity(ScreenSlidePagerActivity.class);
                break;
            case R.id.btBackgroud:
                startActivity(BackgroupActivity.class);
                break;
        }

    }

    private void startActivity(Class<?> activity){
        Intent intent = new Intent(getActivity(), activity);
        startActivity(intent);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
