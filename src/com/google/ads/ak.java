package com.google.ads;

import com.google.ads.util.d;

class ak
  implements Runnable
{
  ak(aj paramaj) {}
  
  public void run()
  {
    if (this.a.h()) {
      com.google.ads.util.b.a(aj.a(this.a));
    }
    try
    {
      aj.a(this.a).a();
      d.a("Called destroy() for adapter with class: " + aj.a(this.a).getClass().getName());
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        d.b("Error while destroying adapter (" + this.a.f() + "):", localThrowable);
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ak
 * JD-Core Version:    0.7.0.1
 */