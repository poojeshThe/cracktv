package com.play.live.hqtv;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class k
  implements DialogInterface.OnClickListener
{
  k(Webview paramWebview) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("market://details?id=" + Webview.a(this.a)));
    this.a.startActivity(localIntent);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.k
 * JD-Core Version:    0.7.0.1
 */