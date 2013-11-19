package com.google.ads.internal;

import android.webkit.WebView;
import com.google.ads.ar;
import com.google.ads.g;
import com.google.ads.util.ac;
import java.util.LinkedList;

class o
  implements Runnable
{
  private final p a;
  private final WebView b;
  private final LinkedList c;
  private final int d;
  private final boolean e;
  private final String f;
  private final g g;
  
  public o(p paramp, WebView paramWebView, LinkedList paramLinkedList, int paramInt, boolean paramBoolean, String paramString, g paramg)
  {
    this.a = paramp;
    this.b = paramWebView;
    this.c = paramLinkedList;
    this.d = paramInt;
    this.e = paramBoolean;
    this.f = paramString;
    this.g = paramg;
  }
  
  public void run()
  {
    if (this.b != null)
    {
      this.b.stopLoading();
      this.b.destroy();
    }
    this.a.a(this.c);
    this.a.a(this.d);
    this.a.a(this.e);
    this.a.a(this.f);
    if (this.g != null)
    {
      ((v)this.a.g().k.a()).b(this.g);
      this.a.j().setAdSize(this.g);
    }
    this.a.y();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.o
 * JD-Core Version:    0.7.0.1
 */