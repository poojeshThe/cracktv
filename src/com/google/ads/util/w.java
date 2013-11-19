package com.google.ads.util;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.ads.ap;
import com.google.ads.aq;
import com.google.ads.ar;
import com.google.ads.internal.h;
import com.google.ads.internal.p;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class w
  extends com.google.ads.internal.w
{
  public w(p paramp, Map paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramp, paramMap, paramBoolean1, paramBoolean2);
  }
  
  private static WebResourceResponse a(String paramString, Context paramContext)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    try
    {
      AdUtil.a(localHttpURLConnection, paramContext.getApplicationContext());
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(AdUtil.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if ("mraid.js".equalsIgnoreCase(new File(paramString).getName()))
      {
        Object localObject1 = this.a.i();
        if (localObject1 != null) {
          ((h)localObject1).b(true);
        }
        for (;;)
        {
          localObject1 = (aq)((ap)this.a.g().a.a()).a.a();
          if (this.a.g().b()) {
            break label210;
          }
          if (!this.b) {
            break;
          }
          localObject1 = (String)((aq)localObject1).d.a();
          d.a("shouldInterceptRequest(" + (String)localObject1 + ")");
          return a((String)localObject1, paramWebView.getContext());
          this.a.a(true);
        }
      }
      Object localObject2;
      label210:
      return localThrowable;
    }
    catch (IOException localIOException)
    {
      d.d("IOException fetching MRAID JS.", localIOException);
      return super.shouldInterceptRequest(paramWebView, paramString);
      localObject2 = (String)((aq)localObject2).c.a();
      d.a("shouldInterceptRequest(" + (String)localObject2 + ")");
      return a((String)localObject2, paramWebView.getContext());
      localObject2 = (String)((aq)localObject2).e.a();
      d.a("shouldInterceptRequest(" + (String)localObject2 + ")");
      localObject2 = a((String)localObject2, paramWebView.getContext());
      localObject2 = localObject2;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("An unknown error occurred fetching MRAID JS.", localThrowable);
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.w
 * JD-Core Version:    0.7.0.1
 */