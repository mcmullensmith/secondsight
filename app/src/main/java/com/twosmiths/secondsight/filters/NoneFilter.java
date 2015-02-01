package com.twosmiths.secondsight.filters;

import org.opencv.core.Mat;

/**
 * Created by Mattsmith on 1/5/15.
 */
public class NoneFilter implements Filter {
    @Override
    public void apply(Mat src, Mat dst) {
        //Do nothing
    }
}
