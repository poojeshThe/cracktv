package com.play.live.hqtv;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class b
  implements View.OnClickListener
{
  b(Context paramContext, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.play.live.hqtv")));
    this.b.dismiss();
    System.exit(0);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.b
 * JD-Core Version:    0.7.0.1
 */