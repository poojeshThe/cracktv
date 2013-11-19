package com.google.ads.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ar;
import com.google.ads.g;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ac;
import com.google.ads.util.d;
import com.google.ads.util.n;
import com.google.ads.util.p;
import com.google.ads.util.y;
import java.lang.ref.WeakReference;

public class AdWebView
  extends WebView
{
  private WeakReference a;
  private g b;
  private boolean c;
  private boolean d;
  private boolean e;
  
  public AdWebView(ar paramar, g paramg)
  {
    super((Context)paramar.f.a());
    this.b = paramg;
    this.a = null;
    this.c = false;
    this.d = false;
    this.e = false;
    setBackgroundColor(0);
    AdUtil.a(this);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportMultipleWindows(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    setDownloadListener(new b(this));
    if (AdUtil.a >= 11) {
      n.a(localWebSettings, paramar);
    }
    setScrollBarStyle(33554432);
    if (AdUtil.a < 14)
    {
      if (AdUtil.a >= 11) {
        setWebChromeClient(new p(paramar));
      }
    }
    else {
      setWebChromeClient(new y(paramar));
    }
  }
  
  public void a()
  {
    AdActivity localAdActivity = d();
    if (localAdActivity != null) {
      localAdActivity.finish();
    }
  }
  
  public void b()
  {
    if (AdUtil.a >= 11) {
      n.a(this);
    }
    this.d = true;
  }
  
  public void c()
  {
    if ((this.d) && (AdUtil.a >= 11)) {
      n.b(this);
    }
    this.d = false;
  }
  
  public AdActivity d()
  {
    AdActivity localAdActivity;
    if (this.a == null) {
      localAdActivity = null;
    } else {
      localAdActivity = (AdActivity)this.a.get();
    }
    return localAdActivity;
  }
  
  public void destroy()
  {
    try
    {
      super.destroy();
      setWebViewClient(new WebViewClient());
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("An error occurred while destroying an AdWebView:", localThrowable);
      }
    }
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.d;
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("An error occurred while loading data in AdWebView:", localThrowable);
      }
    }
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("An error occurred while loading a URL in AdWebView:", localThrowable);
      }
    }
  }
  
  /**
   * @deprecated
   */
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 2147483647;
    try
    {
      if (isInEditMode()) {
        super.onMeasure(paramInt1, paramInt2);
      }
      for (;;)
      {
        return;
        if ((this.b != null) && (!this.c)) {
          break;
        }
        super.onMeasure(paramInt1, paramInt2);
      }
      i2 = View.MeasureSpec.getMode(paramInt1);
    }
    finally {}
    int i2;
    int m = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt2);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(f * this.b.a());
    int n = (int)(f * this.b.b());
    if (i2 != -2147483648) {
      if (i2 == 1073741824) {
        break label224;
      }
    }
    for (;;)
    {
      label133:
      d.e("Not enough space to show ad! Wants: <" + i + ", " + n + ">, Has: <" + m + ", " + k + ">");
      setVisibility(8);
      setMeasuredDimension(m, k);
      break;
      label224:
      label228:
      do
      {
        setMeasuredDimension(i, n);
        break;
        i2 = i1;
        break label228;
        i2 = m;
        if ((j == -2147483648) || (j == 1073741824)) {
          i1 = k;
        }
        if (i - f * 6.0F > i2) {
          break label133;
        }
      } while (n <= i1);
    }
  }
  
  public void setAdActivity(AdActivity paramAdActivity)
  {
    this.a = new WeakReference(paramAdActivity);
  }
  
  /**
   * @deprecated
   */
  public void setAdSize(g paramg)
  {
    try
    {
      this.b = paramg;
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void setCustomClose(boolean paramBoolean)
  {
    this.e = paramBoolean;
    if (this.a != null)
    {
      AdActivity localAdActivity = (AdActivity)this.a.get();
      if (localAdActivity != null) {
        localAdActivity.a(paramBoolean);
      }
    }
  }
  
  public void setIsExpandedMraid(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void stopLoading()
  {
    try
    {
      super.stopLoading();
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.d("An error occurred while stopping loading in AdWebView:", localThrowable);
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.AdWebView
 * JD-Core Version:    0.7.0.1
 */