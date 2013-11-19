package com.google.ads.util;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.ap;
import com.google.ads.aq;
import com.google.ads.ar;
import java.io.File;

public class n
{
  public static void a(View paramView)
  {
    paramView.setLayerType(1, null);
  }
  
  public static void a(Window paramWindow)
  {
    paramWindow.setFlags(16777216, 16777216);
  }
  
  public static void a(WebSettings paramWebSettings, ar paramar)
  {
    Context localContext = (Context)paramar.f.a();
    aq localaq = (aq)((ap)paramar.a.a()).a.a();
    paramWebSettings.setAppCacheEnabled(true);
    paramWebSettings.setAppCacheMaxSize(((Long)localaq.f.a()).longValue());
    paramWebSettings.setAppCachePath(new File(localContext.getCacheDir(), "admob").getAbsolutePath());
    paramWebSettings.setDatabaseEnabled(true);
    paramWebSettings.setDatabasePath(localContext.getDatabasePath("admob").getAbsolutePath());
    paramWebSettings.setDomStorageEnabled(true);
    paramWebSettings.setSupportZoom(true);
    paramWebSettings.setBuiltInZoomControls(true);
    paramWebSettings.setDisplayZoomControls(false);
  }
  
  public static void b(View paramView)
  {
    paramView.setLayerType(0, null);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.n
 * JD-Core Version:    0.7.0.1
 */