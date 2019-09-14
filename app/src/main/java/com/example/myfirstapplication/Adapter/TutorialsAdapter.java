package com.example.myfirstapplication.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapplication.R;
import com.example.myfirstapplication.bean.TutorialItem;

import java.util.List;

public class TutorialsAdapter extends RecyclerView.Adapter<TutorialsAdapter.ViewHolder> {

    private Context mContext;
    private int mResourceId;
    private List<TutorialItem> mItemList;

    public TutorialsAdapter(Context context, int resource, List<TutorialItem> itemList){
        this.mContext = context;
        this.mResourceId = resource;
        this.mItemList = itemList;
    }

    public TutorialsAdapter(){}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(mResourceId,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TutorialItem tutorialItem = mItemList.get(position);
        holder.mIvTutoial.setImageResource(tutorialItem.getmTutorialPicUrl());
        holder.mTvTutoial.setText(tutorialItem.getmTutorialIntro());
        //holder.mTxtVTutorial.setBackgroundDrawable(tutorialItem.getmTutorialVideo());

    }

    @Override
    public int getItemCount() {
        return mItemList.isEmpty() ? 0 : mItemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mIvTutoial;
        TextureView mTxtVTutorial;
        TextView mTvTutoial;
        View itemView;

        public ViewHolder(View view){
            super(view);
            this.itemView = view;
            mIvTutoial = (ImageView) view.findViewById(R.id.iv_tutorial_image);
            mTxtVTutorial = (TextureView) view.findViewById(R.id.txtv_tutorial_video);
            mTvTutoial = (TextView) view.findViewById(R.id.tv_tutorials_title);
        }

   }
}
