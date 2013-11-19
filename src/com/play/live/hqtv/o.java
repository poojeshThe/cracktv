package com.play.live.hqtv;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class o
  extends WebViewClient
{
  private o(Webview paramWebview) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.o
 * JD-Core Version:    0.7.0.1
 */