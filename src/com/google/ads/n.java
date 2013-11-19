package com.google.ads;

import com.google.ads.internal.p;
import com.google.ads.util.d;
import java.lang.ref.WeakReference;

public class n
  implements Runnable
{
  private WeakReference a;
  
  public n(p paramp)
  {
    this.a = new WeakReference(paramp);
  }
  
  public void run()
  {
    p localp = (p)this.a.get();
    if (localp != null) {
      localp.w();
    } else {
      d.a("The ad must be gone, so cancelling the refresh timer.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.n
 * JD-Core Version:    0.7.0.1
 */