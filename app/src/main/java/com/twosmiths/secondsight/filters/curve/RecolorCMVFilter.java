package com.twosmiths.secondsight.filters.curve;

import com.twosmiths.secondsight.filters.Filter;

import org.opencv.core.Core;
import org.opencv.core.Mat;

import java.util.ArrayList;

/**
 * Created by Mattsmith on 1/5/15.
 */
public class RecolorCMVFilter implements Filter {

    private final ArrayList<Mat> mChannels = new ArrayList<Mat>(4);

    @Override
    public void apply(Mat src, Mat dst) {
        Core.split(src, mChannels);

        final Mat r = mChannels.get(0);
        final Mat g = mChannels.get(1);
        final Mat b = mChannels.get(2);

        // dst.b = max(dst.r, dst.g, dst.b)
        Core.max(b, r, b);
        Core.max(b, g, b);

        Core.merge(mChannels, dst);
    }
}
