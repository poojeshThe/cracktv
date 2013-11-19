package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.p;
import com.google.ads.internal.v;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ac;
import com.google.ads.util.ad;
import com.google.ads.util.d;
import com.google.ads.util.n;
import java.util.HashMap;

public class bc
  implements as
{
  private void a(HashMap paramHashMap, String paramString, ad paramad)
  {
    try
    {
      String str = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(str)) {
        paramad.a(Integer.valueOf(str));
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        d.a("Could not parse \"" + paramString + "\" constant.");
      }
    }
  }
  
  private void b(HashMap paramHashMap, String paramString, ad paramad)
  {
    try
    {
      String str = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(str)) {
        paramad.a(new Long(str));
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        d.a("Could not parse \"" + paramString + "\" constant.");
      }
    }
  }
  
  private void c(HashMap paramHashMap, String paramString, ad paramad)
  {
    String str = (String)paramHashMap.get(paramString);
    if (!TextUtils.isEmpty(str)) {
      paramad.a(str);
    }
  }
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    ar localar = paramp.g();
    aq localaq = (aq)((ap)localar.a.a()).a.a();
    a(paramHashMap, "min_hwa_banner", localaq.a);
    a(paramHashMap, "min_hwa_overlay", localaq.b);
    c(paramHashMap, "mraid_banner_path", localaq.c);
    c(paramHashMap, "mraid_expanded_banner_path", localaq.d);
    c(paramHashMap, "mraid_interstitial_path", localaq.e);
    b(paramHashMap, "ac_max_size", localaq.f);
    b(paramHashMap, "ac_padding", localaq.g);
    b(paramHashMap, "ac_total_quota", localaq.h);
    b(paramHashMap, "db_total_quota", localaq.i);
    b(paramHashMap, "db_quota_per_origin", localaq.j);
    b(paramHashMap, "db_quota_step_size", localaq.k);
    AdWebView localAdWebView = paramp.j();
    if (AdUtil.a >= 11)
    {
      n.a(localAdWebView.getSettings(), localar);
      n.a(paramWebView.getSettings(), localar);
    }
    if (!((v)localar.k.a()).a())
    {
      boolean bool = localAdWebView.f();
      int i;
      if (AdUtil.a >= ((Integer)localaq.a.a()).intValue()) {
        i = 0;
      } else {
        i = 1;
      }
      if ((i != 0) || (!bool))
      {
        if ((i != 0) && (!bool))
        {
          d.a("Disabling hardware acceleration for a banner after reading constants.");
          localAdWebView.b();
        }
      }
      else
      {
        d.a("Re-enabling hardware acceleration for a banner after reading constants.");
        localAdWebView.c();
      }
    }
    localaq.l.a(Boolean.valueOf(true));
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.bc
 * JD-Core Version:    0.7.0.1
 */