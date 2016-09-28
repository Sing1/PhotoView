package sing.photoview;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import sing.util.LogUtil;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogUtil.init(true,"photoview");
        ImageLoaderConfiguration config = ImageLoaderConfiguration.createDefault(this);
        ImageLoader.getInstance().init(config);     //UniversalImageLoader初始化
    }
}
