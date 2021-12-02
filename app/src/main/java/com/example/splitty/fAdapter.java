package com.example.splitty;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class fAdapter extends RecyclerView.Adapter<fAdapter.ViewHolder> {

    private ArrayList<String> nameList;   //data: the names displayed
    private RVClickListener RVlistener;    //listener defined in main activity
    private Context context;
    String movieUrl;

    /* passing in the data and the listener defined in the main activity */
    public fAdapter(ArrayList<String> theList, RVClickListener listener, Context conText){
        nameList = theList;
        context = conText;
        this.RVlistener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View listView = inflater.inflate(R.layout.rv_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listView, RVlistener);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
    /*
        This class creates a wrapper object around a view that contains the layout for
         an individual item in the list. It also implements the onClickListener so each ViewHolder in the list is clickable.
        It's onclick method will call the onClick method of the RVClickListener defined in
        the main activity.
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public CheckBox name;
        private RVClickListener listener;
        private View itemView;


        public ViewHolder(@NonNull View itemView, RVClickListener passedListener) {
            super(itemView);
            name = itemView.findViewById(R.id.checkBox);
            this.itemView = itemView;
            this.listener = passedListener;

            /* don't forget to set the listener defined here to the view (list item) that was passed in to the constructor. */
            name.setOnClickListener(this); //set short click listener
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
            Log.i("ON_CLICK", "in the onclick in view holder");
        }
    }
    //----------------------------------------------------------------------------------------------------------
}