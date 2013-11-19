package com.google.ads.internal;

import android.content.Context;
import com.google.ads.g;

public class v
{
  public static final v a = new v(null, true);
  private g b;
  private final boolean c;
  
  private v(g paramg, boolean paramBoolean)
  {
    this.b = paramg;
    this.c = paramBoolean;
  }
  
  public static v a(g paramg)
  {
    return a(paramg, null);
  }
  
  public static v a(g paramg, Context paramContext)
  {
    return new v(g.a(paramg, paramContext), false);
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public g b()
  {
    return this.b;
  }
  
  public void b(g paramg)
  {
    if (!this.c) {
      this.b = paramg;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.v
 * JD-Core Version:    0.7.0.1
 */