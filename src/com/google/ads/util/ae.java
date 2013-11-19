package com.google.ads.util;

import java.lang.ref.WeakReference;

public final class ae
  extends ab
{
  public ae(z paramz, String paramString, Object paramObject)
  {
    super(paramz, paramString, new WeakReference(paramObject), null);
  }
  
  public Object a()
  {
    return ((WeakReference)this.a).get();
  }
  
  public String toString()
  {
    return this.d.toString() + "." + this.b + " = " + a() + " (?)";
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.ae
 * JD-Core Version:    0.7.0.1
 */