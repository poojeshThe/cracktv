package com.google.ads.util;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.AdActivity;
import com.google.ads.ap;
import com.google.ads.aq;
import com.google.ads.ar;
import com.google.ads.internal.AdWebView;

public class p
  extends WebChromeClient
{
  private final ar a;
  
  public p(ar paramar)
  {
    this.a = paramar;
  }
  
  private static void a(AlertDialog.Builder paramBuilder, Context paramContext, String paramString1, String paramString2, JsPromptResult paramJsPromptResult)
  {
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString1);
    EditText localEditText = new EditText(paramContext);
    localEditText.setText(paramString2);
    localLinearLayout.addView(localTextView);
    localLinearLayout.addView(localEditText);
    paramBuilder.setView(localLinearLayout).setPositiveButton(17039370, new v(paramJsPromptResult, localEditText)).setNegativeButton(17039360, new u(paramJsPromptResult)).setOnCancelListener(new t(paramJsPromptResult)).create().show();
  }
  
  private static void a(AlertDialog.Builder paramBuilder, String paramString, JsResult paramJsResult)
  {
    paramBuilder.setMessage(paramString).setPositiveButton(17039370, new s(paramJsResult)).setNegativeButton(17039360, new r(paramJsResult)).setOnCancelListener(new q(paramJsResult)).create().show();
  }
  
  private static boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    if ((paramWebView instanceof AdWebView))
    {
      AdActivity localAdActivity = ((AdWebView)paramWebView).d();
      if (localAdActivity != null) {}
    }
    else
    {
      bool = false;
      break label75;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(bool);
    localBuilder.setTitle(paramString1);
    if (!paramBoolean) {
      a(localBuilder, paramString2, paramJsResult);
    } else {
      a(localBuilder, bool, paramString2, paramString3, paramJsPromptResult);
    }
    boolean bool = true;
    label75:
    return bool;
  }
  
  public void onCloseWindow(WebView paramWebView)
  {
    if ((paramWebView instanceof AdWebView)) {
      ((AdWebView)paramWebView).a();
    }
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    String str = "JS: " + paramConsoleMessage.message() + " (" + paramConsoleMessage.sourceId() + ":" + paramConsoleMessage.lineNumber() + ")";
    switch (o.a[paramConsoleMessage.messageLevel().ordinal()])
    {
    case 1: 
      d.b(str);
      break;
    case 2: 
      d.e(str);
      break;
    case 3: 
    case 4: 
      d.c(str);
      break;
    case 5: 
      d.a(str);
    }
    return super.onConsoleMessage(paramConsoleMessage);
  }
  
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    aq localaq = (aq)((ap)this.a.a.a()).a.a();
    long l = ((Long)localaq.i.a()).longValue() - paramLong3;
    if (l > 0L)
    {
      if (paramLong1 != 0L)
      {
        if (paramLong2 != 0L)
        {
          if (paramLong2 <= Math.min(((Long)localaq.j.a()).longValue() - paramLong1, l)) {
            paramLong1 += paramLong2;
          }
          paramLong2 = paramLong1;
        }
        else
        {
          paramLong2 = Math.min(paramLong1 + Math.min(((Long)localaq.k.a()).longValue(), l), ((Long)localaq.j.a()).longValue());
        }
      }
      else if ((paramLong2 > l) || (paramLong2 > ((Long)localaq.j.a()).longValue())) {
        paramLong2 = 0L;
      }
      paramQuotaUpdater.updateQuota(paramLong2);
    }
    else
    {
      paramQuotaUpdater.updateQuota(paramLong1);
    }
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return a(paramWebView, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    return a(paramWebView, paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    aq localaq = (aq)((ap)this.a.a.a()).a.a();
    long l1 = ((Long)localaq.h.a()).longValue() - paramLong2;
    long l2 = paramLong1 + ((Long)localaq.g.a()).longValue();
    if (l1 >= l2) {
      paramQuotaUpdater.updateQuota(l2);
    } else {
      paramQuotaUpdater.updateQuota(0L);
    }
  }
  
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    paramCustomViewCallback.onCustomViewHidden();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.p
 * JD-Core Version:    0.7.0.1
 */