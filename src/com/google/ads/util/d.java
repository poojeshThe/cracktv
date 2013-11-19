package com.google.ads.util;

import android.util.Log;

public final class d
{
  public static f a = null;
  private static int b = 5;
  
  private static void a(e parame, String paramString)
  {
    a(parame, paramString, null);
  }
  
  private static void a(e parame, String paramString, Throwable paramThrowable)
  {
    if (a != null) {
      a.a(parame, paramString, paramThrowable);
    }
  }
  
  public static void a(String paramString)
  {
    if (a("Ads", 3)) {
      Log.d("Ads", paramString);
    }
    a(e.b, paramString);
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 3)) {
      Log.d("Ads", paramString, paramThrowable);
    }
    a(e.b, paramString, paramThrowable);
  }
  
  private static boolean a(int paramInt)
  {
    boolean bool;
    if (paramInt < b) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    boolean bool;
    if ((!a(paramInt)) && (!Log.isLoggable(paramString, paramInt))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void b(String paramString)
  {
    if (a("Ads", 6)) {
      Log.e("Ads", paramString);
    }
    a(e.e, paramString);
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
    a(e.e, paramString, paramThrowable);
  }
  
  public static void c(String paramString)
  {
    if (a("Ads", 4)) {
      Log.i("Ads", paramString);
    }
    a(e.c, paramString);
  }
  
  public static void c(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 4)) {
      Log.i("Ads", paramString, paramThrowable);
    }
    a(e.c, paramString, paramThrowable);
  }
  
  public static void d(String paramString)
  {
    if (a("Ads", 2)) {
      Log.v("Ads", paramString);
    }
    a(e.a, paramString);
  }
  
  public static void d(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
    a(e.d, paramString, paramThrowable);
  }
  
  public static void e(String paramString)
  {
    if (a("Ads", 5)) {
      Log.w("Ads", paramString);
    }
    a(e.d, paramString);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.d
 * JD-Core Version:    0.7.0.1
 */