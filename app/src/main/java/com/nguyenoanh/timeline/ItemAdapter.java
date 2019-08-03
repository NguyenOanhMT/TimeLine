package com.nguyenoanh.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private static final int TYPE_THREE = 3;

    private Context context;
    private ArrayList<Item> itemList;

    public ItemAdapter(ArrayList<Item> itemList,Context context) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getItemViewType(int i) {
        Item item = itemList.get(i);
        if (item.getItemType() == Item.ItemType.ONE_ITEM) {
            return TYPE_ONE;
        } else if (item.getItemType() == Item.ItemType.TWO_ITEM) {
            return TYPE_TWO;
        } else if (item.getItemType() == Item.ItemType.THREE_ITEM) {
            return TYPE_THREE;
        } else{
            return -1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        if (viewType == TYPE_ONE) {
            View view = inflater.inflate(R.layout.item_image, null);
            return new ViewHolderOne(view);
        } else if (viewType == TYPE_TWO) {
            View view =  inflater.inflate(R.layout.item_cmt, null);
            return new ViewHolderTwo(view);
        } else if (viewType == TYPE_THREE) {
            View view = inflater.inflate(R.layout.item_connect, null);
            return new ViewHolderThree(view);
        } else {
            throw new RuntimeException("Exception");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        switch (holder.getItemViewType()) {
            case TYPE_ONE:
                initLayoutOne((ViewHolderOne)holder, i);
                break;
            case TYPE_TWO:
                initLayoutTwo((ViewHolderTwo) holder, i);
                break;
            case TYPE_THREE:
                initLayoutThree((ViewHolderThree)holder, i);
                break;
            default:
                break;
        }
    }

    //type one
    private void initLayoutOne(ViewHolderOne holder, int i) {
        Item item = itemList.get(i);

        holder.name.setText(item.getName ());
        holder.time.setText(item.getTime ());

        holder.numberHeart.setText(item.getNumberHeart ());
        holder.numberMessage.setText(item.getNumberMess ());

        holder.viewTop.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorTop()));
        holder.viewBottom.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorBottom ()));
        holder.viewRound.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorRound ()));

        holder.image.setImageDrawable(context.getResources().getDrawable(item.getImageView()));
        holder.imageAvatar.setImageDrawable(context.getResources().getDrawable(item.getAvatar ()));
    }

    static class ViewHolderOne extends RecyclerView.ViewHolder {
        public TextView name, time, numberHeart, numberMessage;

        ImageView viewTop, viewBottom, viewRound;

        ImageView imageAvatar;
        ImageView image;

        public ViewHolderOne(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            time = (TextView) itemView.findViewById(R.id.tv_time);

            numberHeart = (TextView) itemView.findViewById (R.id.tv_number_heart) ;
            numberMessage = (TextView) itemView.findViewById (R.id.tv_number_message);

            viewTop = (ImageView) itemView.findViewById (R.id.line_top) ;
            viewBottom = (ImageView) itemView.findViewById (R.id.line_bottom) ;
            viewRound = (ImageView) itemView.findViewById (R.id.imv_time_line) ;

            imageAvatar = (ImageView) itemView.findViewById(R.id.imv_avatar);
            image = (ImageView) itemView.findViewById(R.id.image_view);
        }
    }

    //type two
    private void initLayoutTwo(ViewHolderTwo holder, int i) {
        Item item = itemList.get(i);

        holder.name.setText(item.getName ());
        holder.time.setText(item.getTime ());
        holder.content.setText(item.getContent ());

        holder.numberHeart.setText (item.getNumberHeart ());
        holder.numberMessage.setText (item.getNumberMess ());

        holder.viewTop.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorTop()));
        holder.viewBottom.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorBottom ()));
        holder.viewRound.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorRound ()));

        holder.imageAvatar.setImageDrawable(context.getResources().getDrawable(item.getAvatar ()));
    }

    static class ViewHolderTwo extends RecyclerView.ViewHolder {
        public TextView name, time, numberHeart, numberMessage, content;

        ImageView viewTop, viewBottom, viewRound;

        ImageView imageAvatar;

        public ViewHolderTwo(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            time = (TextView) itemView.findViewById(R.id.tv_time);
            content = (TextView) itemView.findViewById(R.id.tv_content);

            numberHeart = (TextView) itemView.findViewById (R.id.tv_number_heart) ;
            numberMessage = (TextView) itemView.findViewById (R.id.tv_number_message);

            viewTop = (ImageView) itemView.findViewById (R.id.line_top) ;
            viewBottom = (ImageView) itemView.findViewById (R.id.line_bottom) ;
            viewRound = (ImageView) itemView.findViewById (R.id.imv_time_line) ;

            imageAvatar = (ImageView) itemView.findViewById(R.id.imv_avatar);

        }
    }

    //type three
    private void initLayoutThree(ViewHolderThree holder, int i) {
        Item item = itemList.get(i);

        holder.name.setText(item.getName ());
        holder.time.setText(item.getTime ());
        holder.content.setText(item.getContent ());

        holder.viewTop.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorTop()));
        holder.viewBottom.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorBottom ()));
        holder.viewRound.setImageDrawable(context.getResources().getDrawable(item.getItemLines ().getColorRound ()));

        holder.imageAvatar.setImageDrawable(context.getResources().getDrawable(item.getAvatar ()));
    }

    static class ViewHolderThree extends RecyclerView.ViewHolder {
        public TextView name, time, content;

        ImageView viewTop, viewBottom, viewRound;

        ImageView imageAvatar;
        public ViewHolderThree(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            time = (TextView) itemView.findViewById(R.id.tv_time);
            content = (TextView) itemView.findViewById(R.id.tv_content);

            viewTop = (ImageView) itemView.findViewById (R.id.line_top) ;
            viewBottom = (ImageView) itemView.findViewById (R.id.line_bottom) ;
            viewRound = (ImageView) itemView.findViewById (R.id.imv_time_line) ;

            imageAvatar = (ImageView) itemView.findViewById(R.id.imv_avatar);
        }
    }

    @Override
    public int getItemCount() {
        return itemList==null ? 0 : itemList.size();
    }
}
