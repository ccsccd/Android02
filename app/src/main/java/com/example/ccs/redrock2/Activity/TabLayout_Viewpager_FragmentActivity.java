package com.example.ccs.redrock2.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.ccs.redrock2.Adapter.FragmentAdapter;
import com.example.ccs.redrock2.Fragment.ImageFragment;
import com.example.ccs.redrock2.R;
import java.util.ArrayList;

public class TabLayout_Viewpager_FragmentActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<ImageFragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout__viewpager__fragment_layout);
        setBacker();
        init();
    }

    public void setBacker(){
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void init() {
        tabLayout =findViewById(R.id.tab_layout);
        viewPager =findViewById(R.id.view_pager);

        for (int i = 0; i < 30; i++) {
            titles.add("第"+(i+1)+"个");
            ImageFragment fragment = new ImageFragment();
            int[] imageIds = {R.drawable.img};
            fragment.setData(imageIds[0],"我是第"+(i+1)+"个Fragment");
            fragments.add(fragment);
        }
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab)  {
                Toast.makeText(TabLayout_Viewpager_FragmentActivity.this,"你切换到了"+tab.getText().toString()+"页面",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        }
    }

