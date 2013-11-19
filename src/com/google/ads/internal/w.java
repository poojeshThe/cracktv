package com.google.ads.internal;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.util.AdUtil;
import com.google.ads.util.d;
import com.google.ads.util.m;
import java.util.HashMap;
import java.util.Map;

public class w
  extends WebViewClient
{
  private static final c c = (c)c.a.b();
  protected p a;
  protected boolean b;
  private final Map d;
  private final boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  
  public w(p paramp, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramp;
    this.d = paramMap;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.b = false;
    this.g = false;
    this.h = false;
  }
  
  public static w a(p paramp, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject;
    if (AdUtil.a < 11) {
      localObject = new w(paramp, paramMap, paramBoolean1, paramBoolean2);
    } else {
      localObject = new com.google.ads.util.w(paramp, paramMap, paramBoolean1, paramBoolean2);
    }
    return localObject;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void d(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.g)
    {
      h localh = this.a.i();
      if (localh == null) {
        d.a("adLoader was null while trying to setFinishedLoadingHtml().");
      } else {
        localh.b();
      }
      this.g = false;
    }
    if (this.h)
    {
      c.a(paramWebView);
      this.h = false;
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    try
    {
      d.a("shouldOverrideUrlLoading(\"" + paramString + "\")");
      Object localObject = Uri.parse(paramString);
      if (c.a((Uri)localObject)) {
        c.a(this.a, this.d, (Uri)localObject, paramWebView);
      } else if (this.f) {
        if (AdUtil.a((Uri)localObject))
        {
          bool = super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
        else
        {
          localObject = new HashMap();
          ((HashMap)localObject).put("u", paramString);
          AdActivity.a(this.a, new q("intent", (HashMap)localObject));
        }
      }
    }
    catch (Throwable localThrowable)
    {
      d.b("An unknown error occurred in shouldOverrideUrlLoading.", localThrowable);
    }
    if (this.e)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("u", localThrowable.toString());
      AdActivity.a(this.a, new q("intent", localHashMap));
    }
    else
    {
      d.e("URL is not a GMSG and can't handle URL: " + paramString);
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.w
 * JD-Core Version:    0.7.0.1
 */