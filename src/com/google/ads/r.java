package com.google.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.d;
import java.lang.ref.WeakReference;

class r
  implements Runnable
{
  private final WeakReference a;
  private final WebView b;
  private final String c;
  
  public r(Activity paramActivity, WebView paramWebView, String paramString)
  {
    this.a = new WeakReference(paramActivity);
    this.c = paramString;
    this.b = paramWebView;
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        Uri localUri = Uri.withAppendedPath(o.a, this.c);
        Object localObject = (Activity)this.a.get();
        if (localObject == null)
        {
          d.a("Activity was null while getting the +1 button state.");
        }
        else
        {
          localObject = ((Activity)localObject).getContentResolver().query(localUri, o.c, null, null, null);
          if ((localObject != null) && (((Cursor)localObject).moveToFirst())) {
            if (((Cursor)localObject).getInt(((Cursor)localObject).getColumnIndex("has_plus1")) == 1)
            {
              boolean bool = true;
              this.b.post(new s(this.b, bool));
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        d.b("An unknown error occurred while updating the +1 state.", localThrowable);
      }
      int i = 0;
      continue;
      d.a("Google+ app not installed, showing ad as not +1'd");
      i = 0;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.r
 * JD-Core Version:    0.7.0.1
 */