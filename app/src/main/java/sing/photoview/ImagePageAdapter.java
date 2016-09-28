package sing.photoview;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;


import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;


public class ImagePageAdapter extends PagerAdapter {

    private int screenWidth;
    private int screenHeight;
    private ArrayList<String> images = new ArrayList<>();
    private Activity mActivity;

    public ImagePageAdapter(Activity activity, ArrayList<String> images) {
        this.mActivity = activity;
        this.images = images;

        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        screenWidth = dm.widthPixels;
        screenHeight = dm.heightPixels;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        PhotoView photoView = new PhotoView(mActivity);
        UILImageLoader.displayImage(mActivity, images.get(position), photoView, screenWidth, screenHeight);
        container.addView(photoView);
        return photoView;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
