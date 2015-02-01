package com.twosmiths.secondsight.filters;

import org.opencv.core.Mat;

/**
 * Created by Mattsmith on 1/5/15.
 */
public interface Filter {
    public abstract void apply(final Mat src, final Mat dst);
}
