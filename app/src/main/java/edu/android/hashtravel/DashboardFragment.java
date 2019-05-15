package edu.android.hashtravel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {


    private Spinner continentSpinner, countrySpinner;
//    private String[] continents = {"Asia", "Europe", "America", "South America", "Africa", "Oceania"};

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");
        continentSpinner = view.findViewById(R.id.continectSpinner);
        countrySpinner = view.findViewById(R.id.countrySpinner);

        continentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               ArrayAdapter<CharSequence> adpter;
               if(position == 0) {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.Asia_Country, android.R.layout.simple_spinner_item);
               } else if(position == 1) {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.Europe_Country, android.R.layout.simple_spinner_item);
               } else if(position == 2) {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.America_, android.R.layout.simple_spinner_item);
               } else if(position == 3) {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.SouthAmerica_Country, android.R.layout.simple_spinner_item);
               } else if(position == 4) {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.Africa_Country, android.R.layout.simple_spinner_item);
               } else {
                   adpter = ArrayAdapter.createFromResource(view.getContext(), R.array.Oceania_, android.R.layout.simple_spinner_item);
               }

               adpter.setDropDownViewResource(android.R.layout.simple_spinner_item);
               countrySpinner.setAdapter(adpter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


       return view;
    }

}
