package com.google.ads.internal;

import android.os.Handler;
import com.google.ads.util.d;
import java.lang.ref.WeakReference;

class a
  implements Runnable
{
  private WeakReference a;
  private Handler b;
  
  public a(AdVideoView paramAdVideoView)
  {
    this.a = new WeakReference(paramAdVideoView);
    this.b = new Handler();
  }
  
  public void a()
  {
    this.b.postDelayed(this, 250L);
  }
  
  public void run()
  {
    AdVideoView localAdVideoView = (AdVideoView)this.a.get();
    if (localAdVideoView != null)
    {
      localAdVideoView.f();
      this.b.postDelayed(this, 250L);
    }
    else
    {
      d.d("The video must be gone, so cancelling the timeupdate task.");
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.a
 * JD-Core Version:    0.7.0.1
 */