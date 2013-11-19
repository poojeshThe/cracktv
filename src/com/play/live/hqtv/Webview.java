package com.play.live.hqtv;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public class Webview
  extends Activity
{
  WebView a;
  ProgressBar b;
  private String c = "com.mxtech.videoplayer.ad";
  private String d = "com.mxtech.videoplayer.pro";
  private AlertDialog.Builder e;
  
  private void a()
  {
    this.e = new AlertDialog.Builder(this);
    this.e.setCancelable(false).setMessage("You Need Internet Connection  To Use App");
    this.e.setNegativeButton("OK", new j(this));
    this.e.show();
  }
  
  private void b()
  {
    getPackageManager().getLaunchIntentForPackage(this.c);
    getPackageManager().getLaunchIntentForPackage(this.d);
    if ((!a(this.c)) && (!a(this.d)))
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setMessage("Some Tv Channels Require Mx Player.  Install it now");
      localBuilder.setCancelable(true);
      localBuilder.setPositiveButton("Yes", new k(this));
      localBuilder.setNegativeButton("No", new l(this));
      localBuilder.create().show();
    }
  }
  
  private void b(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setComponent(new ComponentName("com.mxtech.videoplayer.ad", "com.mxtech.videoplayer.ad.ActivityScreen"));
    localIntent.setData(Uri.parse(paramString));
    Object localObject = new Intent("android.intent.action.VIEW");
    localIntent.putExtra("secure_uri", true);
    ((Intent)localObject).setComponent(new ComponentName("com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.ActivityScreen"));
    ((Intent)localObject).setData(Uri.parse(paramString));
    ((Intent)localObject).putExtra("secure_uri", true);
    if (!a(this.c))
    {
      if (!a(this.d))
      {
        localObject = new AlertDialog.Builder(this);
        ((AlertDialog.Builder)localObject).setMessage("You Must Install MX player to view this Channel install it now");
        ((AlertDialog.Builder)localObject).setCancelable(true);
        ((AlertDialog.Builder)localObject).setPositiveButton("Yes", new m(this));
        ((AlertDialog.Builder)localObject).setNegativeButton("No", new n(this));
        ((AlertDialog.Builder)localObject).create().show();
      }
      else
      {
        startActivity((Intent)localObject);
      }
    }
    else {
      startActivity(localIntent);
    }
  }
  
  public boolean a(String paramString)
  {
    Iterator localIterator = getPackageManager().getInstalledApplications(0).iterator();
    while (localIterator.hasNext()) {
      if (((ApplicationInfo)localIterator.next()).packageName.equals(paramString)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    b();
    if (!d.a(this))
    {
      a();
    }
    else
    {
      this.a = ((WebView)findViewById(2131230725));
      this.a.setHorizontalScrollBarEnabled(true);
      this.a.getSettings().setLoadsImagesAutomatically(true);
      this.a.getSettings().setAllowFileAccess(true);
      this.a.getSettings().setJavaScriptEnabled(true);
      setProgressBarVisibility(true);
      this.a.getSettings().setPluginsEnabled(true);
      this.a.getSettings().setSupportZoom(true);
      this.a.getSettings().setBuiltInZoomControls(true);
      this.a.getSettings().setUseWideViewPort(true);
      this.a.setInitialScale(1);
      if (paramBundle != null) {
        ((WebView)findViewById(2131230725)).restoreState(paramBundle);
      }
      f localf = new f(this);
      this.a.loadUrl(localf.a("50kkjBIIFksyf+tx0fRHcGrYAy4a3DUK9+xz9m5Mqhfi+gfS3b5oofGhFU/bYrgB97ux5+P3wkdY7zTLFn/yqrFhpkOeLHhE3ZAR8gEVxI4kN8b5SPCuxDx5ExwUgtamQHSEznS3YgrFHweBkAR3qlKxJpBI4Z2k5fWptYCOcNL7WIkNiDQU2sK+Tjm/NNc85d79pNVCVlpBLgFpqMugbEHV8X+Xyb/8"));
      Toast.makeText(this, " App Is Loading...", 0).show();
      this.a.setWebViewClient(new o(this, null));
      this.b = ((ProgressBar)findViewById(2131230724));
      this.a.setWebViewClient(new h(this));
      this.a.setWebChromeClient(new i(this));
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165184, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    this.e = null;
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (paramInt != 4)
    {
      bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
    else
    {
      if (!this.a.canGoBack()) {
        a.a(this, null);
      } else {
        this.a.goBack();
      }
      bool = true;
    }
    return bool;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    switch (paramMenuItem.getItemId())
    {
    default: 
      bool = super.onOptionsItemSelected(paramMenuItem);
      break;
    case 2131230727: 
      this.a.reload();
      break;
    case 2131230728: 
      String str = "Sharing from " + getString(2131034112) + ", " + getString(2131034118);
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("text/plain");
      localIntent.putExtra("android.intent.extra.TEXT", str);
      startActivity(Intent.createChooser(localIntent, "Share via"));
    }
    return bool;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.Webview
 * JD-Core Version:    0.7.0.1
 */