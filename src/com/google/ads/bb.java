package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.h;
import com.google.ads.internal.n;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class bb
  implements as
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("url");
    Object localObject1 = (String)paramHashMap.get("type");
    String str2 = (String)paramHashMap.get("afma_notify_dt");
    boolean bool1 = "1".equals(paramHashMap.get("drt_include"));
    Object localObject2 = (String)paramHashMap.get("request_scenario");
    boolean bool2 = "1".equals(paramHashMap.get("use_webview_loadurl"));
    if (!n.d.e.equals(localObject2))
    {
      if (!n.c.e.equals(localObject2))
      {
        if (!n.a.e.equals(localObject2)) {
          localObject2 = n.b;
        } else {
          localObject2 = n.a;
        }
      }
      else {
        localObject2 = n.c;
      }
    }
    else {
      localObject2 = n.d;
    }
    d.c("Received ad url: <url: \"" + str1 + "\" type: \"" + (String)localObject1 + "\" afmaNotifyDt: \"" + str2 + "\" useWebViewLoadUrl: \"" + bool2 + "\">");
    localObject1 = paramp.i();
    if (localObject1 != null)
    {
      ((h)localObject1).c(bool1);
      ((h)localObject1).a((n)localObject2);
      ((h)localObject1).d(bool2);
      ((h)localObject1).d(str1);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bb
 * JD-Core Version:    0.7.0.1
 */