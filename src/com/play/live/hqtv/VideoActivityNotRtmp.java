package com.play.live.hqtv;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivityNotRtmp
  extends Activity
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener
{
  String a = "VideoActivity";
  private VideoView b;
  private String c;
  private ProgressDialog d;
  
  private void a()
  {
    if (this.d == null)
    {
      this.d = new ProgressDialog(this);
      this.d.setMessage("Loading...");
      this.d.setCancelable(false);
    }
    this.d.show();
  }
  
  private void a(String paramString)
  {
    if (this.d != null) {
      this.d.dismiss();
    }
    try
    {
      this.b.start();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Log.e(this.a, "IllegalArgumentException occurred while playing video, error code :: " + localIllegalArgumentException.getMessage());
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        Log.e(this.a, "IllegalStateException occurred while playing video, error code :: " + localIllegalStateException.getMessage());
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e(this.a, "Exception occurred while playing video, error code :: " + localException.getMessage());
      }
    }
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    if (getIntent() == null)
    {
      Toast.makeText(this, "Url not found", 0).show();
      finish();
    }
    else
    {
      this.c = getIntent().getStringExtra("path");
      this.b = ((VideoView)findViewById(2131230722));
      this.b.setMediaController(new MediaController(this));
      this.b.setVideoURI(Uri.parse(this.c));
      this.b.setOnPreparedListener(this);
      this.b.setOnCompletionListener(this);
      this.b.setOnErrorListener(this);
      a();
      this.b.requestFocus();
    }
  }
  
  protected void onDestroy()
  {
    if (this.d != null)
    {
      this.d.dismiss();
      this.d = null;
    }
    this.b = null;
    this.c = null;
    super.onDestroy();
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Log.e(this.a, "Error occurred while playing video, error code :: " + paramInt2);
    return false;
  }
  
  protected void onPause()
  {
    if ((this.b != null) && (this.b.isPlaying())) {
      this.b.pause();
    }
    super.onPause();
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    a(this.c);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.VideoActivityNotRtmp
 * JD-Core Version:    0.7.0.1
 */