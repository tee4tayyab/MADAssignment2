package com.example.tee.madassignment2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class SampleFragment extends Fragment {

    RecyclerView recyclerView;

    View view;

    public SampleFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_sample, container, false);

        ArrayList<Contacts> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            arrayList.add(new Contacts(i," abc="+ i ,"Email =alihassan@gmail.com" ,"090078601" ));
        }





        ContactsAdapter customAdapter = new ContactsAdapter(getActivity(),arrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(customAdapter);

        return view;

    }
}
