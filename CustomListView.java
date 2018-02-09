package com.drug;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class CustomListView extends ArrayAdapter<String> {

    private class MyViewHolder  {

        MyViewHolder(View v){
            @Override
            Intent intent=new Intent(MainActivity.this,FirstCamera.class);

            intent.putExtra("drugs",e1.getText().toString());
            intent.putExtra("amount",e2.getText().toString());
            CustomListView(intent);

        }

    }

        Button button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View ) {
            Intent intent = new Intent(CustomListView, second.class);
            startActivity(intent);
        }
    });

    private String[] fruitname;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context, String[] fruitname, String[] desc, Integer[] imgid){
        super(context, R.layout.layout, fruitname);

        this.context=context;
        this.fruitname=fruitname;
        this.desc=desc;
        this.imgid=imgid;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        MyViewHolder viewHolder = null;
        if(r==null) {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.layout, parent,false);
            viewHolder = new MyViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) r.getTag();

        }

        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(fruitname[position]);
        viewHolder.tvw2.setText(desc[position]);

        return r;
    }

}

























