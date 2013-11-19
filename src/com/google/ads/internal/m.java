package com.google.ads.internal;

import android.webkit.WebView;

class m
  implements Runnable
{
  private final String b;
  private final String c;
  private final WebView d;
  
  public m(h paramh, WebView paramWebView, String paramString1, String paramString2)
  {
    this.d = paramWebView;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public void run()
  {
    if (this.c == null) {
      this.d.loadUrl(this.b);
    } else {
      this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.m
 * JD-Core Version:    0.7.0.1
 */