package com.example.tee.madassignment2;
import android.support.v7.widget.RecyclerView;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;


import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;


public class ContactsAdapter  extends RecyclerView.Adapter<ContactsAdapter.myViewHolder> {


    Button btn;

    View view1;

    FragmentActivity context;

    ArrayList<Contacts> arr;


    public ContactsAdapter(FragmentActivity context, ArrayList<Contacts> info) {


        this.context = context;

        this.arr = info;

    }


    public class myViewHolder extends RecyclerView.ViewHolder {


        TextView t1;

        TextView t2;

        TextView t3;

        Button btn;

        ImageView img;



        public myViewHolder(View itemView) {

            super(itemView);

            t1 = (TextView) itemView.findViewById(R.id.tvName);

            t2 = (TextView) itemView.findViewById(R.id.tvEmail);

            t3 = (TextView) itemView.findViewById(R.id.tvPhone);

            btn = (Button) itemView.findViewById(R.id.btn1);

            img = (ImageView) itemView.findViewById(R.id.img_android);

        }
    }



    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        view1 = LayoutInflater.from(context).inflate(R.layout.fragment_sample, parent, false);

        myViewHolder vh = new myViewHolder(view1);

        return vh;
    }


    @Override

    public void onBindViewHolder(final myViewHolder holder, final int position) {


        Contacts c = arr.get(position);

        holder.t1.setText(c.getFname().toString());

        holder.t2.setText(c.getFemail().toString());

        holder.t3.setText(c.getFphone().toString());



        view1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {


                int itemPosition = holder.getAdapterPosition();


                EventBus.getDefault().post(new EventPojo("New message!"));

            }
        });

        holder.btn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                arr.remove(position);

                notifyItemRangeChanged(position, arr.size());

                Toast.makeText(context, " item deleted  ", Toast.LENGTH_SHORT).show();



            }

        });
    }


    @Override

    public int getItemCount() {

        return arr.size();
    }


}
