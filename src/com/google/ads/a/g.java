package com.google.ads.a;

import com.google.ads.util.d;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g
{
  protected void a() {}
  
  public void a(Map paramMap)
  {
    Object localObject1 = new HashMap();
    for (localObject2 : getClass().getFields())
    {
      i locali = (i)((Field)localObject2).getAnnotation(i.class);
      if (locali != null) {
        ((Map)localObject1).put(locali.a(), localObject2);
      }
    }
    if (((Map)localObject1).isEmpty()) {
      d.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
    }
    ??? = paramMap.entrySet().iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)???).next();
      localObject3 = (Field)((Map)localObject1).remove(((Map.Entry)localObject2).getKey());
      if (localObject3 != null) {
        try
        {
          ((Field)localObject3).set(this, ((Map.Entry)localObject2).getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          d.b("Server Option '" + (String)((Map.Entry)localObject2).getKey() + "' could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          d.b("Server Option '" + (String)((Map.Entry)localObject2).getKey() + "' could not be set: Bad Type");
        }
      } else {
        d.e("Unexpected Server Option: " + (String)((Map.Entry)localObject2).getKey() + " = '" + (String)((Map.Entry)localObject2).getValue() + "'");
      }
    }
    Object localObject3 = null;
    localObject1 = ((Map)localObject1).values().iterator();
    if (((Iterator)localObject1).hasNext())
    {
      ??? = (Field)((Iterator)localObject1).next();
      if (!((i)((Field)???).getAnnotation(i.class)).b()) {
        break label496;
      }
      d.b("Required Server Option missing: " + ((i)((Field)???).getAnnotation(i.class)).a());
      localObject2 = new StringBuilder();
      if (localObject3 == null) {
        localObject3 = "";
      }
    }
    label399:
    label496:
    for (Object localObject2 = (String)localObject3 + ((i)((Field)???).getAnnotation(i.class)).a();; localObject2 = localObject3)
    {
      localObject3 = localObject2;
      break;
      localObject3 = (String)localObject3 + ", ";
      break label399;
      if (localObject3 != null) {
        throw new h("Required Server Option(s) missing: " + (String)localObject3);
      }
      a();
      return;
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.a.g
 * JD-Core Version:    0.7.0.1
 */