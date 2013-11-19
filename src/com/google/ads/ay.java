package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.c;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import com.google.ads.util.m;
import java.util.HashMap;

public class ay
  implements as
{
  private static final c a = (c)c.a.b();
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("js");
    if (str != null)
    {
      if (!(paramWebView instanceof AdWebView))
      {
        d.b("Trying to evaluate JS in a WebView that isn't an AdWebView");
      }
      else
      {
        Object localObject = ((AdWebView)paramWebView).d();
        if (localObject != null)
        {
          localObject = ((AdActivity)localObject).b();
          if (localObject != null) {
            a.a((WebView)localObject, str);
          } else {
            d.b("Could not get the opening WebView.");
          }
        }
        else
        {
          d.b("Could not get the AdActivity from the AdWebView.");
        }
      }
    }
    else {
      d.b("Could not get the JS to evaluate.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ay
 * JD-Core Version:    0.7.0.1
 */