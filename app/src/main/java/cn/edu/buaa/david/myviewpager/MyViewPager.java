package cn.edu.buaa.david.myviewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

/**
 * Created by david on 2016/12/29.
 */

public class MyViewPager extends ViewPager {
    private Context mContext;

    public MyViewPager(Context context) {
        super(context);
        mContext = context;
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }


}
