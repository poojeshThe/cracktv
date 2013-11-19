package com.google.ads.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AdUtil$UserActivityReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!paramIntent.getAction().equals("android.intent.action.USER_PRESENT"))
    {
      if (paramIntent.getAction().equals("android.intent.action.SCREEN_OFF")) {
        AdUtil.a(false);
      }
    }
    else {
      AdUtil.a(true);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.AdUtil.UserActivityReceiver
 * JD-Core Version:    0.7.0.1
 */