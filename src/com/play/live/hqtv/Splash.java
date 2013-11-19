package com.play.live.hqtv;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import java.lang.reflect.Method;

public class Splash
  extends Activity
{
  Class a;
  Class[] b;
  Method c;
  
  public Splash()
  {
    Class[] arrayOfClass = new Class[2];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = Integer.TYPE;
    this.b = arrayOfClass;
    this.c = null;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    try
    {
      this.a = Class.forName("android.app.Activity");
      this.c = this.a.getDeclaredMethod("overridePendingTransition", this.b);
      new Handler().postDelayed(new g(this), 4000L);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.Splash
 * JD-Core Version:    0.7.0.1
 */