package com.play.live.hqtv;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

class i
  extends WebChromeClient
{
  i(Webview paramWebview) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    this.a.b.setProgress(paramInt);
    if (paramInt != 100) {
      this.a.b.setVisibility(0);
    } else {
      this.a.b.setVisibility(8);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.i
 * JD-Core Version:    0.7.0.1
 */