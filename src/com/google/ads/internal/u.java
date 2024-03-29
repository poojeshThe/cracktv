package com.google.ads.internal;

import android.os.SystemClock;
import com.google.ads.ai;
import com.google.ads.util.d;
import java.util.Iterator;
import java.util.LinkedList;

public class u
{
  private static long f = 0L;
  private static long g = 0L;
  private static long h = 0L;
  private static long i = 0L;
  private static long j = -1L;
  private final LinkedList a = new LinkedList();
  private long b;
  private long c;
  private long d;
  private final LinkedList e = new LinkedList();
  private boolean k = false;
  private boolean l = false;
  private String m;
  private long n;
  private final LinkedList o = new LinkedList();
  private final LinkedList p = new LinkedList();
  
  public u()
  {
    a();
  }
  
  public static long E()
  {
    long l1;
    if (j != -1L)
    {
      l1 = SystemClock.elapsedRealtime() - j;
    }
    else
    {
      j = SystemClock.elapsedRealtime();
      l1 = 0L;
    }
    return l1;
  }
  
  protected boolean A()
  {
    return this.l;
  }
  
  protected void B()
  {
    d.d("Interstitial no fill.");
    this.l = true;
  }
  
  public void C()
  {
    d.d("Landing page dismissed.");
    this.e.add(Long.valueOf(SystemClock.elapsedRealtime()));
  }
  
  protected String D()
  {
    return this.m;
  }
  
  /**
   * @deprecated
   */
  protected void a()
  {
    try
    {
      this.a.clear();
      this.b = 0L;
      this.c = 0L;
      this.d = 0L;
      this.e.clear();
      this.n = -1L;
      this.o.clear();
      this.p.clear();
      this.k = false;
      this.l = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public void a(ai paramai)
  {
    try
    {
      this.o.add(Long.valueOf(SystemClock.elapsedRealtime() - this.n));
      this.p.add(paramai);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(String paramString)
  {
    d.d("Prior impression ticket = " + paramString);
    this.m = paramString;
  }
  
  /**
   * @deprecated
   */
  public void b()
  {
    try
    {
      this.o.clear();
      this.p.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public void c()
  {
    try
    {
      this.n = SystemClock.elapsedRealtime();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  public String d()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.o.iterator();
      while (localIterator.hasNext())
      {
        long l1 = ((Long)localIterator.next()).longValue();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(l1);
      }
      str = localStringBuilder.toString();
    }
    finally {}
    String str;
    return str;
  }
  
  /**
   * @deprecated
   */
  public String e()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext())
      {
        ai localai = (ai)localIterator.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(localai.ordinal());
      }
      str = localObject.toString();
    }
    finally {}
    String str;
    return str;
  }
  
  protected void f()
  {
    d.d("Ad clicked.");
    this.a.add(Long.valueOf(SystemClock.elapsedRealtime()));
  }
  
  protected void g()
  {
    d.d("Ad request loaded.");
    this.b = SystemClock.elapsedRealtime();
  }
  
  /**
   * @deprecated
   */
  protected void h()
  {
    try
    {
      d.d("Ad request before rendering.");
      this.c = SystemClock.elapsedRealtime();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void i()
  {
    d.d("Ad request started.");
    this.d = SystemClock.elapsedRealtime();
    f = 1L + f;
  }
  
  protected long j()
  {
    long l1;
    if (this.a.size() == this.e.size()) {
      l1 = this.a.size();
    } else {
      l1 = -1L;
    }
    return l1;
  }
  
  protected String k()
  {
    if ((!this.a.isEmpty()) && (this.a.size() == this.e.size()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i1 = 0;; str++)
      {
        if (i1 >= this.a.size())
        {
          str = localStringBuilder.toString();
          break;
        }
        if (str != 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(Long.toString(((Long)this.e.get(str)).longValue() - ((Long)this.a.get(str)).longValue()));
      }
    }
    String str = null;
    return str;
  }
  
  protected String l()
  {
    if (!this.a.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i1 = 0;; str++)
      {
        if (i1 >= this.a.size())
        {
          str = localStringBuilder.toString();
          break;
        }
        if (str != 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(Long.toString(((Long)this.a.get(str)).longValue() - this.b));
      }
    }
    String str = null;
    return str;
  }
  
  protected long m()
  {
    return this.b - this.d;
  }
  
  /**
   * @deprecated
   */
  protected long n()
  {
    try
    {
      long l1 = this.c;
      long l2 = this.d;
      l1 -= l2;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected long o()
  {
    return f;
  }
  
  /**
   * @deprecated
   */
  protected long p()
  {
    try
    {
      long l1 = g;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void q()
  {
    try
    {
      d.d("Ad request network error");
      g = 1L + g;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void r()
  {
    try
    {
      g = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected long s()
  {
    try
    {
      long l1 = h;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void t()
  {
    try
    {
      h = 1L + h;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void u()
  {
    try
    {
      h = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected long v()
  {
    try
    {
      long l1 = i;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void w()
  {
    try
    {
      i = 1L + i;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /**
   * @deprecated
   */
  protected void x()
  {
    try
    {
      i = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected boolean y()
  {
    return this.k;
  }
  
  protected void z()
  {
    d.d("Interstitial network error.");
    this.k = true;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.u
 * JD-Core Version:    0.7.0.1
 */