package sing.photoview;

import android.app.Activity;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.assist.ImageSize;

public class UILImageLoader {

    public static void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        ImageSize size = new ImageSize(width, height);
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(path, imageView, size);
    }

}
