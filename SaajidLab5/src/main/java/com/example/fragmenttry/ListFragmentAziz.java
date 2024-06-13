//Saajid Aziz   n01555756
package com.example.fragmenttry;



import static com.example.fragmenttry.DefinitionFragmentSaajid.con;
import static com.example.fragmenttry.DefinitionFragmentSaajid.def;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ListFragmentAziz extends Fragment {

    private ListView listView;
     String[] concepts;
    String[] definition;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        concepts = getResources().getStringArray(R.array.concepts);
        definition = getResources().getStringArray(R.array.definitions);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {








                // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.SaajidlistView1);




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(requireActivity(),
                android.R.layout.simple_list_item_1, concepts);
        //bind the list view with array adapter
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((arg0, arg1, position, arg3) -> {
              listView.setSelector(android.R.color.holo_blue_dark);



                    con.setText(concepts[position]);
                    def.setText(definition[position]);


        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), getString(R.string.test_toast), Toast.LENGTH_LONG).show();
    }

}