package com.google.ads;

import android.content.Context;
import android.webkit.WebView;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class az
  implements as
{
  protected Runnable a(String paramString, WebView paramWebView)
  {
    return new m(paramString, paramWebView.getContext().getApplicationContext());
  }
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (str != null) {
      new Thread(a(str, paramWebView)).start();
    } else {
      d.e("Could not get URL from click gmsg.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.az
 * JD-Core Version:    0.7.0.1
 */