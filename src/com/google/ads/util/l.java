package com.google.ads.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.DisplayMetrics;

public final class l
{
  private static int a(Context paramContext, float paramFloat, int paramInt)
  {
    if ((0x2000 & paramContext.getApplicationInfo().flags) != 0) {
      paramInt = (int)(paramInt / paramFloat);
    }
    return paramInt;
  }
  
  public static int a(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.heightPixels);
  }
  
  public static int b(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.widthPixels);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.l
 * JD-Core Version:    0.7.0.1
 */