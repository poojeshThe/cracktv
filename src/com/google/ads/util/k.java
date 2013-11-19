package com.google.ads.util;

import android.os.Build;

class k
{
  static final k d = new k();
  static final k e = new k("unknown", "generic", "generic");
  public final String a;
  public final String b;
  public final String c;
  
  k()
  {
    this.a = Build.BOARD;
    this.b = Build.DEVICE;
    this.c = Build.BRAND;
  }
  
  k(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    boolean bool;
    if (paramString1 == null)
    {
      if (paramString1 != paramString2) {
        bool = false;
      } else {
        bool = true;
      }
    }
    else {
      bool = paramString1.equals(paramString2);
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if ((paramObject instanceof k))
    {
      k localk = (k)paramObject;
      if ((a(this.a, localk.a)) && (a(this.b, localk.b)) && (a(this.c, localk.c))) {
        bool = true;
      }
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = 0;
    if (this.a != null) {
      i = 0 + this.a.hashCode();
    }
    if (this.b != null) {
      i += this.b.hashCode();
    }
    if (this.c != null) {
      i += this.c.hashCode();
    }
    return i;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.k
 * JD-Core Version:    0.7.0.1
 */