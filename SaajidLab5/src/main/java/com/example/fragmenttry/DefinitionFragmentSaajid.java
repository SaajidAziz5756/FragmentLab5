//Saajid Aziz   n01555756
package com.example.fragmenttry;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class DefinitionFragmentSaajid extends Fragment {



    public DefinitionFragmentSaajid() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_definition, container, false);


       TextView con = view.findViewById(R.id.Saajidconcepts);
       TextView def = view.findViewById(R.id.Saajiddefinition);




        return view;

    }

}