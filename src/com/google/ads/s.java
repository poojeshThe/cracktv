package com.google.ads;

import android.webkit.WebView;

class s
  implements Runnable
{
  private final boolean a;
  private final WebView b;
  
  public s(WebView paramWebView, boolean paramBoolean)
  {
    this.b = paramWebView;
    this.a = paramBoolean;
  }
  
  public void run()
  {
    p.a(this.b, this.a);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.s
 * JD-Core Version:    0.7.0.1
 */