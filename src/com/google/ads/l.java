package com.google.ads;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.c;
import com.google.ads.internal.p;
import com.google.ads.util.AdUtil;
import com.google.ads.util.d;
import com.google.ads.util.m;
import java.util.HashMap;

public class l
  implements as
{
  private static final c a = (c)c.a.b();
  
  protected int a(HashMap paramHashMap, String paramString, int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    String str = (String)paramHashMap.get(paramString);
    if (str != null) {}
    try
    {
      f = TypedValue.applyDimension(1, Integer.parseInt(str), paramDisplayMetrics);
      paramInt = (int)f;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        float f;
        d.a("Could not parse \"" + paramString + "\" in a video gmsg: " + f);
      }
    }
    return paramInt;
  }
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str2 = (String)paramHashMap.get("action");
    if (str2 == null) {
      d.a("No \"action\" parameter in a video gmsg.");
    }
    for (;;)
    {
      return;
      AdActivity localAdActivity;
      if ((paramWebView instanceof AdWebView))
      {
        AdWebView localAdWebView = (AdWebView)paramWebView;
        localAdActivity = localAdWebView.d();
        if (localAdActivity == null) {
          d.a("Could not get adActivity for a video gmsg.");
        }
      }
      else
      {
        d.a("Could not get adWebView for a video gmsg.");
        continue;
      }
      boolean bool1 = str2.equals("new");
      boolean bool2 = str2.equals("position");
      int m;
      int j;
      int k;
      if ((bool1) || (bool2))
      {
        DisplayMetrics localDisplayMetrics2 = AdUtil.a(localAdActivity);
        m = a(paramHashMap, "x", 0, localDisplayMetrics2);
        j = a(paramHashMap, "y", 0, localDisplayMetrics2);
        k = a(paramHashMap, "w", -1, localDisplayMetrics2);
        int n = a(paramHashMap, "h", -1, localDisplayMetrics2);
        if ((bool1) && (localAdActivity.a() == null)) {
          localAdActivity.b(m, j, k, n);
        } else {
          localAdActivity.a(m, j, k, n);
        }
      }
      else
      {
        AdVideoView localAdVideoView = localAdActivity.a();
        if (localAdVideoView == null)
        {
          a.a(j, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
        }
        else if (k.equals("click"))
        {
          DisplayMetrics localDisplayMetrics1 = AdUtil.a(localAdActivity);
          int i = a(paramHashMap, "x", 0, localDisplayMetrics1);
          m = a(paramHashMap, "y", 0, localDisplayMetrics1);
          long l = SystemClock.uptimeMillis();
          localAdVideoView.a(MotionEvent.obtain(l, l, 0, i, m, 0));
        }
        else
        {
          String str1;
          if (k.equals("controls"))
          {
            str1 = (String)paramHashMap.get("enabled");
            if (str1 == null) {
              d.a("No \"enabled\" parameter in a controls video gmsg.");
            } else if (str1.equals("true")) {
              localAdVideoView.setMediaControllerEnabled(true);
            } else {
              localAdVideoView.setMediaControllerEnabled(false);
            }
          }
          else if (k.equals("currentTime"))
          {
            str1 = (String)paramHashMap.get("time");
            if (str1 == null) {
              d.a("No \"time\" parameter in a currentTime video gmsg.");
            } else {
              try
              {
                localAdVideoView.a((int)(1000.0F * Float.parseFloat(str1)));
              }
              catch (NumberFormatException localNumberFormatException)
              {
                d.a("Could not parse \"time\" parameter: " + str1);
              }
            }
          }
          else if (k.equals("hide"))
          {
            localAdVideoView.setVisibility(4);
          }
          else if (k.equals("load"))
          {
            localAdVideoView.b();
          }
          else if (k.equals("pause"))
          {
            localAdVideoView.c();
          }
          else if (k.equals("play"))
          {
            localAdVideoView.d();
          }
          else if (k.equals("show"))
          {
            localAdVideoView.setVisibility(0);
          }
          else if (k.equals("src"))
          {
            localAdVideoView.setSrc((String)paramHashMap.get("src"));
          }
          else
          {
            d.a("Unknown video action: " + k);
          }
        }
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.l
 * JD-Core Version:    0.7.0.1
 */