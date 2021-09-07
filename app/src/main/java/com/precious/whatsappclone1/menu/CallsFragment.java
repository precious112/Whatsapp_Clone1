package com.precious.whatsappclone1.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.precious.whatsappclone1.R;
import com.precious.whatsappclone1.adapter.CallListAdapter;
import com.precious.whatsappclone1.model.CallList;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CallsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CallsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CallsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CallsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CallsFragment newInstance(String param1, String param2) {
        CallsFragment fragment = new CallsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);}
        View view =  inflater.inflate(R.layout.fragment_calls, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<CallList> lists = new ArrayList<>();
            //recyclerView.setAdapter(new CallListAdapter(lists,getContext()));



            //lists.add(new CallList("11", "precious", "15/06/2021", "https://media.gq.com/photos/5e5ebc2cb7235e00084122d3/1:1/w_2999,h_2999,c_limit/burna-boy-gq-style-spring-summer-2020-promo.jpg", "income"));
            //lists.add(new CallList("11", "precious", "15/06/2021", "https://media.gq.com/photos/5e5ebc2cb7235e00084122d3/1:1/w_2999,h_2999,c_limit/burna-boy-gq-style-spring-summer-2020-promo.jpg", "income"));
            //lists.add(new CallList("11", "precious", "15/06/2021", "https://media.gq.com/photos/5e5ebc2cb7235e00084122d3/1:1/w_2999,h_2999,c_limit/burna-boy-gq-style-spring-summer-2020-promo.jpg", "missed"));
            //lists.add(new CallList("11", "precious", "15/06/2021", "https://media.gq.com/photos/5e5ebc2cb7235e00084122d3/1:1/w_2999,h_2999,c_limit/burna-boy-gq-style-spring-summer-2020-promo.jpg", "missed"));
            //recyclerView.setAdapter(new CallListAdapter(lists,getContext()));

        return view;

        }




}