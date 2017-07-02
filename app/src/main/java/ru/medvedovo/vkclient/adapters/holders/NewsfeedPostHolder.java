package ru.medvedovo.vkclient.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

public class NewsfeedPostHolder extends RecyclerView.ViewHolder {



    public NewsfeedPostHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
