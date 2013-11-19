package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.internal.v;
import java.util.HashMap;

public class aj
{
  final v a;
  private final ag b;
  private boolean c;
  private boolean d;
  private ai e;
  private final ac f;
  private com.google.ads.a.b g;
  private boolean h;
  private boolean i;
  private View j;
  private final Handler k;
  private final String l;
  private final d m;
  private final HashMap n;
  
  public aj(ac paramac, v paramv, ag paramag, String paramString, d paramd, HashMap paramHashMap)
  {
    com.google.ads.util.b.a(TextUtils.isEmpty(paramString));
    this.f = paramac;
    this.a = paramv;
    this.b = paramag;
    this.l = paramString;
    this.m = paramd;
    this.n = paramHashMap;
    this.c = false;
    this.d = false;
    this.e = null;
    this.g = null;
    this.h = false;
    this.i = false;
    this.j = null;
    this.k = new Handler(Looper.getMainLooper());
  }
  
  /**
   * @deprecated
   */
  public void a()
  {
    try
    {
      com.google.ads.util.b.a(this.h, "destroy() called but startLoadAdTask has not been called.");
      this.k.post(new ak(this));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public void a(Activity paramActivity)
  {
    try
    {
      com.google.ads.util.b.b(this.h, "startLoadAdTask has already been called.");
      this.h = true;
      this.k.post(new al(this, paramActivity, this.l, this.m, this.n));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  void a(com.google.ads.a.b paramb)
  {
    try
    {
      this.g = paramb;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  void a(boolean paramBoolean, ai paramai)
  {
    try
    {
      this.d = paramBoolean;
      this.c = true;
      this.e = paramai;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public boolean b()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public boolean c()
  {
    try
    {
      com.google.ads.util.b.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public ai d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 63	com/google/ads/aj:e	Lcom/google/ads/ai;
    //   6: ifnonnull +11 -> 17
    //   9: getstatic 122	com/google/ads/ai:d	Lcom/google/ads/ai;
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: aload_0
    //   18: getfield 63	com/google/ads/aj:e	Lcom/google/ads/ai;
    //   21: astore_1
    //   22: goto -9 -> 13
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	aj
    //   12	10	1	localai	ai
    //   25	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	25	finally
    //   17	22	25	finally
  }
  
  /**
   * @deprecated
   */
  public View e()
  {
    try
    {
      com.google.ads.util.b.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
      View localView = this.j;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public String f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/google/ads/aj:g	Lcom/google/ads/a/b;
    //   6: ifnull +20 -> 26
    //   9: aload_0
    //   10: getfield 65	com/google/ads/aj:g	Lcom/google/ads/a/b;
    //   13: invokevirtual 130	java/lang/Object:getClass	()Ljava/lang/Class;
    //   16: invokevirtual 135	java/lang/Class:getName	()Ljava/lang/String;
    //   19: astore_1
    //   20: aload_1
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: areturn
    //   26: ldc 137
    //   28: astore_1
    //   29: goto -7 -> 22
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	aj
    //   19	10	1	str	String
    //   32	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	32	finally
    //   26	29	32	finally
  }
  
  /**
   * @deprecated
   */
  void g()
  {
    try
    {
      this.i = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  boolean h()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.aj
 * JD-Core Version:    0.7.0.1
 */