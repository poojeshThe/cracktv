package com.google.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.ads.internal.p;
import com.google.ads.internal.q;
import java.util.HashMap;

class x
  implements DialogInterface.OnClickListener
{
  private p a;
  
  public x(p paramp)
  {
    this.a = paramp;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("u", "market://details?id=com.google.android.apps.plus");
    AdActivity.a(this.a, new q("intent", localHashMap));
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.x
 * JD-Core Version:    0.7.0.1
 */