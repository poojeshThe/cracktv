package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.util.m;
import java.util.Date;
import java.util.Locale;

public final class p
{
  private static final c a = (c)c.a.b();
  
  public static void a(Activity paramActivity)
  {
    new Thread(new q(paramActivity)).start();
  }
  
  public static void a(Activity paramActivity, WebView paramWebView, String paramString)
  {
    new Thread(new r(paramActivity, paramWebView, paramString)).start();
  }
  
  public static void a(WebView paramWebView, String paramString)
  {
    c localc = a;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    localc.a(paramWebView, String.format(localLocale, "(G_resizeIframe(%s))", arrayOfObject));
  }
  
  public static void a(WebView paramWebView, boolean paramBoolean)
  {
    c localc = a;
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    localc.a(paramWebView, String.format(localLocale, "(G_updatePlusOne(%b))", arrayOfObject));
  }
  
  public static boolean a(Context paramContext, long paramLong)
  {
    return a(paramContext, paramLong, PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()));
  }
  
  static boolean a(Context paramContext, long paramLong, SharedPreferences paramSharedPreferences)
  {
    boolean bool;
    if ((!t.a(paramContext)) || ((paramSharedPreferences.contains("drt")) && (paramSharedPreferences.contains("drt_ts")) && (paramSharedPreferences.getLong("drt_ts", 0L) >= new Date().getTime() - paramLong))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.p
 * JD-Core Version:    0.7.0.1
 */