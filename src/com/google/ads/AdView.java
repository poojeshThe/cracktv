package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.p;
import com.google.ads.internal.x;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import java.util.HashSet;
import java.util.Set;

public class AdView
  extends RelativeLayout
  implements a
{
  private p a;
  
  public AdView(Activity paramActivity, g paramg, String paramString)
  {
    super(paramActivity.getApplicationContext());
    try
    {
      a(paramActivity, paramg, null);
      b(paramActivity, paramg, null);
      a(paramActivity, paramg, paramString);
      return;
    }
    catch (com.google.ads.internal.g localg)
    {
      for (;;)
      {
        a(paramActivity, localg.c("Could not initialize AdView"), paramg, null);
        localg.a("Could not initialize AdView");
      }
    }
  }
  
  protected AdView(Activity paramActivity, g[] paramArrayOfg, String paramString)
  {
    this(paramActivity, new g(0, 0), paramString);
    a(paramArrayOfg);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private int a(Context paramContext, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramContext.getResources().getDisplayMetrics());
  }
  
  private void a(Activity paramActivity, g paramg, String paramString)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramActivity);
    localFrameLayout.setFocusable(false);
    this.a = new p(this, paramActivity, paramg, paramString, localFrameLayout, false);
    setGravity(17);
    try
    {
      ViewGroup localViewGroup = x.a(paramActivity, this.a);
      if (localViewGroup != null)
      {
        localViewGroup.addView(localFrameLayout, -2, -2);
        addView(localViewGroup, -2, -2);
      }
      else
      {
        addView(localFrameLayout, -2, -2);
      }
    }
    catch (VerifyError localVerifyError)
    {
      com.google.ads.util.d.a("Gestures disabled: Not supported on this version of Android.", localVerifyError);
      addView(localFrameLayout, -2, -2);
    }
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return;
    }
    try
    {
      String str = b("adSize", paramContext, paramAttributeSet, true);
      localObject1 = a(str);
      if (localObject1 != null) {}
      try
      {
        if (localObject1.length != 0) {
          break label128;
        }
        throw new com.google.ads.internal.g("Attribute \"adSize\" invalid: " + str, true);
      }
      catch (com.google.ads.internal.g localg2)
      {
        localObject2 = localg2;
        localObject3 = localObject1;
      }
    }
    catch (com.google.ads.internal.g localg1)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = null;
        Object localObject2 = localg1;
      }
    }
    localObject1 = ((com.google.ads.internal.g)localObject2).c("Could not initialize AdView");
    if ((localObject3 != null) && (localObject3.length > 0)) {}
    for (localObject3 = localObject3[0];; localObject3 = g.b)
    {
      a(paramContext, (String)localObject1, (g)localObject3, paramAttributeSet);
      ((com.google.ads.internal.g)localObject2).a("Could not initialize AdView");
      if (isInEditMode()) {
        break;
      }
      ((com.google.ads.internal.g)localObject2).b("Could not initialize AdView");
      break;
      label128:
      if (!a("adUnitId", paramAttributeSet)) {
        throw new com.google.ads.internal.g("Required XML attribute \"adUnitId\" missing", true);
      }
      if (isInEditMode())
      {
        a(paramContext, "Ads by Google", -1, localObject1[0], paramAttributeSet);
        break;
      }
      localObject2 = b("adUnitId", paramContext, paramAttributeSet, true);
      boolean bool = a("loadAdOnCreate", paramContext, paramAttributeSet, false);
      if ((paramContext instanceof Activity))
      {
        localObject3 = (Activity)paramContext;
        a((Context)localObject3, localObject1[0], paramAttributeSet);
        b((Context)localObject3, localObject1[0], paramAttributeSet);
        if (localObject1.length == 1) {
          a((Activity)localObject3, localObject1[0], (String)localObject2);
        }
        for (;;)
        {
          if (!bool) {
            break label349;
          }
          localObject2 = c("testDevices", paramContext, paramAttributeSet, false);
          if (((Set)localObject2).contains("TEST_EMULATOR"))
          {
            ((Set)localObject2).remove("TEST_EMULATOR");
            ((Set)localObject2).add(d.a);
          }
          a(new d().b((Set)localObject2).a(c("keywords", paramContext, paramAttributeSet, false)));
          break;
          a((Activity)localObject3, new g(0, 0), (String)localObject2);
          a((g[])localObject1);
        }
        label349:
        break;
      }
      throw new com.google.ads.internal.g("AdView was initialized with a Context that wasn't an Activity.", true);
    }
  }
  
  private void a(Context paramContext, String paramString, g paramg, AttributeSet paramAttributeSet)
  {
    com.google.ads.util.d.b(paramString);
    a(paramContext, paramString, -65536, paramg, paramAttributeSet);
  }
  
  private void a(g... paramVarArgs)
  {
    g[] arrayOfg = new g[paramVarArgs.length];
    for (int i = 0;; i++)
    {
      if (i >= paramVarArgs.length)
      {
        this.a.g().l.a(arrayOfg);
        return;
      }
      arrayOfg[i] = g.a(paramVarArgs[i], getContext());
    }
  }
  
  private boolean a(Context paramContext, g paramg, AttributeSet paramAttributeSet)
  {
    boolean bool;
    if (AdUtil.c(paramContext))
    {
      bool = true;
    }
    else
    {
      a(paramContext, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", paramg, paramAttributeSet);
      bool = false;
    }
    return bool;
  }
  
  private boolean a(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str1 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    boolean bool2 = paramAttributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", paramString, paramBoolean);
    String str2;
    String str3;
    TypedValue localTypedValue;
    if (str1 != null)
    {
      str2 = paramContext.getPackageName();
      if (str1.matches("^@([^:]+)\\:(.*)$"))
      {
        str2 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        str1 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      if (str1.startsWith("@bool/"))
      {
        str3 = str1.substring("@bool/".length());
        localTypedValue = new TypedValue();
      }
    }
    for (;;)
    {
      try
      {
        getResources().getValue(str2 + ":bool/" + str3, localTypedValue, true);
        if (localTypedValue.type != 18) {
          break label212;
        }
        if (localTypedValue.data != 0)
        {
          bool1 = true;
          return bool1;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        throw new com.google.ads.internal.g("Could not find resource for " + paramString + ": " + bool1, true, localNotFoundException);
      }
      boolean bool1 = false;
      continue;
      label212:
      throw new com.google.ads.internal.g("Resource " + paramString + " was not a boolean: " + localTypedValue, true);
      bool1 = str3;
    }
  }
  
  private boolean a(String paramString, AttributeSet paramAttributeSet)
  {
    boolean bool;
    if (paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString) == null) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private String b(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str1 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    String str2;
    String str3;
    TypedValue localTypedValue;
    if (str1 != null)
    {
      str2 = paramContext.getPackageName();
      if (str1.matches("^@([^:]+)\\:(.*)$"))
      {
        str2 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        str1 = str1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      if (str1.startsWith("@string/"))
      {
        str3 = str1.substring("@string/".length());
        localTypedValue = new TypedValue();
      }
    }
    try
    {
      getResources().getValue(str2 + ":string/" + str3, localTypedValue, true);
      if (localTypedValue.string != null)
      {
        str1 = localTypedValue.string.toString();
        if ((!paramBoolean) || (str1 != null)) {
          break label272;
        }
        throw new com.google.ads.internal.g("Required XML attribute \"" + paramString + "\" missing", true);
      }
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      throw new com.google.ads.internal.g("Could not find resource for " + paramString + ": " + str1, true, localNotFoundException);
    }
    throw new com.google.ads.internal.g("Resource " + paramString + " was not a string: " + localNotFoundException, true);
    label272:
    return str1;
  }
  
  private boolean b(Context paramContext, g paramg, AttributeSet paramAttributeSet)
  {
    boolean bool;
    if (AdUtil.b(paramContext))
    {
      bool = true;
    }
    else
    {
      a(paramContext, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", paramg, paramAttributeSet);
      bool = false;
    }
    return bool;
  }
  
  private Set c(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    String str = b(paramString, paramContext, paramAttributeSet, paramBoolean);
    HashSet localHashSet = new HashSet();
    String[] arrayOfString;
    int i;
    if (str != null)
    {
      arrayOfString = str.split(",");
      i = arrayOfString.length;
    }
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return localHashSet;
      }
      str = arrayOfString[j].trim();
      if (str.length() != 0) {
        localHashSet.add(str);
      }
    }
  }
  
  void a(Context paramContext, String paramString, int paramInt, g paramg, AttributeSet paramAttributeSet)
  {
    if (paramg == null) {
      paramg = g.b;
    }
    g localg = g.a(paramg, paramContext.getApplicationContext());
    if (getChildCount() == 0)
    {
      TextView localTextView;
      if (paramAttributeSet != null) {
        localTextView = new TextView(paramContext, paramAttributeSet);
      } else {
        localTextView = new TextView(paramContext);
      }
      localTextView.setGravity(17);
      localTextView.setText(paramString);
      localTextView.setTextColor(paramInt);
      localTextView.setBackgroundColor(-16777216);
      LinearLayout localLinearLayout1;
      if (paramAttributeSet != null) {
        localLinearLayout1 = new LinearLayout(paramContext, paramAttributeSet);
      } else {
        localLinearLayout1 = new LinearLayout(paramContext);
      }
      localLinearLayout1.setGravity(17);
      LinearLayout localLinearLayout2;
      if (paramAttributeSet != null) {
        localLinearLayout2 = new LinearLayout(paramContext, paramAttributeSet);
      } else {
        localLinearLayout2 = new LinearLayout(paramContext);
      }
      localLinearLayout2.setGravity(17);
      localLinearLayout2.setBackgroundColor(paramInt);
      int i = a(paramContext, localg.a());
      int j = a(paramContext, localg.b());
      localLinearLayout1.addView(localTextView, i - 2, j - 2);
      localLinearLayout2.addView(localLinearLayout1);
      addView(localLinearLayout2, i, j);
    }
  }
  
  public void a(d paramd)
  {
    if (this.a != null)
    {
      if (a()) {
        this.a.d();
      }
      this.a.a(paramd);
    }
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.a != null) {
      bool = this.a.q();
    } else {
      bool = false;
    }
    return bool;
  }
  
  g[] a(String paramString)
  {
    Object localObject = null;
    String[] arrayOfString1 = paramString.split(",");
    g[] arrayOfg = new g[arrayOfString1.length];
    int i = 0;
    String[] arrayOfString2;
    if (i < arrayOfString1.length)
    {
      String str = arrayOfString1[i].trim();
      if (str.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
      {
        arrayOfString2 = str.split("[xX]");
        arrayOfString2[0] = arrayOfString2[0].trim();
        arrayOfString2[1] = arrayOfString2[1].trim();
      }
    }
    for (;;)
    {
      try
      {
        if (!"FULL_WIDTH".equals(arrayOfString2[0])) {
          continue;
        }
        int j = -1;
        boolean bool = "AUTO_HEIGHT".equals(arrayOfString2[1]);
        if (!bool) {
          continue;
        }
        m = -2;
        g localg1 = new g(j, m);
        if (localg1 != null) {
          continue;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        int m;
        int k;
        g localg2;
        continue;
      }
      return localObject;
      k = Integer.parseInt(arrayOfString2[0]);
      continue;
      m = Integer.parseInt(arrayOfString2[1]);
      m = m;
      continue;
      if ("BANNER".equals(k))
      {
        localg2 = g.b;
      }
      else if ("SMART_BANNER".equals(localg2))
      {
        localg2 = g.a;
      }
      else if ("IAB_MRECT".equals(localg2))
      {
        localg2 = g.c;
      }
      else if ("IAB_BANNER".equals(localg2))
      {
        localg2 = g.d;
      }
      else if ("IAB_LEADERBOARD".equals(localg2))
      {
        localg2 = g.e;
      }
      else if ("IAB_WIDE_SKYSCRAPER".equals(localg2))
      {
        localg2 = g.f;
      }
      else
      {
        localg2 = null;
        continue;
        arrayOfg[i] = localg2;
        i++;
        break;
        localObject = arrayOfg;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AdWebView localAdWebView = this.a.j();
    if (localAdWebView != null) {
      localAdWebView.setVisibility(0);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setAdListener(c paramc)
  {
    this.a.g().m.a(paramc);
  }
  
  protected void setAppEventListener(h paramh)
  {
    this.a.g().n.a(paramh);
  }
  
  protected void setSupportedAdSizes(g... paramVarArgs)
  {
    if (this.a.g().l.a() != null) {
      a(paramVarArgs);
    } else {
      com.google.ads.util.d.b("Error: Tried to set supported ad sizes on a single-size AdView.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0.1
 */