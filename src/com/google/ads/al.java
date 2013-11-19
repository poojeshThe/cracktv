package com.google.ads;

import android.app.Activity;
import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.ads.a.c;
import com.google.ads.a.e;
import com.google.ads.a.j;
import com.google.ads.internal.v;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class al
  implements Runnable
{
  private final aj a;
  private final String b;
  private final d c;
  private final HashMap d;
  private final boolean e;
  private final WeakReference f;
  
  public al(aj paramaj, Activity paramActivity, String paramString, d paramd, HashMap paramHashMap)
  {
    this.a = paramaj;
    this.b = paramString;
    this.f = new WeakReference(paramActivity);
    this.c = paramd;
    this.d = new HashMap(paramHashMap);
    this.e = a(this.d);
  }
  
  private void a(b paramb)
  {
    Activity localActivity = (Activity)this.f.get();
    if (localActivity != null)
    {
      this.a.a(paramb);
      Object localObject1 = paramb.c();
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = (com.google.ads.a.g)((Class)localObject1).newInstance();
        ((com.google.ads.a.g)localObject1).a(this.d);
        localObject1 = localObject1;
      }
      Object localObject2 = paramb.b();
      j localj;
      if (localObject2 == null) {
        localj = null;
      } else {
        localj = (j)this.c.a((Class)localObject2);
      }
      a locala = new a(this.c, localActivity, this.e);
      if (!this.a.a.a())
      {
        if ((paramb instanceof c))
        {
          c localc = (c)paramb;
          an localan = new an(this.a);
          localObject2 = this.a.a.b();
          localc.a(localan, localActivity, (com.google.ads.a.g)localObject1, (g)localObject2, locala, localj);
        }
        else
        {
          throw new am("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
        }
      }
      else
      {
        if (!(paramb instanceof e)) {
          break label255;
        }
        ((e)paramb).a(new ao(this.a), localActivity, (com.google.ads.a.g)localObject1, locala, localj);
      }
      this.a.g();
      return;
      label255:
      throw new am("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter" + " interface.");
    }
    throw new am("Activity became null while trying to instantiate adapter.");
  }
  
  private void a(String paramString, Throwable paramThrowable, ai paramai)
  {
    com.google.ads.util.d.b(paramString, paramThrowable);
    this.a.a(false, paramai);
  }
  
  private static boolean a(Map paramMap)
  {
    String str = (String)paramMap.remove("gwhirl_share_location");
    boolean bool;
    if (!"1".equals(str))
    {
      if ((str != null) && (!"0".equals(str))) {
        com.google.ads.util.d.b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
      }
      bool = false;
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public void run()
  {
    try
    {
      com.google.ads.util.d.a("Trying to instantiate: " + this.b);
      a((b)ah.a(this.b, b.class));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", localClassNotFoundException, ai.e);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        a("Error while creating adapter and loading ad from ad network. Skipping ad network.", localThrowable, ai.f);
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.al
 * JD-Core Version:    0.7.0.1
 */