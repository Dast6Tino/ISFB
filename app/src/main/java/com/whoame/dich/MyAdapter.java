package com.whoame.dich;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.CalendarContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.R;

import java.util.List;
import java.util.Locale;

import static java.lang.String.format;

/**
 * Created by medwedizaa on 19.04.16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Categoryes> myCategoryesArray;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView logoCategoryes;
        public TextView nameCategoryes;

        public MyViewHolder(View itemView) {
            super(itemView);
            logoCategoryes = (ImageView) itemView.findViewById(R.id.before_after);
            nameCategoryes = (TextView) itemView.findViewById(R.id.data);
        }

    }

    public MyAdapter(List<Categoryes> myCategoryes, Context context) {
        this.myCategoryesArray = myCategoryes;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.content, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final Categoryes myCategoryes = myCategoryesArray.get(position);

        //TODO тут возможны ошибки с описанием картинки

        holder.logoCategoryes.setImageResource(Categoryes.getLogoCategoryes());
        holder.nameCategoryes.setText(Categoryes.getNameCategoryes().toString());

    }

    @Override
    public int getItemCount() {
        return myCategoryesArray.size();
    }
}
