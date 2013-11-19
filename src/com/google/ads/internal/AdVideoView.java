package com.google.ads.internal;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.ads.util.d;
import com.google.ads.util.m;
import java.lang.ref.WeakReference;

public class AdVideoView
  extends FrameLayout
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener
{
  private static final c b = (c)c.a.b();
  public MediaController a;
  private WeakReference c;
  private AdWebView d;
  private long e;
  private VideoView f;
  private String g;
  
  public AdVideoView(Activity paramActivity, AdWebView paramAdWebView)
  {
    super(paramActivity);
    this.c = new WeakReference(paramActivity);
    this.d = paramAdWebView;
    this.f = new VideoView(paramActivity);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
    addView(this.f, localLayoutParams);
    this.a = null;
    this.g = null;
    this.e = 0L;
    a();
    this.f.setOnCompletionListener(this);
    this.f.setOnPreparedListener(this);
    this.f.setOnErrorListener(this);
  }
  
  protected void a()
  {
    new a(this).a();
  }
  
  public void a(int paramInt)
  {
    this.f.seekTo(paramInt);
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    this.f.onTouchEvent(paramMotionEvent);
  }
  
  public void b()
  {
    if (TextUtils.isEmpty(this.g)) {
      b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
    } else {
      this.f.setVideoPath(this.g);
    }
  }
  
  public void c()
  {
    this.f.pause();
  }
  
  public void d()
  {
    this.f.start();
  }
  
  public void e()
  {
    this.f.stopPlayback();
  }
  
  void f()
  {
    long l = this.f.getCurrentPosition();
    if (this.e != l)
    {
      float f1 = (float)l / 1000.0F;
      b.a(this.d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + f1 + "}");
      this.e = l;
    }
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    b.a(this.d, "onVideoEvent", "{'event': 'ended'}");
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    d.e("Video threw error! <what:" + paramInt1 + ", extra:" + paramInt2 + ">");
    b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': '" + paramInt1 + "', 'extra': '" + paramInt2 + "'}");
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    float f1 = this.f.getDuration() / 1000.0F;
    b.a(this.d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + f1 + "'}");
  }
  
  public void setMediaControllerEnabled(boolean paramBoolean)
  {
    Activity localActivity = (Activity)this.c.get();
    if (localActivity != null)
    {
      if (!paramBoolean)
      {
        if (this.a != null) {
          this.a.hide();
        }
        this.f.setMediaController(null);
      }
      else
      {
        if (this.a == null) {
          this.a = new MediaController(localActivity);
        }
        this.f.setMediaController(this.a);
      }
    }
    else {
      d.e("adActivity was null while trying to enable controls on a video.");
    }
  }
  
  public void setSrc(String paramString)
  {
    this.g = paramString;
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.AdVideoView
 * JD-Core Version:    0.7.0.1
 */