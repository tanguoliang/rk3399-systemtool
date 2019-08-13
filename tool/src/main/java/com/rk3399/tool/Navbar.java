package com.rk3399.tool;

import android.content.Context;
import android.content.Intent;

/**
 *  请使用 Application的context传入，以防activity的内存泄漏
 */
public class Navbar {
    public static void closeBar(Context context){//关闭导航栏
        context.sendBroadcast(new Intent("android.intent.action.HIDE_NAVIGATION_BAR"));
    }

    public static void showBar(Context context){//显示导航栏
        context.sendBroadcast(new Intent("android.intent.action.SHOW_NAVIGATION_BAR"));
    }
}
