package com.google.ads.internal;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public class q
{
  private String a;
  private HashMap b;
  
  public q(Bundle paramBundle)
  {
    this.a = paramBundle.getString("action");
    this.b = a(paramBundle.getSerializable("params"));
  }
  
  public q(String paramString)
  {
    this.a = paramString;
  }
  
  public q(String paramString, HashMap paramHashMap)
  {
    this(paramString);
    this.b = paramHashMap;
  }
  
  private HashMap a(Serializable paramSerializable)
  {
    HashMap localHashMap;
    if (!(paramSerializable instanceof HashMap)) {
      localHashMap = null;
    } else {
      localHashMap = (HashMap)paramSerializable;
    }
    return localHashMap;
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", this.a);
    localBundle.putSerializable("params", this.b);
    return localBundle;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public HashMap c()
  {
    return this.b;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.q
 * JD-Core Version:    0.7.0.1
 */