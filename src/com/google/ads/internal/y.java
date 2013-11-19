package com.google.ads.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import com.google.ads.util.d;
import java.util.ArrayList;
import java.util.Iterator;

public class y
  implements GestureOverlayView.OnGesturePerformedListener
{
  private final GestureStore a;
  private Activity b;
  private p c;
  
  public y(Activity paramActivity, p paramp, GestureStore paramGestureStore)
  {
    this.b = paramActivity;
    this.c = paramp;
    this.a = paramGestureStore;
  }
  
  public void onGesturePerformed(GestureOverlayView paramGestureOverlayView, Gesture paramGesture)
  {
    ArrayList localArrayList = this.a.recognize(paramGesture);
    Iterator localIterator = localArrayList.iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if (localArrayList.size() != 0)
        {
          if ((((Prediction)localArrayList.get(0)).score > 2.0D) && ("debug".equals(((Prediction)localArrayList.get(0)).name)) && (this.c != null))
          {
            if (this.c.b() != null) {
              localObject = this.c.b();
            } else {
              localObject = "[No diagnostics available]";
            }
            new AlertDialog.Builder(this.b).setMessage((CharSequence)localObject).setTitle("Ad Information").setPositiveButton("Share", new aa(this, (String)localObject)).setNegativeButton("Close", new z(this)).create().show();
          }
        }
        else {
          d.a("Gesture: No remotely reasonable predictions");
        }
        return;
      }
      Object localObject = (Prediction)localIterator.next();
      d.a("Gesture: '" + ((Prediction)localObject).name + "' = " + ((Prediction)localObject).score);
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.internal.y
 * JD-Core Version:    0.7.0.1
 */