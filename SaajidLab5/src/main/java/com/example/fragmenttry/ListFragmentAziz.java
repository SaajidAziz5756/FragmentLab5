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
                    getString(R.string.android),
                    getString(R.string.art),
                    getString(R.string.avd),
                    getString(R.string.intent),
                    getString(R.string.aot),
                    getString(R.string.emulator),
                    getString(R.string.activity),
                    getString(R.string.fragment),
                    getString(R.string.life_cycle_events) };
    //
    String[] definition = new String[]
            {getString(R.string.open_source_software_stack),
                    getString(R.string.android_runtime_environment),
                    getString(R.string.android_virtual_device),
                    getString(R.string.an_abstract_description_of_an_operation_to_be_performed),
                    getString(R.string.ahead_of_time_compilation),
                    getString(R.string.simulates_android_devices_on_your_computer),
                    getString(R.string.application_component_that_provides_a_screen),
                    getString(R.string.a_mini_activity),
                    getString(R.string.these_methods_are_called_when)};



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
        Toast.makeText(getActivity(), getString(R.string.test_toast), Toast.LENGTH_LONG).show();
    }

}