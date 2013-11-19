package com.google.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public class t
{
  public static boolean a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
    return a(localIntent, paramContext);
  }
  
  public static boolean a(Intent paramIntent, Context paramContext)
  {
    boolean bool;
    if (paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() <= 0) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.t
 * JD-Core Version:    0.7.0.1
 */