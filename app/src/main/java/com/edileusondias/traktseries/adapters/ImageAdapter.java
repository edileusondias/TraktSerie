package com.edileusondias.traktseries.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.edileusondias.traktseries.MainActivity;
import com.edileusondias.traktseries.R;
import com.edileusondias.traktseries.model.Series;

/**
 * Created by Eddy on 2/26/2016.
 */
public class ImageAdapter extends BaseAdapter {
    Series[] series;
    private Context context;
    private static LayoutInflater inflater=null;

    public ImageAdapter(MainActivity mainActivity, Series[] paramSeries) {
        context = mainActivity;
        series = paramSeries;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return series.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        GridAdapter rowGrid = new GridAdapter();
        View rowView;

        rowView = inflater.inflate(R.layout.gridlayout, null);
        rowGrid.setDescricao((TextView) rowView.findViewById(R.id.textView1));
        rowGrid.setImagem((ImageView) rowView.findViewById(R.id.imageView1));

        rowGrid.getDescricao().setText(series[position].getTitle());
        Glide.with(context).load(series[position].getImages().getPoster().getThumb()).thumbnail(0.1f).into(rowGrid.getImagem());

        return rowView;
    }
}
