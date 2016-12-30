package cn.edu.buaa.david.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

import cn.edu.buaa.david.myviewpager.MyViewPager;
import cn.edu.buaa.david.myviewpager.MyViewPagerAdapter;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyViewPager myViewPager = (MyViewPager) findViewById(R.id.myviewpager);
        LayoutInflater myLayoutInflater = getLayoutInflater();
        ArrayList<View> ViewList = new ArrayList<View>();
//        ViewList.add(myLayoutInflater.inflate(R.drawable.shape_dot_gray, null));
//        ViewList.add();
//        ViewList.add();
        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(ViewList);
    }
}
