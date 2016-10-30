package com.whoame.dich.AllDopClasses;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.whoame.dich.R;

import java.util.List;

/**
 * Created by medwedizaa on 29.10.16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Categoryes> myCategoryesArray;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView logoCategoryes;
        public TextView nameCategoryes;
        private String mItem;
        private TextView mTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            logoCategoryes = (ImageView) itemView.findViewById(R.id.icon_category);
            nameCategoryes = (TextView) itemView.findViewById(R.id.name_category);
        }
        public void setItem(String item) {
            mItem = item;
            mTextView.setText(item);
        }

        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick " + getPosition() + " " + mItem);
        }

    }

    public MyAdapter(List<Categoryes> myCategoryes, Context context) {
        this.myCategoryesArray = myCategoryes;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.content_recycler_info, parent, false);
        view.setOnClickListener(onClick);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Categoryes myCategoryes = myCategoryesArray.get(position);

        //TODO привести к норм виду наполнение картинки
        holder.logoCategoryes.setImageResource(myCategoryes.getLogoCategoryes());
        holder.nameCategoryes.setText(myCategoryes.getNameCategoryes().toString());

    }

    @Override
    public int getItemCount() {
        return myCategoryesArray.size();
    }
}
