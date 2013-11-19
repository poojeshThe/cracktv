package com.google.ads.internal;

import com.google.ads.util.d;

public final class g
  extends Exception
{
  public final boolean a;
  
  public g(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }
  
  public g(String paramString, boolean paramBoolean, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramBoolean;
  }
  
  public void a(String paramString)
  {
    d.b(c(paramString));
    d.a(null, this);
  }
  
  public void b(String paramString)
  {
    String str = c(paramString);
    if (!this.a) {
      this = null;
    }
    throw new RuntimeException(str, this);
  }
  
  public String c(String paramString)
  {
    if (this.a) {
      paramString = paramString + ": " + getMessage();
    }
    return paramString;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.g
 * JD-Core Version:    0.7.0.1
 */