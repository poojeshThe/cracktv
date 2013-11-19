package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class aw
  implements as
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    if (!(paramWebView instanceof AdWebView)) {
      d.b("Trying to close WebView that isn't an AdWebView");
    } else {
      ((AdWebView)paramWebView).a();
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.aw
 * JD-Core Version:    0.7.0.1
 */