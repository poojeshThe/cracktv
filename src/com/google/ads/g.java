package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class g
{
  public static final g a = new g(-1, -2, "mb");
  public static final g b = new g(320, 50, "mb");
  public static final g c = new g(300, 250, "as");
  public static final g d = new g(468, 60, "as");
  public static final g e = new g(728, 90, "as");
  public static final g f = new g(160, 600, "as");
  private final int g;
  private final int h;
  private boolean i;
  private boolean j;
  private boolean k;
  private String l;
  
  public g(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null);
    if (!f())
    {
      this.k = true;
    }
    else
    {
      this.k = false;
      this.l = "mb";
    }
  }
  
  private g(int paramInt1, int paramInt2, String paramString)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.l = paramString;
    boolean bool1;
    if (paramInt1 != -1) {
      bool1 = false;
    } else {
      bool1 = bool2;
    }
    this.i = bool1;
    if (paramInt2 != -2) {
      bool2 = false;
    }
    this.j = bool2;
    this.k = false;
  }
  
  private static int a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)(localDisplayMetrics.widthPixels / localDisplayMetrics.density);
  }
  
  public static g a(g paramg, Context paramContext)
  {
    if ((paramContext != null) && (paramg.f()))
    {
      int m;
      if (!paramg.i) {
        m = paramg.a();
      } else {
        m = a(paramContext);
      }
      int n;
      if (!paramg.j) {
        n = paramg.b();
      } else {
        n = b(paramContext);
      }
      g localg = new g(m, n, paramg.l);
      localg.j = paramg.j;
      localg.i = paramg.i;
      localg.k = paramg.k;
      paramg = localg;
    }
    else if (paramg.f())
    {
      paramg = b;
    }
    return paramg;
  }
  
  private static int b(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    int m = (int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density);
    if (m > 400)
    {
      if (m > 720) {
        m = 90;
      } else {
        m = 50;
      }
    }
    else {
      m = 32;
    }
    return m;
  }
  
  private boolean f()
  {
    boolean bool;
    if ((this.g >= 0) && (this.h >= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int a()
  {
    if (this.g >= 0) {
      return this.g;
    }
    throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
  }
  
  public int b()
  {
    if (this.h >= 0) {
      return this.h;
    }
    throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
  }
  
  public boolean c()
  {
    return this.i;
  }
  
  public boolean d()
  {
    return this.j;
  }
  
  public boolean e()
  {
    return this.k;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if ((paramObject instanceof g))
    {
      g localg = (g)paramObject;
      if ((this.g == localg.g) && (this.h == localg.h)) {
        bool = true;
      }
    }
    return bool;
  }
  
  public int hashCode()
  {
    return Integer.valueOf(this.g).hashCode() << 16 | 0xFFFF & Integer.valueOf(this.h).hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(a()).append("x").append(b());
    String str;
    if (this.l != null) {
      str = "_" + this.l;
    } else {
      str = "";
    }
    return str;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.g
 * JD-Core Version:    0.7.0.1
 */