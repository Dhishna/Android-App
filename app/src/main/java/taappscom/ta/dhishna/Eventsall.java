package taappscom.ta.dhishna;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Jugal on 02-08-2017.
 */
public class Eventsall extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
// Inflate the layout for this fragment
View view= inflater.inflate(R.layout.all_events,container,false);

        ListView theListView = (ListView)view.findViewById(R.id.mainListView);



        // prepare elements to display

        final ArrayList<Item> items = Item.getTestingList();



       final SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this.getActivity());

        // add custom btn handler to first list item

        items.get(0).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
               // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                  Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
               // FragmentManager fragmentManager = getFragmentManager();
               // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               // EventPageAdapter fragment=new EventPageAdapter();
               // fragmentTransaction.replace(R.id.contents,fragment);
               // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",0);
                context.startActivity(intent);
            }

        });
        items.get(1).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",1);
                context.startActivity(intent);
            }

        });
        items.get(2).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",2);
                context.startActivity(intent);
            }

        });
        items.get(3).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",3);
                context.startActivity(intent);
            }

        });
        items.get(4).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",4);
                context.startActivity(intent);
            }

        });
        items.get(5).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",5);
                context.startActivity(intent);
            }

        });
        items.get(6).setRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
//Eventsall.super.onSaveInstanceState(savedInstanceState);
                // savedInstanceState.putInt("BRANCH",0);
//SharedPreferences.Editor editor=sharedPreferences.edit();
                //editor.putInt("Branch_Name",0);
                //editor.apply();
                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR FIRST BUTTON", Toast.LENGTH_SHORT).show();
                // FragmentManager fragmentManager = getFragmentManager();
                // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // EventPageAdapter fragment=new EventPageAdapter();
                // fragmentTransaction.replace(R.id.contents,fragment);
                // fragmentTransaction.commit();
                Context context = v.getContext();
                Intent intent=new Intent(context,Branch_events.class);
                intent.putExtra("BRANCH",6);
                context.startActivity(intent);
            }

        });




        // create custom adapter that holds elements and their state (we need hold a id's of unfolded elements for reusable elements)

        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(this.getActivity(), items);



        // add default btn handler for each request btn on each item if custom handler not found

        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putInt("Branch_Name",1);
                editor.apply();

                Toast.makeText(getActivity(), "CUSTOM HANDLER FOR  BUTTON", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                EventPageAdapter fragment=new EventPageAdapter();
                fragmentTransaction.replace(R.id.contents,fragment);
                fragmentTransaction.commit();

            }

        });



        // set elements to adapter

        theListView.setAdapter(adapter);



        // set on click event listener to list view

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                // toggle clicked cell state

                ((FoldingCell) view).toggle(false);

                // register in adapter that state for selected cell is toggled

                adapter.registerToggle(pos);

            }

        });


       view.getOverScrollMode();
        return view;
    }

}