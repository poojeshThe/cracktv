package com.play.live.hqtv;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class j
  implements DialogInterface.OnClickListener
{
  j(Webview paramWebview) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
    this.a.finish();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.j
 * JD-Core Version:    0.7.0.1
 */