package com.example.administrator.scrollview_recyclerview;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class Adapter extends BaseQuickAdapter<Data, BaseViewHolder> {

    public Adapter(List<Data> data) {
        super(R.layout.item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Data item) {
        helper.addOnClickListener(R.id.linear);
        helper.setText(R.id.lala,item.getText());
    }
}
