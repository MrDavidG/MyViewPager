package cn.edu.buaa.david.myviewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by david on 2016/12/29.
 */

public class MyViewPagerAdapter extends PagerAdapter {
    //save the list of views
    ArrayList<View> mViewList = new ArrayList<View>();

    public MyViewPagerAdapter(ArrayList<View> ViewList) {
        mViewList = ViewList;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mViewList.size();
    }

    /**
     * Determines whether a page View is associated with a specific key object
     * as returned by {@link #instantiateItem(ViewGroup, int)}. This method is
     * required for a PagerAdapter to function properly.
     *
     * @param view   Page View to check for association with <code>object</code>
     * @param object Object to check for association with <code>view</code>
     * @return true if <code>view</code> is associated with the key object <code>object</code>
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }
}
