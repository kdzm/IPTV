package com.iptv.hn.app;

import android.app.Application;

import com.iptv.hn.dao.GreenDaoManager;

/**
 * Created by hs on 18/5/30.
 */

public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
        GreenDaoManager.getInstance();
    }

    //获取到主线程的上下文
    private static BaseApplication mContext;


    public static BaseApplication getmContext() {
        if (null == mContext) {
            mContext = new BaseApplication();
        }
        return mContext;
    }

}