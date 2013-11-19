package com.google.ads.util;

public abstract class ab
{
  protected Object a;
  protected final String b;
  
  private ab(z paramz, String paramString)
  {
    this(paramz, paramString, null);
  }
  
  private ab(z paramz, String paramString, Object paramObject)
  {
    this.b = paramString;
    z.a(paramz, this);
    this.a = paramObject;
  }
  
  public String toString()
  {
    return this.c.toString() + "." + this.b + " = " + this.a;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.ab
 * JD-Core Version:    0.7.0.1
 */