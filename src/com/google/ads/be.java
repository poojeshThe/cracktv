package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.p;
import com.google.ads.internal.q;
import com.google.ads.util.d;
import java.util.HashMap;

public class be
  implements as
{
  private b a;
  
  public be()
  {
    this(new b());
  }
  
  public be(b paramb)
  {
    this.a = paramb;
  }
  
  public void a(p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("a");
    if (str != null)
    {
      if (!str.equals("webapp"))
      {
        if (!str.equals("expand")) {
          this.a.a(paramp, new q("intent", paramHashMap));
        } else {
          this.a.a(paramp, new q("expand", paramHashMap));
        }
      }
      else {
        this.a.a(paramp, new q("webapp", paramHashMap));
      }
    }
    else {
      d.a("Could not get the action parameter for open GMSG.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.be
 * JD-Core Version:    0.7.0.1
 */