package com.google.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.internal.p;
import com.google.ads.internal.u;
import com.google.ads.util.d;
import java.util.HashMap;
import java.util.Locale;

public class av
  extends az
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (str != null)
    {
      u localu = paramp.l();
      if (localu != null)
      {
        Object localObject = Uri.parse(str);
        str = ((Uri)localObject).getHost();
        if ((str != null) && (str.toLowerCase(Locale.US).endsWith(".admob.com")))
        {
          str = null;
          localObject = ((Uri)localObject).getPath();
          if (localObject != null)
          {
            localObject = ((String)localObject).split("/");
            if (localObject.length >= 4) {
              str = localObject[2] + "/" + localObject[3];
            }
          }
          localu.a(str);
        }
      }
      super.a(paramp, paramHashMap, paramWebView);
    }
    else
    {
      d.e("Could not get URL from click gmsg.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.av
 * JD-Core Version:    0.7.0.1
 */