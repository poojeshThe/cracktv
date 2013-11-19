package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class bd
  implements as
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("string");
    String str2 = (String)paramHashMap.get("afma_notify_dt");
    d.c("Received log message: <\"string\": \"" + str1 + "\", \"afmaNotifyDt\": \"" + str2 + "\">");
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bd
 * JD-Core Version:    0.7.0.1
 */