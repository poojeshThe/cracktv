package com.google.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import com.google.ads.util.m;
import java.util.HashMap;

public class au
  implements as
{
  private static final c a = (c)c.a.b();
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    Object localObject1 = (String)paramHashMap.get("urls");
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split(",");
      HashMap localHashMap = new HashMap();
      PackageManager localPackageManager = paramWebView.getContext().getPackageManager();
      int j = localObject1.length;
      for (int i = 0;; i++)
      {
        if (i >= j)
        {
          a.a(paramWebView, localHashMap);
          break;
        }
        Object localObject2 = localObject1[i];
        Object localObject3 = localObject2.split(";", 2);
        String str = localObject3[0];
        if (localObject3.length < 2) {
          localObject3 = "android.intent.action.VIEW";
        } else {
          localObject3 = localObject3[1];
        }
        boolean bool;
        if (localPackageManager.resolveActivity(new Intent((String)localObject3, Uri.parse(str)), 65536) == null) {
          bool = false;
        } else {
          bool = true;
        }
        localHashMap.put(localObject2, Boolean.valueOf(bool));
      }
    }
    d.e("Could not get the urls param from canOpenURLs gmsg.");
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.au
 * JD-Core Version:    0.7.0.1
 */