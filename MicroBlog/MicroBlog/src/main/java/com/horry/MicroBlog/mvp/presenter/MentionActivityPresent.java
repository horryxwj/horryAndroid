package com.horry.MicroBlog.mvp.presenter;

import android.content.Context;

/**
 * Created by wenmingvs on 16/5/15.
 */
public interface MentionActivityPresent {
    public void pullToRefreshData(int groupId, Context context);

    public void requestMoreData(int groupId, Context context);
}
