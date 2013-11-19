package com.play.live.hqtv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class h
  extends WebViewClient
{
  h(Webview paramWebview) {}
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    paramWebView.loadData("Please check your internet settings. If you are already connected hit BACK Key on your mobile and re-launch the application.", "text/html", "UTF-8");
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool = true;
    Intent localIntent1;
    if ((!paramString.startsWith("vnd.youtube")) && (!paramString.endsWith(".mkv")) && (!paramString.endsWith(".mp3")) && (!paramString.endsWith(".mp4")) && (!paramString.startsWith("rtnp:")) && (!paramString.startsWith("mmp:")))
    {
      if ((!paramString.startsWith("rtmp")) && (!paramString.endsWith(".m3u8")) && (!paramString.endsWith(".mmsh")) && (!paramString.endsWith(".m3u8?bitrate=800")) && (!paramString.endsWith("q=high")) && (!paramString.endsWith("1234")) && (!paramString.endsWith(".asx")) && (!paramString.endsWith("med")) && (!paramString.startsWith("rtsp:")) && (!paramString.startsWith("mms:")))
      {
        if (!paramString.startsWith("mailto:"))
        {
          if (!paramString.startsWith("tel:"))
          {
            if ((paramString == null) || (!paramString.startsWith("https://")))
            {
              if ((paramString == null) || (!paramString.startsWith("market://"))) {
                bool = false;
              } else {
                paramWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
              }
            }
            else {
              paramWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
            }
          }
          else {
            this.a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(paramString)));
          }
        }
        else
        {
          String str = paramString.replaceFirst("mailto:", "").trim();
          localIntent1 = new Intent("android.intent.action.SEND");
          Intent localIntent2 = localIntent1.setType("plain/text");
          String[] arrayOfString = new String[bool];
          arrayOfString[0] = str;
          localIntent2.putExtra("android.intent.extra.EMAIL", arrayOfString);
          this.a.startActivity(localIntent1);
        }
      }
      else {
        Webview.a(this.a, paramString);
      }
    }
    else
    {
      localIntent1 = new Intent(this.a, VideoActivityNotRtmp.class);
      localIntent1.putExtra("path", paramString);
      this.a.startActivity(localIntent1);
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.h
 * JD-Core Version:    0.7.0.1
 */