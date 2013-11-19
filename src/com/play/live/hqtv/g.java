package com.play.live.hqtv;

import android.content.Intent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g
  implements Runnable
{
  g(Splash paramSplash) {}
  
  public void run()
  {
    Object localObject = new Intent(this.a, Webview.class);
    this.a.startActivity((Intent)localObject);
    this.a.finish();
    if (this.a.c != null) {}
    try
    {
      Method localMethod = this.a.c;
      Splash localSplash = this.a;
      localObject = new Object[2];
      localObject[0] = Integer.valueOf(2130968577);
      localObject[1] = Integer.valueOf(2130968576);
      localMethod.invoke(localSplash, (Object[])localObject);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localIllegalArgumentException.printStackTrace();
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        localIllegalAccessException.printStackTrace();
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        localInvocationTargetException.printStackTrace();
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.g
 * JD-Core Version:    0.7.0.1
 */