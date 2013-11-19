package com.google.ads;

import android.view.View;
import com.google.ads.internal.p;
import com.google.ads.util.d;

class af
  implements Runnable
{
  af(ac paramac, aj paramaj, View paramView, ag paramag) {}
  
  public void run()
  {
    if (!ac.a(this.d, this.a)) {
      ac.b(this.d).a(this.b, this.a, this.c, false);
    } else {
      d.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.af
 * JD-Core Version:    0.7.0.1
 */