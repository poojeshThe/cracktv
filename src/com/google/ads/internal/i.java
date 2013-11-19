package com.google.ads.internal;

import android.webkit.WebView;
import com.google.ads.ar;
import com.google.ads.util.ac;
import com.google.ads.z;

class i
  implements Runnable
{
  i(h paramh, z paramz) {}
  
  public void run()
  {
    if (h.a(this.b) != null)
    {
      h.a(this.b).stopLoading();
      h.a(this.b).destroy();
    }
    h.c(this.b).a(h.b(this.b));
    if (h.d(this.b) != null) {
      ((v)h.c(this.b).g().k.a()).b(h.d(this.b));
    }
    h.c(this.b).a(this.a);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.i
 * JD-Core Version:    0.7.0.1
 */