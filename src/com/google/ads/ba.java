package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.h;
import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.util.HashMap;

public class ba
  implements as
{
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    Object localObject = (String)paramHashMap.get("type");
    String str = (String)paramHashMap.get("errors");
    d.e("Invalid " + (String)localObject + " request error: " + str);
    localObject = paramp.i();
    if (localObject != null) {
      ((h)localObject).a(e.a);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ba
 * JD-Core Version:    0.7.0.1
 */