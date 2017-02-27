package pl.mallorax.mvp_test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<PlaceHolder> list;

    public static class MyHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ImageView imageView;

        public MyHolder(View view){
            super(view);
            textView = (TextView) view.findViewById(R.id.text_view);
            imageView = (ImageView) view.findViewById(R.id.list_item_image);
        }

    }

    public RecyclerAdapter(List<PlaceHolder> list){
        this.list = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
