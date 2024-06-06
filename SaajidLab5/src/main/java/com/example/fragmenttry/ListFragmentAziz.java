package com.example.fragmenttry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ListFragmentAziz extends Fragment {

    private ListView listView;

    String[] concepts = new String[]
            {
                    "Android",
                    "ART",
                    "AVD",
                    "Intent",
                    "AOT",
                    "Emulator",
                    "Activity",
                    "Fragment",
                    "Life Cycle events" };
    //
    String[] definition = new String[]
            {"Open source software stack",
                    "Android Runtime Environment",
                    "Android Virtual Device",
                    "An abstract description of an operation to be performed",
                    "Ahead of Time compilation",
                    "Simulates Android devices on your computer",
                    "Application component that provides a screen",
                    "A mini activity",
                    "These methods are called when ....."};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, concepts);
        //bind the list view with array adapter
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3)
            {
                  listView.setSelector(android.R.color.holo_blue_dark);
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "Test toast", Toast.LENGTH_LONG).show();
    }

}