package com.gmail.caounn.commons.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public class SystemUtils {

  /**
   * app version name
   */
  public static String getAppVersionName(Context context) {
    try {
      PackageInfo packageInfo =
          context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
      return packageInfo.versionName;
    } catch (PackageManager.NameNotFoundException e) {
      return "未知版本";
    }
  }

  /**
   * 安卓版本
   */
  public static String getSystemVersion() {
    return Build.VERSION.RELEASE;
  }

  /**
   * 设备名
   */
  public static String getOsName() {
    return Build.MODEL;
  }
}
