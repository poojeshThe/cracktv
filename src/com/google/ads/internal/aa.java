package com.google.ads.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class aa
  implements DialogInterface.OnClickListener
{
  aa(y paramy, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    y.a(this.b).startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.aa
 * JD-Core Version:    0.7.0.1
 */