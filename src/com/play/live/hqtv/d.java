package com.play.live.hqtv;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class d
{
  public static boolean a(Context paramContext)
  {
    boolean bool = false;
    Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localObject != null)
    {
      localObject = ((ConnectivityManager)localObject).getAllNetworkInfo();
      if (localObject != null)
      {
        int i = 0;
        while (i < localObject.length) {
          if ((localObject[i].getState() != NetworkInfo.State.CONNECTED) && (localObject[i].getState() != NetworkInfo.State.CONNECTING)) {
            i++;
          } else {
            bool = true;
          }
        }
      }
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.d
 * JD-Core Version:    0.7.0.1
 */