package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class z
{
  private static final Object a = new Object();
  private static int b = 0;
  private static HashMap c = new HashMap();
  private final ArrayList d = new ArrayList();
  public final int o;
  
  public z()
  {
    synchronized (a)
    {
      int i = b;
      b = i + 1;
      this.o = i;
      Integer localInteger = (Integer)c.get(getClass());
      if (localInteger == null)
      {
        c.put(getClass(), Integer.valueOf(1));
        d.d("State created: " + toString());
        return;
      }
      c.put(getClass(), Integer.valueOf(1 + localInteger.intValue()));
    }
  }
  
  private void a(ab paramab)
  {
    this.d.add(paramab);
  }
  
  protected void finalize()
  {
    synchronized (a)
    {
      c.put(getClass(), Integer.valueOf(-1 + ((Integer)c.get(getClass())).intValue()));
      super.finalize();
      return;
    }
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + this.o + "]";
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.z
 * JD-Core Version:    0.7.0.1
 */