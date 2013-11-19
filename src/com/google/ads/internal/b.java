package com.google.ads.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.AdActivity;
import com.google.ads.util.AdUtil;
import com.google.ads.util.d;

class b
  implements DownloadListener
{
  b(AdWebView paramAdWebView) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString1), paramString4);
      AdActivity localAdActivity = this.a.d();
      if ((localAdActivity != null) && (AdUtil.a(localIntent, localAdActivity))) {
        localAdActivity.startActivity(localIntent);
      }
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        d.a("Couldn't find an Activity to view url/mimetype: " + paramString1 + " / " + paramString4);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("Unknown error trying to start activity to view URL: " + paramString1, localThrowable);
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.b
 * JD-Core Version:    0.7.0.1
 */