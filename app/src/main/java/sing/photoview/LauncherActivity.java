package sing.photoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class LauncherActivity extends AppCompatActivity {

    protected ArrayList<String> mImageItems;
    protected MyViewPager mViewPager;
    protected ImagePageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(sing.photoview.demo.R.layout.activity_launcher);

        mImageItems = new ArrayList<>();
        mImageItems.add("drawable://"+sing.photoview.demo.R.drawable.wallpaper);
        mImageItems.add("http://img4.imgtn.bdimg.com/it/u=479544142,1232765232&fm=21&gp=0.jpg");
        mImageItems.add("drawable://"+sing.photoview.demo.R.drawable.wallpaper);
        mImageItems.add("http://img4.imgtn.bdimg.com/it/u=479544142,1232765232&fm=21&gp=0.jpg");


        mViewPager = (MyViewPager) findViewById(sing.photoview.demo.R.id.viewpager);
        mAdapter = new ImagePageAdapter(this, mImageItems);

        mViewPager.setAdapter(mAdapter);
        mViewPager.setCurrentItem(0, false);
    }
}