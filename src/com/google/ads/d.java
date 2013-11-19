package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.a.j;
import com.google.ads.util.AdUtil;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d
{
  public static final String a;
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
  private static Method c = null;
  private static Method d = null;
  private f e = null;
  private Date f = null;
  private Set g = null;
  private Map h = null;
  private final Map i = new HashMap();
  private Location j = null;
  private boolean k = false;
  private boolean l = false;
  private Set m = null;
  
  static
  {
    for (;;)
    {
      int i1;
      try
      {
        Method[] arrayOfMethod = Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods();
        int n = arrayOfMethod.length;
        i1 = 0;
        if (i1 < n)
        {
          Method localMethod = arrayOfMethod[i1];
          if ((localMethod.getName().equals("getInstance")) && (localMethod.getParameterTypes().length == 0)) {
            c = localMethod;
          } else if ((localMethod.getName().equals("getJoinIds")) && (localMethod.getParameterTypes().length == 0)) {
            d = localMethod;
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        com.google.ads.util.d.a("No Google Analytics: Library Not Found.");
        a = AdUtil.b("emulator");
        return;
        if ((c != null) && (d != null)) {
          continue;
        }
        c = null;
        d = null;
        com.google.ads.util.d.e("No Google Analytics: Library Incompatible.");
        continue;
      }
      catch (Throwable localThrowable)
      {
        com.google.ads.util.d.a("No Google Analytics: Error Loading Library");
        continue;
      }
      i1++;
    }
  }
  
  public d a(j paramj)
  {
    if (paramj != null) {
      this.i.put(paramj.getClass(), paramj);
    }
    return this;
  }
  
  public d a(Set paramSet)
  {
    this.g = paramSet;
    return this;
  }
  
  public Object a(Class paramClass)
  {
    return this.i.get(paramClass);
  }
  
  public Map a(Context paramContext)
  {
    int n = 1;
    HashMap localHashMap = new HashMap();
    if (this.g != null) {
      localHashMap.put("kw", this.g);
    }
    if (this.e != null) {
      localHashMap.put("cust_gender", Integer.valueOf(this.e.ordinal()));
    }
    if (this.f != null) {
      localHashMap.put("cust_age", b.format(this.f));
    }
    if (this.j != null) {
      localHashMap.put("uule", AdUtil.a(this.j));
    }
    if (this.k) {
      localHashMap.put("testing", Integer.valueOf(n));
    }
    if (b(paramContext)) {
      localHashMap.put("adtest", "on");
    }
    for (;;)
    {
      Object localObject2 = (com.google.ads.a.a.a)a(com.google.ads.a.a.a.class);
      Object localObject1;
      if ((localObject2 != null) && (((com.google.ads.a.a.a)localObject2).d()))
      {
        localHashMap.put("pto", Integer.valueOf(n));
        localObject1 = (com.google.ads.doubleclick.a)a(com.google.ads.doubleclick.a.class);
        if ((localObject1 == null) || (((com.google.ads.doubleclick.a)localObject1).e() == null) || (((com.google.ads.doubleclick.a)localObject1).e().isEmpty())) {
          break label444;
        }
        localHashMap.put("extras", ((com.google.ads.doubleclick.a)localObject1).e());
        label227:
        if (localObject1 != null)
        {
          localObject1 = ((com.google.ads.doubleclick.a)localObject1).a();
          if (!TextUtils.isEmpty((CharSequence)localObject1)) {
            localHashMap.put("ppid", localObject1);
          }
        }
        if (this.h != null) {
          localHashMap.put("mediation_extras", this.h);
        }
      }
      try
      {
        if (c != null)
        {
          localObject1 = c.invoke(null, new Object[0]);
          localObject1 = (Map)d.invoke(localObject1, new Object[0]);
          if ((localObject1 != null) && (((Map)localObject1).size() > 0)) {
            localHashMap.put("analytics_join_id", localObject1);
          }
        }
        return localHashMap;
        if (this.l) {
          continue;
        }
        if (AdUtil.c()) {}
        for (localObject2 = "AdRequest.TEST_EMULATOR";; localObject2 = "\"" + AdUtil.a(paramContext) + "\"")
        {
          com.google.ads.util.d.c("To get test ads on this device, call adRequest.addTestDevice(" + (String)localObject2 + ");");
          this.l = localObject1;
          break;
        }
        if (t.a(paramContext)) {}
        for (;;)
        {
          localHashMap.put("cipa", Integer.valueOf(localObject1));
          break;
          int i1 = 0;
        }
        label444:
        if ((localObject2 == null) || (((com.google.ads.a.a.a)localObject2).e() == null) || (((com.google.ads.a.a.a)localObject2).e().isEmpty())) {
          break label227;
        }
        localHashMap.put("extras", ((com.google.ads.a.a.a)localObject2).e());
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          com.google.ads.util.d.c("Internal Analytics Error:", localThrowable);
        }
      }
    }
  }
  
  public d b(Set paramSet)
  {
    this.m = paramSet;
    return this;
  }
  
  public boolean b(Context paramContext)
  {
    boolean bool = false;
    if (this.m != null)
    {
      String str = AdUtil.a(paramContext);
      if ((str != null) && (this.m.contains(str))) {
        bool = true;
      }
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.d
 * JD-Core Version:    0.7.0.1
 */