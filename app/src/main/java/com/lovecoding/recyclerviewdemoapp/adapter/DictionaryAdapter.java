package com.lovecoding.recyclerviewdemoapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lovecoding.recyclerviewdemoapp.R;
import com.lovecoding.recyclerviewdemoapp.ViewHolderOnClickListenner;
import com.lovecoding.recyclerviewdemoapp.model.DictionaryItem;

import java.util.ArrayList;

/**
 * Created by ouentheara on 10/21/2016 AD.
 */

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.MyViewHolder> {
    ArrayList<DictionaryItem> listWord;
    ViewHolderOnClickListenner holderOnClickListenner;

    public void setHolderOnClickListenner(ViewHolderOnClickListenner holderOnClickListenner) {
        this.holderOnClickListenner = holderOnClickListenner;
    }

    public DictionaryAdapter(ArrayList<DictionaryItem> listWord) {
        this.listWord = listWord;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View wordView = inflater.inflate(R.layout.item_dictionary, parent, false);
        return new MyViewHolder(wordView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DictionaryItem dictionaryItem = listWord.get(position);
        holder.tvWord.setText(dictionaryItem.getWord());
    }

    @Override
    public int getItemCount() {
        return listWord.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvWord, tvDifinition;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvWord = (TextView) itemView.findViewById(R.id.tvWord);
//            tvWord= (TextView) itemView.findViewById(R.id.rcvDictionary);
            tvWord.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();
                    Log.d("Click ", "Data :" + position);
                    holderOnClickListenner.onTextClickItem(position);
                }
            });
        }
    }
}
