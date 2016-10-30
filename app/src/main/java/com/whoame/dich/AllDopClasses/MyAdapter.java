package com.whoame.dich.AllDopClasses;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.whoame.dich.MainActivity;
import com.whoame.dich.MenuLinks.ContentCategory;
import com.whoame.dich.MenuLinks.InfoActivity;
import com.whoame.dich.MenuLinks.TasksActivity;
import com.whoame.dich.R;

import java.util.List;

/**
 * Created by medwedizaa on 29.10.16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Categoryes> myCategoryesArray;
    private Context context;

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView logoCategoryes;
        public TextView nameCategoryes;
        private String mItem;
        private TextView mTextView;
        Context context;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            context = itemView.getContext();
            logoCategoryes = (ImageView) itemView.findViewById(R.id.icon_category);
            nameCategoryes = (TextView) itemView.findViewById(R.id.name_category);
        }
        public void setItem(String item) {
            mItem = item;
            mTextView.setText(item);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, ContentCategory.class);
            //Toast.makeText(this, nameCategoryes.getText().toString(), Toast.LENGTH_SHORT).show();

            /*switch (nameCategoryes.getText().toString()) {
                case "Cryptography":
                    int flag = 0;
                    break;
                case "Web":
                    int flag = 1;
                    break;
                case "Steganography":
                    final int flag = 2;
                    break;

            }*/

            context.startActivity(intent);
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
