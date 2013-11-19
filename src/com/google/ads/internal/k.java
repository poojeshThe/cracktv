package com.google.ads.internal;

import android.webkit.WebView;
import com.google.ads.e;

class k
  implements Runnable
{
  private final p a;
  private final WebView b;
  private final r c;
  private final e d;
  private final boolean e;
  
  public k(p paramp, WebView paramWebView, r paramr, e parame, boolean paramBoolean)
  {
    this.a = paramp;
    this.b = paramWebView;
    this.c = paramr;
    this.d = parame;
    this.e = paramBoolean;
  }
  
  public void run()
  {
    if (this.b != null)
    {
      this.b.stopLoading();
      this.b.destroy();
    }
    if (this.c != null) {
      this.c.a();
    }
    if (this.e)
    {
      AdWebView localAdWebView = this.a.j();
      localAdWebView.stopLoading();
      localAdWebView.setVisibility(8);
    }
    this.a.a(this.d);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.k
 * JD-Core Version:    0.7.0.1
 */