package com.example.euler_kalvinhe.myadapter.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.example.euler_kalvinhe.myadapter.R;
import com.example.euler_kalvinhe.myadapter.bean.Bean;
import com.example.euler_kalvinhe.myadapter.utility.CommenAdapter;
import com.example.euler_kalvinhe.myadapter.utility.ViewHolder;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private ListView listView;
    private List<Bean> listData = new ArrayList<Bean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        listView.setAdapter(new CommenAdapter<Bean>(MainActivity.this,listData,R.layout.item) {
            @Override
            public void convert(ViewHolder holder, final Bean bean) {
                ((TextView)holder.getView(R.id.title)).setText(bean.getTitle());
                ((TextView)holder.getView(R.id.desc)).setText(bean.getDesc());
                ((TextView)holder.getView(R.id.time)).setText(bean.getTime());
                ((TextView)holder.getView(R.id.phone)).setText(bean.getPhone());
                final CheckBox checkBox = holder.getView(R.id.checkbox);
                checkBox.setChecked(bean.isChecked());
                checkBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bean.setChecked(checkBox.isChecked());
                    }
                });
            }
        });
    }

    private void initData() {
        Bean bean = new Bean("android新技能","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean);
        Bean bean1 = new Bean("android新技能1","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean1);
        Bean bean2 = new Bean("android新技能2","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean2);
        Bean bean3 = new Bean("android新技能3","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean3);
        Bean bean4 = new Bean("android新技能4","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean4);
        Bean bean5 = new Bean("android新技能5","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean5);
        Bean bean6 = new Bean("android新技能6","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean6);
        Bean bean7 = new Bean("android新技能7","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean7);
        Bean bean8 = new Bean("android新技能8","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean8);
        Bean bean9 = new Bean("android新技能9","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean9);
        Bean bean10 = new Bean("android新技能10","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean10);
        Bean bean11= new Bean("android新技能11","打造万能的adapter和Viewholder","201304","10086");
        listData.add(bean11);

    }

    private void initViews() {

        listView = (ListView) findViewById(R.id.listView);
    }
}
