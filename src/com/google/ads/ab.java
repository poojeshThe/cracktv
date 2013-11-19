package com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class ab
{
  private z a = null;
  private long b = -1L;
  
  public void a(z paramz, int paramInt)
  {
    this.a = paramz;
    this.b = (TimeUnit.MILLISECONDS.convert(paramInt, TimeUnit.SECONDS) + SystemClock.elapsedRealtime());
  }
  
  public boolean a()
  {
    boolean bool;
    if ((this.a == null) || (SystemClock.elapsedRealtime() >= this.b)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public z b()
  {
    return this.a;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ab
 * JD-Core Version:    0.7.0.1
 */