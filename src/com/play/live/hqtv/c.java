package com.play.live.hqtv;

import android.app.Dialog;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

class c
  implements View.OnClickListener
{
  c(SharedPreferences.Editor paramEditor, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    if (this.a != null)
    {
      this.a.putBoolean("dontshowagain", true);
      this.a.commit();
    }
    this.b.dismiss();
    System.exit(0);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.c
 * JD-Core Version:    0.7.0.1
 */