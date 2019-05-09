package com.example.administrator.scrollview_recyclerview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Data> number = new ArrayList<>();
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        recyclerView  = findViewById(R.id.setting_info_rlv);
        String haha = "hahaha";
        for (int i=0;i<30;i++){
            Data data = new Data("haha"+i);
            number.add(data);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(number);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
                final String[] item = {"修改","删除","分配权限", "分配用户"};


                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("请选择");

                builder.setItems(item, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(item[which].equals("分配权限")){



                        }else if(item[which].equals("分配用户")){

                        }else if(item[which].equals("删除")){
                            String name ="Group/del";


                        }else if(item[which].equals("修改")){





                        }

                    }

                });
                builder.setNegativeButton("取消", null);
                builder.show();

                return false;
            }
        });
       // recyclerView.setNestedScrollingEnabled(false);


        editText = findViewById(R.id.edit);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TiaoZhuan.class);
                startActivity(intent);
            }
        });
    }
}
