package taappscom.ta.dhishna;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jugal on 02-08-2017.
 */

public class contactus extends Fragment {
    View viewer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
View view=inflater.inflate(R.layout.contactus,container,false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));


        //recyclerView.setLayoutManager(layoutManager);
        ContactAdapter credits = new ContactAdapter();
        recyclerView.setAdapter(credits);
        recyclerView.setBackgroundResource(R.color.cardview_light_background);

        return view;
       // return inflater.inflate(R.layout.contactus, container, false);


    }



}