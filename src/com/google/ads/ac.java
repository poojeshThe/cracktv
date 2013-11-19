package com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.google.ads.internal.p;
import com.google.ads.internal.u;
import com.google.ads.internal.v;
import com.google.ads.util.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ac
{
  private final p a;
  private aj b = null;
  private Object c = new Object();
  private Thread d = null;
  private Object e = new Object();
  private boolean f = false;
  private Object g = new Object();
  
  protected ac()
  {
    this.a = null;
  }
  
  public ac(p paramp)
  {
    b.a(paramp);
    this.a = paramp;
  }
  
  public static boolean a(z paramz, p paramp)
  {
    boolean bool;
    if (paramz.j() != null)
    {
      if (!paramp.g().b())
      {
        g localg1 = ((v)paramp.g().k.a()).b();
        if (!paramz.j().a())
        {
          g localg2 = paramz.j().b();
          if (localg2 == localg1)
          {
            bool = true;
          }
          else
          {
            com.google.ads.util.d.e("Mediation server returned ad size: '" + localg2 + "', while the AdView was created with ad size: '" + bool + "'. Using the ad-size passed to the AdView on creation.");
            bool = false;
          }
        }
        else
        {
          com.google.ads.util.d.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + bool + ") in the ad-type field in the mediation UI.");
          bool = false;
        }
      }
      else if (paramz.j().a())
      {
        bool = true;
      }
      else
      {
        com.google.ads.util.d.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
        bool = false;
      }
    }
    else {
      bool = true;
    }
    return bool;
  }
  
  private boolean a(String paramString, Activity paramActivity, d paramd, ag paramag, HashMap paramHashMap, long paramLong)
  {
    synchronized (new aj(this, (v)this.a.g().k.a(), paramag, paramString, paramd, paramHashMap))
    {
      ???.a(paramActivity);
      try
      {
        while ((!???.b()) && (paramLong > 0L))
        {
          long l1 = SystemClock.elapsedRealtime();
          ???.wait(paramLong);
          long l2 = SystemClock.elapsedRealtime();
          paramLong -= l2 - l1;
        }
        View localView1;
        int i;
        View localView2;
        int j;
        localObject = finally;
      }
      catch (InterruptedException localInterruptedException)
      {
        com.google.ads.util.d.a("Interrupted while waiting for ad network to load ad using adapter class: " + paramString);
        this.a.l().a(???.d());
        if ((???.b()) && (???.c()))
        {
          if (this.a.g().b()) {}
          for (localView1 = null;; localView2 = ???.e())
          {
            this.a.a(new af(this, ???, localView1, paramag));
            i = 1;
            break;
          }
        }
        ???.a();
        j = 0;
      }
    }
    return localObject;
  }
  
  private void b(z paramz, d paramd)
  {
    for (;;)
    {
      Object localObject3;
      Object localObject7;
      Object localObject4;
      Object localObject5;
      synchronized (this.e)
      {
        b.a(Thread.currentThread(), this.d);
        localObject3 = paramz.f();
        if (paramz.a())
        {
          l = paramz.b();
          Iterator localIterator = ((List)localObject3).iterator();
          if (!localIterator.hasNext()) {
            break label291;
          }
          localObject7 = (j)localIterator.next();
          com.google.ads.util.d.a("Looking to fetch ads from network: " + ((j)localObject7).b());
          localObject4 = ((j)localObject7).c();
          localObject3 = ((j)localObject7).e();
          localObject6 = ((j)localObject7).d();
          localObject5 = ((j)localObject7).a();
          localObject7 = ((j)localObject7).b();
          String str = paramz.c();
          if (localObject6 == null) {
            break label240;
          }
          localObject5 = new ag((String)localObject5, (String)localObject7, str, (List)localObject6, paramz.h(), paramz.i());
          localObject6 = ((List)localObject4).iterator();
          if (!((Iterator)localObject6).hasNext()) {
            continue;
          }
          localObject7 = (String)((Iterator)localObject6).next();
          localObject4 = (Activity)this.a.g().e.a();
          if (localObject4 != null) {
            break label249;
          }
          com.google.ads.util.d.a("Activity is null while mediating.  Terminating mediation thread.");
          return;
        }
      }
      long l = 10000L;
      continue;
      label240:
      Object localObject6 = paramz.g();
      continue;
      label249:
      this.a.l().c();
      if (!a((String)localObject7, (Activity)localObject4, paramd, (ag)localObject5, (HashMap)localObject3, l)) {
        if (b())
        {
          com.google.ads.util.d.a("GWController.destroy() called. Terminating mediation thread.");
          continue;
          label291:
          this.a.a(new ae(this, paramz));
        }
      }
    }
  }
  
  private boolean b()
  {
    synchronized (this.g)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  private boolean b(aj paramaj)
  {
    synchronized (this.g)
    {
      int i;
      if (b())
      {
        paramaj.a();
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    return localObject2;
  }
  
  public void a(aj paramaj)
  {
    synchronized (this.c)
    {
      if (this.b != paramaj)
      {
        if (this.b != null) {
          this.b.a();
        }
        this.b = paramaj;
      }
      return;
    }
  }
  
  public void a(z paramz, d paramd)
  {
    synchronized (this.e)
    {
      if (a())
      {
        com.google.ads.util.d.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
      }
      else
      {
        a(paramz, this.a);
        this.d = new Thread(new ad(this, paramz, paramd));
        this.d.start();
      }
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.d != null)
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
 * Qualified Name:     com.google.ads.ac
 * JD-Core Version:    0.7.0.1
 */