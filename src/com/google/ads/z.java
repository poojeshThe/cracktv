package com.google.ads;

import com.google.ads.internal.v;
import com.google.ads.util.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class z
{
  private static final Map a = Collections.unmodifiableMap(new aa());
  private final String b;
  private final String c;
  private final List d;
  private final Integer e;
  private final Integer f;
  private final List g;
  private final List h;
  private final List i;
  
  private z(String paramString1, String paramString2, List paramList1, Integer paramInteger1, Integer paramInteger2, List paramList2, List paramList3, List paramList4)
  {
    b.a(paramString1);
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList1;
    this.e = paramInteger1;
    this.f = paramInteger2;
    this.g = paramList2;
    this.h = paramList3;
    this.i = paramList4;
  }
  
  private static j a(JSONObject paramJSONObject)
  {
    String str2 = paramJSONObject.getString("id");
    String str1 = paramJSONObject.optString("allocation_id", null);
    Object localObject1 = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(((JSONArray)localObject1).length());
    List localList;
    for (int j = 0;; localList++)
    {
      if (j >= ((JSONArray)localObject1).length())
      {
        localList = a(paramJSONObject, "imp_urls");
        localObject1 = paramJSONObject.optJSONObject("data");
        Object localObject2 = new HashMap(0);
        Object localObject3;
        Iterator localIterator;
        if (localObject1 == null)
        {
          localObject3 = localObject2;
        }
        else
        {
          localObject3 = new HashMap(((JSONObject)localObject1).length());
          localIterator = ((JSONObject)localObject1).keys();
        }
        for (;;)
        {
          if (!localIterator.hasNext()) {
            return new j(str1, str2, localArrayList, localList, (HashMap)localObject3);
          }
          localObject2 = (String)localIterator.next();
          ((HashMap)localObject3).put(localObject2, ((JSONObject)localObject1).getString((String)localObject2));
        }
      }
      localArrayList.add(((JSONArray)localObject1).getString(localList));
    }
  }
  
  public static z a(String paramString)
  {
    Integer localInteger1 = null;
    Object localObject1 = new JSONObject(paramString);
    String str2 = ((JSONObject)localObject1).getString("qdata");
    String str1;
    if (!((JSONObject)localObject1).has("ad_type")) {
      str1 = null;
    } else {
      str1 = ((JSONObject)localObject1).getString("ad_type");
    }
    Object localObject2 = ((JSONObject)localObject1).getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(((JSONArray)localObject2).length());
    Integer localInteger2;
    for (int j = 0;; localInteger2++)
    {
      if (j >= ((JSONArray)localObject2).length())
      {
        Object localObject3 = ((JSONObject)localObject1).optJSONObject("settings");
        if (localObject3 == null)
        {
          localObject3 = null;
          localObject2 = null;
          localObject1 = null;
          localInteger1 = null;
          localInteger2 = null;
        }
        else
        {
          if (!((JSONObject)localObject3).has("refresh")) {
            localInteger2 = null;
          } else {
            localInteger2 = Integer.valueOf(((JSONObject)localObject3).getInt("refresh"));
          }
          if (((JSONObject)localObject3).has("ad_network_timeout_millis")) {
            localInteger1 = Integer.valueOf(((JSONObject)localObject3).getInt("ad_network_timeout_millis"));
          }
          localObject2 = a((JSONObject)localObject3, "imp_urls");
          localObject1 = a((JSONObject)localObject3, "click_urls");
          localObject3 = a((JSONObject)localObject3, "nofill_urls");
          localInteger1 = localInteger1;
        }
        return new z(str2, str1, localArrayList, localInteger2, localInteger1, (List)localObject2, (List)localObject1, (List)localObject3);
      }
      localArrayList.add(a(((JSONArray)localObject2).getJSONObject(localInteger2)));
    }
  }
  
  private static List a(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    ArrayList localArrayList;
    if (localJSONArray == null) {
      Object localObject1 = null;
    } else {
      localArrayList = new ArrayList(localJSONArray.length());
    }
    Object localObject2;
    for (int j = 0;; localObject2++)
    {
      if (j >= localJSONArray.length())
      {
        localObject2 = localArrayList;
        return localObject2;
      }
      localArrayList.add(localJSONArray.getString(localObject2));
    }
  }
  
  public boolean a()
  {
    boolean bool;
    if (this.f == null) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int b()
  {
    return this.f.intValue();
  }
  
  public String c()
  {
    return this.b;
  }
  
  public boolean d()
  {
    boolean bool;
    if (this.e == null) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int e()
  {
    return this.e.intValue();
  }
  
  public List f()
  {
    return this.d;
  }
  
  public List g()
  {
    return this.g;
  }
  
  public List h()
  {
    return this.h;
  }
  
  public List i()
  {
    return this.i;
  }
  
  public v j()
  {
    Object localObject;
    if (this.c != null)
    {
      if (!"interstitial".equals(this.c))
      {
        localObject = (g)a.get(this.c);
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = v.a((g)localObject);
        }
      }
      else
      {
        localObject = v.a;
      }
    }
    else {
      localObject = null;
    }
    return localObject;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.z
 * JD-Core Version:    0.7.0.1
 */