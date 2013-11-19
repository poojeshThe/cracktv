package com.google.ads.util;

import java.io.UnsupportedEncodingException;

public class g
{
  static
  {
    boolean bool;
    if (g.class.desiredAssertionStatus()) {
      bool = false;
    } else {
      bool = true;
    }
    a = bool;
  }
  
  public static byte[] a(String paramString)
  {
    return a(paramString.getBytes(), 0);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    i locali = new i(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (locali.a(paramArrayOfByte, paramInt1, paramInt2, true))
    {
      byte[] arrayOfByte;
      if (locali.b != locali.a.length)
      {
        arrayOfByte = new byte[locali.b];
        System.arraycopy(locali.a, 0, arrayOfByte, 0, locali.b);
      }
      else
      {
        arrayOfByte = locali.a;
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("bad base-64");
  }
  
  public static String b(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      String str = new String(c(paramArrayOfByte, paramInt), "US-ASCII");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    j localj = new j(paramInt3, null);
    int i = 4 * (paramInt2 / 3);
    if (!localj.d) {}
    switch (paramInt2 % 3)
    {
    default: 
      break;
    case 1: 
      i += 2;
      break;
    case 2: 
      i += 3;
      break;
      if (paramInt2 % 3 > 0) {
        i += 4;
      }
      break;
    }
    if ((localj.e) && (paramInt2 > 0))
    {
      int k = 1 + (paramInt2 - 1) / 57;
      int j;
      if (!localj.f) {
        j = 1;
      } else {
        j = 2;
      }
      i += j * k;
    }
    localj.a = new byte[i];
    localj.a(paramArrayOfByte, paramInt1, paramInt2, true);
    if ((a) || (localj.b == i)) {
      return localj.a;
    }
    throw new AssertionError();
  }
  
  public static byte[] c(byte[] paramArrayOfByte, int paramInt)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.g
 * JD-Core Version:    0.7.0.1
 */