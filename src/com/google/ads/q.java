package com.google.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.d;
import java.lang.ref.WeakReference;
import java.util.Date;

class q
  implements Runnable
{
  private final WeakReference a;
  private final SharedPreferences.Editor b;
  
  public q(Activity paramActivity)
  {
    this(paramActivity, null);
  }
  
  q(Activity paramActivity, SharedPreferences.Editor paramEditor)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramEditor;
  }
  
  private SharedPreferences.Editor a(Activity paramActivity)
  {
    SharedPreferences.Editor localEditor;
    if (this.b != null) {
      localEditor = this.b;
    } else {
      localEditor = PreferenceManager.getDefaultSharedPreferences(paramActivity.getApplicationContext()).edit();
    }
    return localEditor;
  }
  
  public void run()
  {
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject3 = (Activity)this.a.get();
        if (localObject3 == null)
        {
          d.a("Activity was null while making a doritos cookie request.");
        }
        else
        {
          Object localObject1 = ((Activity)localObject3).getContentResolver().query(o.b, o.d, null, null, null);
          if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst()) && (((Cursor)localObject1).getColumnNames().length > 0))
          {
            localObject1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(((Cursor)localObject1).getColumnName(0)));
            localObject3 = a((Activity)localObject3);
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              break label155;
            }
            ((SharedPreferences.Editor)localObject3).putString("drt", (String)localObject1);
            ((SharedPreferences.Editor)localObject3).putLong("drt_ts", new Date().getTime());
            ((SharedPreferences.Editor)localObject3).commit();
          }
        }
      }
      catch (Throwable localThrowable)
      {
        d.b("An unknown error occurred while sending a doritos request.", localThrowable);
      }
      d.a("Google+ app not installed, not storing doritos cookie");
      Object localObject2 = null;
      continue;
      label155:
      ((SharedPreferences.Editor)localObject3).putString("drt", "");
      ((SharedPreferences.Editor)localObject3).putLong("drt_ts", 0L);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.q
 * JD-Core Version:    0.7.0.1
 */