package taappscom.ta.dhishna;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jugal on 01-09-2017.
 */

public class ContactAdapter  extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    String companies[]={"Convenor","Convenor","Treasurer","Website Developer","App Developer","Tech Support","Icons and Image Courtsey"};
    int logo_comp[]={R.drawable.comp,R.drawable.comp,R.drawable.comp,R.drawable.comp,R.drawable.comp,R.drawable.comp,R.drawable.comp};
    String comp_details[]={"Ismail Rizwan","Yadu Krishnan S","Rahul Jayaraj K","Nazim Mohammed","Jugal J","Muhammed Shibin","FlatIcon,FreePik and Icons8(various contributors)"};
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView name;
        public TextView dept;
        public ImageButton plbtn;
        public ImageButton shrbtn;


        ViewHolder(View view) {
            super(view);
            view.setBackgroundResource(R.color.cardview_light_background);
            imageView = (ImageView) itemView.findViewById(R.id.comp_logo);
            name = (TextView) itemView.findViewById(R.id.job_title);
            dept = (TextView) itemView.findViewById(R.id.name);
//            view.setOnClickListener(new OnClickListener() {
            //            @Override
            //              public void onClick(View v) {
            //              Context context = v.getContext();
            //            Intent intent = new Intent(context, Act2.class);
            //          intent.putExtra("EVENT_NO", getAdapterPosition());
            //        context.startActivity(intent);
            //   }
            //});


        }

    }



    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.credts,parent,false);
        ViewHolder holder=new ViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //events event_instance = (events) this.eventList.get(position);
        //holder.dept.setText("Branch:"+event_instance.getBranch());

        //holder.imageView.setImageResource(this.context.getResources().getIdentifier(event_instance.getImage(), "drawable", this.context.getPackageName()));
        //holder.name.setText(event_instance.getName());
        holder.name.setText(companies[position]);
        holder.imageView.setImageResource(logo_comp[position]);
        holder.dept.setText(comp_details[position]);
    }
    @Override
    public int getItemCount()
    {
        return this.companies.length;
    }
}

