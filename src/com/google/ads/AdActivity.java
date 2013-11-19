package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.c;
import com.google.ads.internal.q;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ac;
import com.google.ads.util.ad;
import com.google.ads.util.d;
import com.google.ads.util.m;
import com.google.ads.util.n;
import java.util.HashMap;
import java.util.Map;

public class AdActivity
  extends Activity
  implements View.OnClickListener
{
  private static final c a = (c)c.a.b();
  private static final Object b = new Object();
  private static AdActivity c = null;
  private static com.google.ads.internal.p d = null;
  private static AdActivity e = null;
  private static AdActivity f = null;
  private static final b g = new b();
  private AdWebView h;
  private FrameLayout i;
  private int j;
  private ViewGroup k = null;
  private boolean l;
  private long m;
  private RelativeLayout n;
  private AdActivity o = null;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private AdVideoView t;
  
  public static void a(com.google.ads.internal.p paramp, q paramq)
  {
    g.a(paramp, paramq);
  }
  
  private void a(String paramString)
  {
    d.b(paramString);
    finish();
  }
  
  private void a(String paramString, Throwable paramThrowable)
  {
    d.b(paramString, paramThrowable);
    finish();
  }
  
  private RelativeLayout.LayoutParams c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }
  
  public static boolean c()
  {
    return g.a();
  }
  
  private void g()
  {
    if (!this.l) {
      if (this.h != null)
      {
        a.b(this.h);
        this.h.setAdActivity(null);
        this.h.setIsExpandedMraid(false);
        if ((!this.q) && (this.n != null) && (this.k != null))
        {
          if ((!this.r) || (this.s)) {
            break label238;
          }
          d.a("Disabling hardware acceleration on collapsing MRAID WebView.");
          this.h.b();
        }
      }
    }
    for (;;)
    {
      this.n.removeView(this.h);
      this.k.addView(this.h);
      if (this.t != null)
      {
        this.t.e();
        this.t = null;
      }
      if (this == c) {
        c = null;
      }
      f = this.o;
      synchronized (b)
      {
        if ((d != null) && (this.q) && (this.h != null))
        {
          if (this.h == d.j()) {
            d.a();
          }
          this.h.stopLoading();
        }
        if (this == e)
        {
          e = null;
          if (d != null)
          {
            d.r();
            d = null;
          }
        }
        else
        {
          this.l = true;
          d.a("AdActivity is closing.");
          return;
          label238:
          if ((this.r) || (!this.s)) {
            continue;
          }
          d.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
          this.h.c();
          continue;
        }
        d.e("currentAdManager is null while trying to destroy AdActivity.");
      }
    }
  }
  
  protected View a(int paramInt, boolean paramBoolean)
  {
    this.j = ((int)TypedValue.applyDimension(1, paramInt, getResources().getDisplayMetrics()));
    this.i = new FrameLayout(getApplicationContext());
    this.i.setMinimumWidth(this.j);
    this.i.setMinimumHeight(this.j);
    this.i.setOnClickListener(this);
    a(paramBoolean);
    return this.i;
  }
  
  public AdVideoView a()
  {
    return this.t;
  }
  
  protected AdVideoView a(Activity paramActivity)
  {
    return new AdVideoView(paramActivity, this.h);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t != null)
    {
      this.t.setLayoutParams(c(paramInt1, paramInt2, paramInt3, paramInt4));
      this.t.requestLayout();
    }
  }
  
  protected void a(AdWebView paramAdWebView, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
  {
    requestWindowFeature(1);
    Object localObject = getWindow();
    ((Window)localObject).setFlags(1024, 1024);
    if (AdUtil.a >= 11) {
      if (!this.r)
      {
        d.a("Disabling hardware acceleration on the AdActivity WebView.");
        paramAdWebView.b();
      }
      else
      {
        d.a("Enabling hardware acceleration on the AdActivity window.");
        n.a((Window)localObject);
      }
    }
    localObject = paramAdWebView.getParent();
    if (localObject != null)
    {
      if (!paramBoolean2)
      {
        a("Interstitial created with an AdWebView that has a parent.");
      }
      else if (!(localObject instanceof ViewGroup))
      {
        a("MRAID banner was not a child of a ViewGroup.");
      }
      else
      {
        this.k = ((ViewGroup)localObject);
        this.k.removeView(paramAdWebView);
      }
    }
    else if (paramAdWebView.d() == null)
    {
      setRequestedOrientation(paramInt);
      paramAdWebView.setAdActivity(this);
      int i1;
      if (!paramBoolean2) {
        i1 = 32;
      } else {
        i1 = 50;
      }
      View localView = a(i1, paramBoolean3);
      this.n.addView(paramAdWebView, -1, -1);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      if (!paramBoolean2)
      {
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(9);
      }
      else
      {
        localLayoutParams.addRule(10);
        localLayoutParams.addRule(11);
      }
      this.n.addView(localView, localLayoutParams);
      this.n.setKeepScreenOn(true);
      setContentView(this.n);
      this.n.getRootView().setBackgroundColor(-16777216);
      if (paramBoolean1) {
        a.a(paramAdWebView);
      }
    }
    else
    {
      a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
    }
  }
  
  protected void a(com.google.ads.internal.p paramp)
  {
    this.h = null;
    this.m = SystemClock.elapsedRealtime();
    this.p = true;
    synchronized (b)
    {
      if (c == null)
      {
        c = this;
        paramp.t();
      }
      return;
    }
  }
  
  protected void a(HashMap paramHashMap, com.google.ads.internal.p paramp)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
    localIntent.addCategory("android.intent.category.LAUNCHER");
    localIntent.putExtras(getIntent().getExtras());
    localIntent.putExtra("com.google.circles.platform.intent.extra.ENTITY", (String)paramHashMap.get("u"));
    localIntent.putExtra("com.google.circles.platform.intent.extra.ENTITY_TYPE", w.a.c);
    localIntent.putExtra("com.google.circles.platform.intent.extra.ACTION", (String)paramHashMap.get("a"));
    a(paramp);
    try
    {
      d.a("Launching Google+ intent from AdActivity.");
      startActivityForResult(localIntent, 0);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        a(localActivityNotFoundException.getMessage(), localActivityNotFoundException);
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.i != null)
    {
      this.i.removeAllViews();
      if (!paramBoolean)
      {
        ImageButton localImageButton = new ImageButton(this);
        localImageButton.setImageResource(17301527);
        localImageButton.setBackgroundColor(0);
        localImageButton.setOnClickListener(this);
        localImageButton.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.j, this.j, 17);
        this.i.addView(localImageButton, localLayoutParams);
      }
    }
  }
  
  /* Error */
  public AdWebView b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 78	com/google/ads/AdActivity:o	Lcom/google/ads/AdActivity;
    //   6: ifnull +13 -> 19
    //   9: aload_0
    //   10: getfield 78	com/google/ads/AdActivity:o	Lcom/google/ads/AdActivity;
    //   13: getfield 116	com/google/ads/AdActivity:h	Lcom/google/ads/internal/AdWebView;
    //   16: astore_2
    //   17: aload_2
    //   18: areturn
    //   19: getstatic 60	com/google/ads/AdActivity:b	Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_1
    //   24: monitorenter
    //   25: getstatic 64	com/google/ads/AdActivity:d	Lcom/google/ads/internal/p;
    //   28: ifnonnull +19 -> 47
    //   31: ldc_w 424
    //   34: invokestatic 182	com/google/ads/util/d:e	(Ljava/lang/String;)V
    //   37: aload_1
    //   38: monitorexit
    //   39: goto -22 -> 17
    //   42: astore_2
    //   43: aload_1
    //   44: monitorexit
    //   45: aload_2
    //   46: athrow
    //   47: getstatic 64	com/google/ads/AdActivity:d	Lcom/google/ads/internal/p;
    //   50: invokevirtual 165	com/google/ads/internal/p:j	()Lcom/google/ads/internal/AdWebView;
    //   53: astore_3
    //   54: aload_3
    //   55: aload_0
    //   56: getfield 116	com/google/ads/AdActivity:h	Lcom/google/ads/internal/AdWebView;
    //   59: if_acmpeq +10 -> 69
    //   62: aload_1
    //   63: monitorexit
    //   64: aload_3
    //   65: astore_2
    //   66: goto -49 -> 17
    //   69: aload_1
    //   70: monitorexit
    //   71: goto -54 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	AdActivity
    //   22	48	1	localObject1	Object
    //   1	17	2	localAdWebView1	AdWebView
    //   42	4	2	localObject2	Object
    //   65	1	2	localObject3	Object
    //   53	12	3	localAdWebView2	AdWebView
    // Exception table:
    //   from	to	target	type
    //   25	45	42	finally
    //   47	71	42	finally
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t == null)
    {
      this.t = a(this);
      this.n.addView(this.t, 0, c(paramInt1, paramInt2, paramInt3, paramInt4));
      synchronized (b)
      {
        if (d == null) {
          d.e("currentAdManager was null while trying to get the opening AdWebView.");
        } else {
          d.k().b(false);
        }
      }
    }
  }
  
  protected void b(HashMap paramHashMap, com.google.ads.internal.p paramp)
  {
    if (paramHashMap == null) {
      a("Could not get the paramMap in launchIntent()");
    }
    for (;;)
    {
      return;
      localObject1 = (String)paramHashMap.get("u");
      if (localObject1 != null) {
        break;
      }
      a("Could not get the URL parameter in launchIntent().");
    }
    Object localObject2 = (String)paramHashMap.get("i");
    String str = (String)paramHashMap.get("m");
    Object localObject1 = Uri.parse((String)localObject1);
    if (localObject2 == null) {}
    for (localObject2 = new Intent("android.intent.action.VIEW", (Uri)localObject1);; localObject2 = new Intent((String)localObject2, (Uri)localObject1))
    {
      for (;;)
      {
        if (str != null) {
          ((Intent)localObject2).setDataAndType((Uri)localObject1, str);
        }
        a(paramp);
        try
        {
          d.a("Launching an intent from AdActivity: " + ((Intent)localObject2).getAction() + " - " + localObject1);
          startActivity((Intent)localObject2);
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          a(localActivityNotFoundException.getMessage(), localActivityNotFoundException);
        }
      }
      break;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((b() != null) && (paramIntent != null) && (paramIntent.getExtras() != null) && (paramIntent.getExtras().getString("com.google.circles.platform.result.extra.CONFIRMATION") != null) && (paramIntent.getExtras().getString("com.google.circles.platform.result.extra.ACTION") != null))
    {
      String str1 = paramIntent.getExtras().getString("com.google.circles.platform.result.extra.CONFIRMATION");
      String str2 = paramIntent.getExtras().getString("com.google.circles.platform.result.extra.ACTION");
      if (str1.equals("yes")) {
        if (!str2.equals("insert"))
        {
          if (str2.equals("delete")) {
            p.a(b(), false);
          }
        }
        else {
          p.a(b(), true);
        }
      }
    }
    finish();
  }
  
  public void onClick(View paramView)
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i2 = 0;
    super.onCreate(paramBundle);
    this.l = false;
    com.google.ads.internal.p localp;
    Object localObject4;
    label270:
    label276:
    String str1;
    for (;;)
    {
      synchronized (b)
      {
        if (d != null)
        {
          localp = d;
          if (e == null)
          {
            e = this;
            localp.s();
          }
          if ((this.o == null) && (f != null)) {
            this.o = f;
          }
          f = this;
          if (((localp.g().a()) && (e == this)) || ((localp.g().b()) && (this.o == e))) {
            localp.u();
          }
          boolean bool1 = localp.p();
          localObject4 = (aq)((ap)localp.g().a.a()).a.a();
          if (AdUtil.a >= ((Integer)((aq)localObject4).a.a()).intValue())
          {
            bool4 = true;
            this.s = bool4;
            if (AdUtil.a < ((Integer)((aq)localObject4).b.a()).intValue()) {
              break label270;
            }
            bool4 = true;
            this.r = bool4;
            this.n = null;
            this.p = false;
            this.q = true;
            this.t = null;
            ??? = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (??? != null) {
              break label276;
            }
            a("Could not get the Bundle used to create AdActivity.");
          }
        }
        else
        {
          a("Could not get currentAdManager.");
        }
      }
      boolean bool4 = false;
      continue;
      bool4 = false;
      continue;
      ??? = new q((Bundle)???);
      str1 = ((q)???).b();
      ??? = ((q)???).c();
      if (str1.equals("plusone"))
      {
        a((HashMap)???, localp);
      }
      else
      {
        if (!str1.equals("intent")) {
          break;
        }
        b((HashMap)???, localp);
      }
    }
    this.n = new RelativeLayout(getApplicationContext());
    label397:
    label486:
    int i1;
    label514:
    boolean bool2;
    int i3;
    if (str1.equals("webapp"))
    {
      this.h = new AdWebView(localp.g(), null);
      Object localObject3 = c.c;
      if (localObject1 == 0)
      {
        boolean bool5 = true;
        localObject3 = com.google.ads.internal.w.a(localp, (Map)localObject3, true, bool5);
        ((com.google.ads.internal.w)localObject3).d(true);
        if (localObject1 != 0) {
          ((com.google.ads.internal.w)localObject3).a(true);
        }
        this.h.setWebViewClient((WebViewClient)localObject3);
        String str2 = (String)((HashMap)???).get("u");
        localObject4 = (String)((HashMap)???).get("baseurl");
        localObject3 = (String)((HashMap)???).get("html");
        if (str2 == null) {
          break label565;
        }
        this.h.loadUrl(str2);
        localObject3 = (String)((HashMap)???).get("o");
        if (!"p".equals(localObject3)) {
          break label601;
        }
        i1 = AdUtil.b();
        localObject3 = this.h;
        if ((??? == null) || (!"1".equals(((HashMap)???).get("custom_close")))) {
          break label640;
        }
      }
      label640:
      for (bool2 = true;; bool2 = false)
      {
        a((AdWebView)localObject3, false, i1, localObject1, bool2);
        break;
        i3 = 0;
        break label397;
        label565:
        if (localObject3 != null)
        {
          this.h.loadDataWithBaseURL((String)localObject4, (String)localObject3, "text/html", "utf-8", null);
          break label486;
        }
        a("Could not get the URL or HTML parameter to show a web app.");
        break;
        label601:
        if ("l".equals(localObject3))
        {
          i1 = AdUtil.a();
          break label514;
        }
        if (this == e)
        {
          i1 = i1.m();
          break label514;
        }
        i1 = -1;
        break label514;
      }
    }
    boolean bool3;
    if ((i3.equals("interstitial")) || (i3.equals("expand")))
    {
      this.h = i1.j();
      i1 = i1.m();
      if (i3.equals("expand"))
      {
        this.h.setIsExpandedMraid(true);
        this.q = false;
        if ((bool2 != null) && ("1".equals(bool2.get("custom_close")))) {
          bool3 = true;
        }
        if ((!this.r) || (this.s)) {
          break label823;
        }
        d.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
        this.h.c();
        bool2 = bool3;
      }
    }
    for (;;)
    {
      a(this.h, true, i1, localObject1, bool2);
      break;
      bool2 = this.h.e();
      continue;
      a("Unknown AdOpener, <action: " + i3 + ">");
      break;
      label823:
      bool2 = bool3;
    }
  }
  
  public void onDestroy()
  {
    if (this.n != null) {
      this.n.removeAllViews();
    }
    if (isFinishing())
    {
      g();
      if ((this.q) && (this.h != null))
      {
        this.h.stopLoading();
        this.h.destroy();
        this.h = null;
      }
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    if (isFinishing()) {
      g();
    }
    super.onPause();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if ((this.p) && (paramBoolean) && (SystemClock.elapsedRealtime() - this.m > 250L))
    {
      d.d("Launcher AdActivity got focus and is closing.");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdActivity
 * JD-Core Version:    0.7.0.1
 */