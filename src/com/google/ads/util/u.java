package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class u
  implements DialogInterface.OnClickListener
{
  u(JsPromptResult paramJsPromptResult) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.cancel();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.u
 * JD-Core Version:    0.7.0.1
 */