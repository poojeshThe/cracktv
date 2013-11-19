package com.play.live.hqtv;

import android.content.Context;
import android.content.res.Resources;
import java.security.Key;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class f
{
  private Cipher a;
  private Cipher b;
  private byte[] c;
  private final int d;
  
  public f(Context paramContext)
  {
    Object localObject = new byte[8];
    localObject[0] = -7;
    localObject[1] = -102;
    localObject[2] = -60;
    localObject[3] = 50;
    localObject[4] = 86;
    localObject[5] = 53;
    localObject[6] = -30;
    localObject[7] = 19;
    this.c = ((byte[])localObject);
    this.d = 19;
    try
    {
      localObject = new PBEKeySpec(paramContext.getResources().getString(2131034114).toCharArray(), this.c, 19);
      localObject = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret((KeySpec)localObject);
      this.a = Cipher.getInstance(((SecretKey)localObject).getAlgorithm());
      this.b = Cipher.getInstance(((SecretKey)localObject).getAlgorithm());
      PBEParameterSpec localPBEParameterSpec = new PBEParameterSpec(this.c, 19);
      this.a.init(1, (Key)localObject, localPBEParameterSpec);
      this.b.init(2, (Key)localObject, localPBEParameterSpec);
      label158:
      return;
    }
    catch (Exception localException)
    {
      break label158;
    }
  }
  
  public String a(String paramString)
  {
    try
    {
      localObject = e.a(paramString);
      localObject = new String(this.b.doFinal((byte[])localObject), "UTF8");
      return localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.f
 * JD-Core Version:    0.7.0.1
 */