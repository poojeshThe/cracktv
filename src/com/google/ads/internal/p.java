package com.google.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.a;
import com.google.ads.ab;
import com.google.ads.ag;
import com.google.ads.ah;
import com.google.ads.aj;
import com.google.ads.ap;
import com.google.ads.aq;
import com.google.ads.ar;
import com.google.ads.e;
import com.google.ads.g;
import com.google.ads.i;
import com.google.ads.m;
import com.google.ads.n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.y;
import com.google.ads.z;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p
{
  private static final Object a = new Object();
  private final ar b;
  private h c;
  private com.google.ads.d d;
  private u e;
  private AdWebView f;
  private w g;
  private Handler h;
  private long i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private SharedPreferences o;
  private long p;
  private n q;
  private boolean r;
  private LinkedList s;
  private LinkedList t;
  private int u = -1;
  private Boolean v;
  private ab w;
  private com.google.ads.ac x;
  private ag y;
  private String z = null;
  
  public p(a parama, Activity paramActivity, g paramg, String paramString, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.e = new u();
    this.c = null;
    this.d = null;
    this.k = false;
    this.h = new Handler();
    this.p = 60000L;
    this.l = false;
    this.n = false;
    this.m = true;
    AdView localAdView;
    label115:
    Object localObject3;
    if (paramActivity == null)
    {
      ap localap1 = ap.a();
      if ((parama instanceof AdView))
      {
        localAdView = (AdView)parama;
        if (!(parama instanceof i)) {
          break label157;
        }
        ??? = (i)parama;
        if (paramg != null) {
          break label163;
        }
      }
      label157:
      label163:
      for (localObject3 = v.a;; localObject3 = v.a(paramg))
      {
        this.b = new ar(localap1, parama, localAdView, (i)???, paramString, null, null, paramViewGroup, (v)localObject3);
        return;
        localAdView = null;
        break;
        ??? = null;
        break label115;
      }
    }
    for (;;)
    {
      synchronized (a)
      {
        this.o = paramActivity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
        if (paramBoolean)
        {
          long l1 = this.o.getLong("Timeout" + paramString, -1L);
          ap localap2;
          if (l1 < 0L)
          {
            this.i = 5000L;
            localap2 = ap.a();
            if (!(parama instanceof AdView)) {
              break label442;
            }
            localAdView = (AdView)parama;
            if (!(parama instanceof i)) {
              break label448;
            }
            ??? = (i)parama;
            localObject3 = paramActivity.getApplicationContext();
            if (paramg != null) {
              break label454;
            }
            localv = v.a;
            this.b = new ar(localap2, parama, localAdView, (i)???, paramString, paramActivity, (Context)localObject3, paramViewGroup, localv);
            this.q = new n(this);
            this.s = new LinkedList();
            this.t = new LinkedList();
            a();
            AdUtil.h((Context)this.b.f.a());
            this.w = new ab();
            this.x = new com.google.ads.ac(this);
            this.v = null;
            this.y = null;
            break;
          }
          this.i = localap2;
        }
      }
      this.i = 60000L;
      continue;
      label442:
      localAdView = null;
      continue;
      label448:
      ??? = null;
      continue;
      label454:
      v localv = v.a(paramg, paramActivity.getApplicationContext());
    }
  }
  
  private void a(ag paramag, Boolean paramBoolean)
  {
    Object localObject = paramag.d();
    if (localObject == null)
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
    }
    String str = paramag.b();
    a((List)localObject, paramag.a(), str, paramag.c(), paramBoolean, this.e.d(), this.e.e());
  }
  
  private void a(List paramList, String paramString)
  {
    Object localObject;
    if (paramList != null)
    {
      localObject = paramList;
    }
    else
    {
      localObject = new ArrayList();
      ((List)localObject).add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
    }
    a((List)localObject, null, null, paramString, null, this.e.d(), this.e.e());
  }
  
  private void a(List paramList, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, String paramString5)
  {
    String str1 = AdUtil.a((Context)this.b.f.a());
    Object localObject = y.a();
    String str2 = ((y)localObject).b().toString();
    String str3 = ((y)localObject).c().toString();
    localObject = paramList.iterator();
    for (;;)
    {
      if (!((Iterator)localObject).hasNext())
      {
        this.e.b();
        return;
      }
      new Thread(new m(ah.a((String)((Iterator)localObject).next(), (String)this.b.d.a(), paramBoolean, str1, paramString1, paramString2, paramString3, str2, str3, paramString4, paramString5), (Context)this.b.f.a())).start();
    }
  }
  
  /**
   * @deprecated
   */
  public void a()
  {
    try
    {
      this.f = new AdWebView(this.b, ((v)this.b.k.a()).b());
      this.f.setVisibility(8);
      this.g = w.a(this, c.c, true, this.b.b());
      this.f.setWebViewClient(this.g);
      aq localaq = (aq)((ap)this.b.a.a()).a.a();
      if ((AdUtil.a < ((Integer)localaq.a.a()).intValue()) && (!((v)this.b.k.a()).a()))
      {
        com.google.ads.util.d.a("Disabling hardware acceleration for a banner.");
        this.f.b();
      }
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
  public void a(float paramFloat)
  {
    try
    {
      long l1 = this.p;
      this.p = ((1000.0F * paramFloat));
      if ((q()) && (this.p != l1))
      {
        d();
        e();
      }
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
  public void a(int paramInt)
  {
    try
    {
      this.u = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(long paramLong)
  {
    synchronized (a)
    {
      SharedPreferences.Editor localEditor = this.o.edit();
      localEditor.putLong("Timeout" + this.b.d, paramLong);
      localEditor.commit();
      if (this.r) {
        this.i = paramLong;
      }
      return;
    }
  }
  
  public void a(View paramView)
  {
    ((ViewGroup)this.b.g.a()).removeAllViews();
    ((ViewGroup)this.b.g.a()).addView(paramView);
  }
  
  /**
   * @deprecated
   */
  public void a(View paramView, aj paramaj, ag paramag, boolean paramBoolean)
  {
    try
    {
      com.google.ads.util.d.a("AdManager.onReceiveGWhirlAd() called.");
      this.k = true;
      this.y = paramag;
      if (this.b.a())
      {
        a(paramView);
        a(paramag, Boolean.valueOf(paramBoolean));
      }
      this.x.a(paramaj);
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.a((a)this.b.h.a());
      }
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
  public void a(com.google.ads.d paramd)
  {
    for (;;)
    {
      try
      {
        if (o())
        {
          com.google.ads.util.d.e("loadAd called while the ad is already loading, so aborting.");
          return;
        }
        if (AdActivity.c())
        {
          com.google.ads.util.d.e("loadAd called while an interstitial or landing page is displayed, so aborting");
          continue;
        }
        if (!AdUtil.c((Context)this.b.f.a())) {
          continue;
        }
      }
      finally {}
      if (AdUtil.b((Context)this.b.f.a()))
      {
        long l1 = this.o.getLong("GoogleAdMobDoritosLife", 60000L);
        if (com.google.ads.p.a((Context)this.b.f.a(), l1)) {
          com.google.ads.p.a((Activity)this.b.e.a());
        }
        this.k = false;
        this.s.clear();
        this.d = paramd;
        if (this.w.a())
        {
          this.x.a(this.w.b(), paramd);
        }
        else
        {
          this.c = new h(this);
          this.c.a(paramd);
        }
      }
    }
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public void a(e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield 70	com/google/ads/internal/p:c	Lcom/google/ads/internal/h;
    //   7: aload_1
    //   8: getstatic 470	com/google/ads/e:c	Lcom/google/ads/e;
    //   11: if_acmpne +21 -> 32
    //   14: aload_0
    //   15: ldc_w 471
    //   18: invokevirtual 473	com/google/ads/internal/p:a	(F)V
    //   21: aload_0
    //   22: invokevirtual 355	com/google/ads/internal/p:q	()Z
    //   25: ifne +7 -> 32
    //   28: aload_0
    //   29: invokevirtual 475	com/google/ads/internal/p:f	()V
    //   32: aload_0
    //   33: getfield 110	com/google/ads/internal/p:b	Lcom/google/ads/ar;
    //   36: invokevirtual 311	com/google/ads/ar:b	()Z
    //   39: ifeq +17 -> 56
    //   42: aload_1
    //   43: getstatic 477	com/google/ads/e:b	Lcom/google/ads/e;
    //   46: if_acmpne +80 -> 126
    //   49: aload_0
    //   50: getfield 68	com/google/ads/internal/p:e	Lcom/google/ads/internal/u;
    //   53: invokevirtual 480	com/google/ads/internal/u:B	()V
    //   56: new 131	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 132	java/lang/StringBuilder:<init>	()V
    //   63: ldc_w 482
    //   66: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_1
    //   70: invokevirtual 367	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: ldc_w 484
    //   76: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 486	com/google/ads/util/d:c	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 110	com/google/ads/internal/p:b	Lcom/google/ads/ar;
    //   89: getfield 406	com/google/ads/ar:m	Lcom/google/ads/util/ad;
    //   92: invokevirtual 335	com/google/ads/util/ad:a	()Ljava/lang/Object;
    //   95: checkcast 408	com/google/ads/c
    //   98: astore_2
    //   99: aload_2
    //   100: ifnull +23 -> 123
    //   103: aload_2
    //   104: aload_0
    //   105: getfield 110	com/google/ads/internal/p:b	Lcom/google/ads/ar;
    //   108: getfield 410	com/google/ads/ar:h	Lcom/google/ads/util/ac;
    //   111: invokevirtual 180	com/google/ads/util/ac:a	()Ljava/lang/Object;
    //   114: checkcast 412	com/google/ads/a
    //   117: aload_1
    //   118: invokeinterface 489 3 0
    //   123: aload_0
    //   124: monitorexit
    //   125: return
    //   126: aload_1
    //   127: getstatic 470	com/google/ads/e:c	Lcom/google/ads/e;
    //   130: if_acmpne -74 -> 56
    //   133: aload_0
    //   134: getfield 68	com/google/ads/internal/p:e	Lcom/google/ads/internal/u;
    //   137: invokevirtual 491	com/google/ads/internal/u:z	()V
    //   140: goto -84 -> 56
    //   143: astore_2
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_2
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	p
    //   0	148	1	parame	e
    //   98	6	2	localc	com.google.ads.c
    //   143	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	123	143	finally
    //   126	140	143	finally
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public void a(z paramz)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield 70	com/google/ads/internal/p:c	Lcom/google/ads/internal/h;
    //   7: aload_1
    //   8: invokevirtual 496	com/google/ads/z:d	()Z
    //   11: ifeq +38 -> 49
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 498	com/google/ads/z:e	()I
    //   19: i2f
    //   20: invokevirtual 473	com/google/ads/internal/p:a	(F)V
    //   23: aload_0
    //   24: getfield 85	com/google/ads/internal/p:l	Z
    //   27: ifne +7 -> 34
    //   30: aload_0
    //   31: invokevirtual 359	com/google/ads/internal/p:e	()V
    //   34: aload_0
    //   35: getfield 195	com/google/ads/internal/p:x	Lcom/google/ads/ac;
    //   38: aload_1
    //   39: aload_0
    //   40: getfield 72	com/google/ads/internal/p:d	Lcom/google/ads/d;
    //   43: invokevirtual 459	com/google/ads/ac:a	(Lcom/google/ads/z;Lcom/google/ads/d;)V
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: getfield 85	com/google/ads/internal/p:l	Z
    //   53: ifeq -19 -> 34
    //   56: aload_0
    //   57: invokevirtual 357	com/google/ads/internal/p:d	()V
    //   60: goto -26 -> 34
    //   63: astore_2
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	p
    //   0	68	1	paramz	z
    //   63	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	46	63	finally
    //   49	60	63	finally
  }
  
  public void a(Runnable paramRunnable)
  {
    this.h.post(paramRunnable);
  }
  
  public void a(String paramString)
  {
    Object localObject = new Uri.Builder().encodedQuery(paramString).build();
    StringBuilder localStringBuilder = new StringBuilder();
    localObject = AdUtil.b((Uri)localObject);
    Iterator localIterator = ((Map)localObject).keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        this.z = localStringBuilder.toString().trim();
        if (TextUtils.isEmpty(this.z)) {
          this.z = null;
        }
        return;
      }
      String str = (String)localIterator.next();
      localStringBuilder.append(str).append(" = ").append((String)((Map)localObject).get(str)).append("\n");
    }
  }
  
  /**
   * @deprecated
   */
  public void a(String paramString1, String paramString2)
  {
    try
    {
      com.google.ads.h localh = (com.google.ads.h)this.b.n.a();
      if (localh != null) {
        localh.a((a)this.b.h.a(), paramString1, paramString2);
      }
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
  protected void a(LinkedList paramLinkedList)
  {
    try
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        com.google.ads.util.d.a("Adding a click tracking URL: " + str);
      }
      this.t = paramLinkedList;
    }
    finally {}
  }
  
  /**
   * @deprecated
   */
  public void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String b()
  {
    return this.z;
  }
  
  /**
   * @deprecated
   */
  public void b(long paramLong)
  {
    if (paramLong > 0L) {}
    try
    {
      this.o.edit().putLong("GoogleAdMobDoritosLife", paramLong).commit();
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
  public void b(z paramz)
  {
    try
    {
      com.google.ads.util.d.a("AdManager.onGWhirlNoFill() called.");
      a(paramz.i(), paramz.c());
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.a((a)this.b.h.a(), e.b);
      }
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
  protected void b(String paramString)
  {
    try
    {
      com.google.ads.util.d.a("Adding a tracking URL: " + paramString);
      this.s.add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.v = Boolean.valueOf(paramBoolean);
  }
  
  /**
   * @deprecated
   */
  public void c()
  {
    try
    {
      this.m = false;
      com.google.ads.util.d.a("Refreshing is no longer allowed on this AdView.");
      return;
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
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 85	com/google/ads/internal/p:l	Z
    //   6: ifeq +28 -> 34
    //   9: ldc_w 571
    //   12: invokestatic 350	com/google/ads/util/d:a	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 79	com/google/ads/internal/p:h	Landroid/os/Handler;
    //   19: aload_0
    //   20: getfield 163	com/google/ads/internal/p:q	Lcom/google/ads/n;
    //   23: invokevirtual 574	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield 85	com/google/ads/internal/p:l	Z
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: ldc_w 576
    //   37: invokestatic 350	com/google/ads/util/d:a	(Ljava/lang/String;)V
    //   40: goto -9 -> 31
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	p
    //   43	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	43	finally
    //   34	40	43	finally
  }
  
  /**
   * @deprecated
   */
  public void e()
  {
    for (;;)
    {
      try
      {
        this.n = false;
        if (!this.b.a()) {
          break label110;
        }
        if (this.m)
        {
          if (!this.l)
          {
            com.google.ads.util.d.a("Enabling refreshing every " + this.p + " milliseconds.");
            this.h.postDelayed(this.q, this.p);
            this.l = true;
            return;
          }
          com.google.ads.util.d.a("Refreshing is already enabled.");
          continue;
        }
        com.google.ads.util.d.a("Refreshing disabled on this AdView");
      }
      finally {}
      continue;
      label110:
      com.google.ads.util.d.a("Tried to enable refreshing on something other than an AdView.");
    }
  }
  
  public void f()
  {
    e();
    this.n = true;
  }
  
  public ar g()
  {
    return this.b;
  }
  
  /**
   * @deprecated
   */
  public ab h()
  {
    try
    {
      ab localab = this.w;
      return localab;
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
  public h i()
  {
    try
    {
      h localh = this.c;
      return localh;
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
  public AdWebView j()
  {
    try
    {
      AdWebView localAdWebView = this.f;
      return localAdWebView;
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
  public w k()
  {
    try
    {
      w localw = this.g;
      return localw;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public u l()
  {
    return this.e;
  }
  
  /**
   * @deprecated
   */
  public int m()
  {
    try
    {
      int i1 = this.u;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public long n()
  {
    return this.i;
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public boolean o()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 70	com/google/ads/internal/p:c	Lcom/google/ads/internal/h;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	p
    //   6	2	1	localh	h
    //   12	7	1	bool	boolean
    //   22	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /**
   * @deprecated
   */
  public boolean p()
  {
    try
    {
      boolean bool = this.j;
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
  public boolean q()
  {
    try
    {
      boolean bool = this.l;
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
  public void r()
  {
    try
    {
      this.e.C();
      com.google.ads.util.d.c("onDismissScreen()");
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.c((a)this.b.h.a());
      }
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
  public void s()
  {
    try
    {
      com.google.ads.util.d.c("onPresentScreen()");
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.b((a)this.b.h.a());
      }
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
  public void t()
  {
    try
    {
      com.google.ads.util.d.c("onLeaveApplication()");
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.d((a)this.b.h.a());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void u()
  {
    this.e.f();
    x();
  }
  
  /* Error */
  /**
   * @deprecated
   */
  public void v()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 110	com/google/ads/internal/p:b	Lcom/google/ads/ar;
    //   6: getfield 443	com/google/ads/ar:e	Lcom/google/ads/util/ae;
    //   9: invokevirtual 446	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   12: checkcast 115	android/app/Activity
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 620
    //   23: invokestatic 422	com/google/ads/util/d:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 168	com/google/ads/internal/p:s	Ljava/util/LinkedList;
    //   33: invokevirtual 552	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_2
    //   37: aload_2
    //   38: invokeinterface 261 1 0
    //   43: ifeq -17 -> 26
    //   46: new 265	java/lang/Thread
    //   49: dup
    //   50: new 267	com/google/ads/m
    //   53: dup
    //   54: aload_2
    //   55: invokeinterface 270 1 0
    //   60: checkcast 272	java/lang/String
    //   63: aload_1
    //   64: invokevirtual 119	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 282	com/google/ads/m:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 285	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 288	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	p
    //   15	49	1	localActivity	Activity
    //   79	4	1	localObject	Object
    //   36	19	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	26	79	finally
    //   29	76	79	finally
  }
  
  /**
   * @deprecated
   */
  public void w()
  {
    for (;;)
    {
      try
      {
        if (this.d == null) {
          break label114;
        }
        if (!this.b.a()) {
          break label105;
        }
        if ((((AdView)this.b.i.a()).isShown()) && (AdUtil.d()))
        {
          com.google.ads.util.d.c("Refreshing ad.");
          a(this.d);
          if (this.n) {
            d();
          }
        }
        else
        {
          com.google.ads.util.d.a("Not refreshing because the ad is not visible.");
          continue;
        }
        this.h.postDelayed(this.q, this.p);
      }
      finally {}
      continue;
      label105:
      com.google.ads.util.d.a("Tried to refresh an ad that wasn't an AdView.");
      continue;
      label114:
      com.google.ads.util.d.a("Tried to refresh before calling loadAd().");
    }
  }
  
  /* Error */
  /**
   * @deprecated
   */
  protected void x()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 110	com/google/ads/internal/p:b	Lcom/google/ads/ar;
    //   6: getfield 443	com/google/ads/ar:e	Lcom/google/ads/util/ae;
    //   9: invokevirtual 446	com/google/ads/util/ae:a	()Ljava/lang/Object;
    //   12: checkcast 115	android/app/Activity
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 637
    //   23: invokestatic 422	com/google/ads/util/d:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 170	com/google/ads/internal/p:t	Ljava/util/LinkedList;
    //   33: invokevirtual 552	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_2
    //   37: aload_2
    //   38: invokeinterface 261 1 0
    //   43: ifeq -17 -> 26
    //   46: new 265	java/lang/Thread
    //   49: dup
    //   50: new 267	com/google/ads/m
    //   53: dup
    //   54: aload_2
    //   55: invokeinterface 270 1 0
    //   60: checkcast 272	java/lang/String
    //   63: aload_1
    //   64: invokevirtual 119	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 282	com/google/ads/m:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 285	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 288	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	p
    //   15	49	1	localActivity	Activity
    //   79	4	1	localObject	Object
    //   36	19	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	26	79	finally
    //   29	76	79	finally
  }
  
  /**
   * @deprecated
   */
  protected void y()
  {
    try
    {
      this.c = null;
      this.k = true;
      this.f.setVisibility(0);
      if (this.b.a()) {
        a(this.f);
      }
      this.e.g();
      if (this.b.a()) {
        v();
      }
      com.google.ads.util.d.c("onReceiveAd()");
      com.google.ads.c localc = (com.google.ads.c)this.b.m.a();
      if (localc != null) {
        localc.a((a)this.b.h.a());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.p
 * JD-Core Version:    0.7.0.1
 */