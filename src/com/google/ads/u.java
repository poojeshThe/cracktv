package com.google.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.q;
import com.google.ads.util.ac;
import com.google.ads.util.ae;
import java.util.HashMap;

public class u
  implements as
{
  public void a(com.google.ads.internal.p paramp, HashMap paramHashMap, WebView paramWebView)
  {
    Object localObject1 = (Context)paramp.g().f.a();
    Object localObject2 = (String)paramHashMap.get("a");
    if (localObject2 != null)
    {
      if (((String)localObject2).equals("resize")) {
        break label313;
      }
      if (((String)localObject2).equals("state")) {}
    }
    else
    {
      localObject2 = new Intent();
      ((Intent)localObject2).setComponent(new ComponentName("com.google.android.apps.plus", "com.google.android.apps.circles.platform.PlusOneActivity"));
      if (t.a((Intent)localObject2, (Context)localObject1))
      {
        AdActivity.a(paramp, new q("plusone", paramHashMap));
        return;
      }
      if (!t.a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.plus")), (Context)localObject1)) {
        return;
      }
      if ((TextUtils.isEmpty((CharSequence)paramHashMap.get("d"))) || (TextUtils.isEmpty((CharSequence)paramHashMap.get("o"))) || (TextUtils.isEmpty((CharSequence)paramHashMap.get("c"))))
      {
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("u", "market://details?id=com.google.android.apps.plus");
        AdActivity.a(paramp, new q("intent", (HashMap)localObject1));
        return;
      }
      localObject1 = new AlertDialog.Builder((Context)localObject1);
      ((AlertDialog.Builder)localObject1).setMessage((CharSequence)paramHashMap.get("d")).setPositiveButton((CharSequence)paramHashMap.get("o"), new x(paramp)).setNegativeButton((CharSequence)paramHashMap.get("c"), new v());
      ((AlertDialog.Builder)localObject1).create().show();
      return;
    }
    p.a((Activity)paramp.g().e.a(), paramWebView, (String)paramHashMap.get("u"));
    return;
    label313:
    p.a(paramWebView, (String)paramHashMap.get("u"));
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.u
 * JD-Core Version:    0.7.0.1
 */