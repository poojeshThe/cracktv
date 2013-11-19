package com.google.ads.util;

public final class ad
  extends ab
{
  private boolean e = false;
  
  public ad(z paramz, String paramString)
  {
    super(paramz, paramString, null);
  }
  
  public ad(z paramz, String paramString, Object paramObject)
  {
    super(paramz, paramString, paramObject, null);
  }
  
  /**
   * @deprecated
   */
  public Object a()
  {
    try
    {
      Object localObject1 = this.a;
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }
  
  /**
   * @deprecated
   */
  public void a(Object paramObject)
  {
    try
    {
      d.d("State changed - " + this.d.toString() + "." + this.b + ": '" + paramObject + "' <-- '" + this.a + "'.");
      this.a = paramObject;
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(super.toString());
    String str;
    if (!this.e) {
      str = "";
    } else {
      str = " (*)";
    }
    return str;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.ad
 * JD-Core Version:    0.7.0.1
 */