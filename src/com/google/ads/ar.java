package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.internal.v;
import com.google.ads.util.ac;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.z;

public class ar
  extends z
{
  public final ac a;
  public final ad b = new ad(this, "currentAd", null);
  public final ad c = new ad(this, "nextAd", null);
  public final ac d;
  public final ae e;
  public final ac f;
  public final ac g;
  public final ac h;
  public final ac i;
  public final ac j;
  public final ac k;
  public final ad l;
  public final ad m = new ad(this, "adListener");
  public final ad n = new ad(this, "appEventListener");
  
  public ar(ap paramap, a parama, AdView paramAdView, i parami, String paramString, Activity paramActivity, Context paramContext, ViewGroup paramViewGroup, v paramv)
  {
    this.a = new ac(this, "appState", paramap);
    this.h = new ac(this, "ad", parama);
    this.i = new ac(this, "adView", paramAdView);
    this.k = new ac(this, "adType", paramv);
    this.d = new ac(this, "adUnitId", paramString);
    this.e = new ae(this, "activity", paramActivity);
    this.j = new ac(this, "interstitialAd", parami);
    this.g = new ac(this, "bannerContainer", paramViewGroup);
    this.f = new ac(this, "applicationContext", paramContext);
    this.l = new ad(this, "adSizes", null);
  }
  
  public boolean a()
  {
    boolean bool;
    if (b()) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean b()
  {
    return ((v)this.k.a()).a();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ar
 * JD-Core Version:    0.7.0.1
 */