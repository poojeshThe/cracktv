package com.google.ads.internal;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.as;
import com.google.ads.util.AdUtil;
import com.google.ads.util.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
{
  public static final m a = new e();
  public static final Map b = Collections.unmodifiableMap(new f());
  public static final Map c = Collections.unmodifiableMap(new d());
  private static final c d = new c();
  
  public String a(Uri paramUri, HashMap paramHashMap)
  {
    String str2 = null;
    if (!c(paramUri))
    {
      if (!b(paramUri)) {
        com.google.ads.util.d.e("Message was neither a GMSG nor an AMSG.");
      } else {
        str2 = paramUri.getPath();
      }
    }
    else
    {
      String str1 = paramUri.getHost();
      if (str1 != null)
      {
        if (!str1.equals("launch"))
        {
          if (!str1.equals("closecanvas"))
          {
            if (!str1.equals("log")) {
              com.google.ads.util.d.e("An error occurred while parsing the AMSG: " + paramUri.toString());
            } else {
              str2 = "/log";
            }
          }
          else {
            str2 = "/close";
          }
        }
        else
        {
          paramHashMap.put("a", "intent");
          paramHashMap.put("u", paramHashMap.get("url"));
          paramHashMap.remove("url");
          str2 = "/open";
        }
      }
      else {
        com.google.ads.util.d.e("An error occurred while parsing the AMSG parameters.");
      }
    }
    return str2;
  }
  
  public void a(WebView paramWebView)
  {
    a(paramWebView, "onshow", "{'version': 'afma-sdk-a-v6.2.1'}");
  }
  
  public void a(WebView paramWebView, String paramString)
  {
    com.google.ads.util.d.a("Sending JS to a WebView: " + paramString);
    paramWebView.loadUrl("javascript:" + paramString);
  }
  
  public void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "');");
    } else {
      a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "', " + paramString2 + ");");
    }
  }
  
  public void a(WebView paramWebView, Map paramMap)
  {
    a(paramWebView, "openableURLs", new JSONObject(paramMap).toString());
  }
  
  public void a(p paramp, Map paramMap, Uri paramUri, WebView paramWebView)
  {
    HashMap localHashMap = AdUtil.b(paramUri);
    if (localHashMap != null)
    {
      String str = a(paramUri, localHashMap);
      if (str != null)
      {
        as localas = (as)paramMap.get(str);
        if (localas != null) {
          localas.a(paramp, localHashMap, paramWebView);
        } else {
          com.google.ads.util.d.e("No AdResponse found, <message: " + str + ">");
        }
      }
      else
      {
        com.google.ads.util.d.e("An error occurred while parsing the message.");
      }
    }
    else
    {
      com.google.ads.util.d.e("An error occurred while parsing the message parameters.");
    }
  }
  
  public boolean a(Uri paramUri)
  {
    boolean bool = false;
    if ((paramUri != null) && (paramUri.isHierarchical()) && ((b(paramUri)) || (c(paramUri)))) {
      bool = true;
    }
    return bool;
  }
  
  public void b(WebView paramWebView)
  {
    a(paramWebView, "onhide", null);
  }
  
  public boolean b(Uri paramUri)
  {
    boolean bool = false;
    String str = paramUri.getScheme();
    if ((str != null) && (str.equals("gmsg")))
    {
      str = paramUri.getAuthority();
      if ((str != null) && (str.equals("mobileads.google.com"))) {
        bool = true;
      }
    }
    return bool;
  }
  
  public boolean c(Uri paramUri)
  {
    String str = paramUri.getScheme();
    boolean bool;
    if ((str != null) && (str.equals("admob"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.c
 * JD-Core Version:    0.7.0.1
 */