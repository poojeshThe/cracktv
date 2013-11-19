package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class at
  implements as
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("name");
    if (str != null) {
      paramp.a(str, (String)paramHashMap.get("info"));
    } else {
      d.b("Error: App event with no name parameter.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.at
 * JD-Core Version:    0.7.0.1
 */