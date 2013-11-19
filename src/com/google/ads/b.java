package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.ads.internal.p;
import com.google.ads.internal.q;
import com.google.ads.util.ae;
import com.google.ads.util.d;

public class b
{
  public void a(p paramp, q paramq)
  {
    for (;;)
    {
      synchronized ()
      {
        if (AdActivity.f() == null)
        {
          AdActivity.b(paramp);
          Activity localActivity = (Activity)paramp.g().e.a();
          if (localActivity == null) {
            d.e("activity was null while launching an AdActivity.");
          }
        }
        else
        {
          if (AdActivity.f() == paramp) {
            continue;
          }
          d.b("Tried to launch a new AdActivity with a different AdManager.");
        }
      }
      ??? = new Intent(localObject1.getApplicationContext(), AdActivity.class);
      ((Intent)???).putExtra("com.google.ads.AdOpener", paramq.a());
      try
      {
        d.a("Launching AdActivity.");
        localObject1.startActivity((Intent)???);
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        d.b("Activity not found.", localActivityNotFoundException);
      }
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized ()
      {
        if (AdActivity.e() != null)
        {
          boolean bool = true;
          return bool;
        }
      }
      int i = 0;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b
 * JD-Core Version:    0.7.0.1
 */