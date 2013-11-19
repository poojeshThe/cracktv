package com.play.live.hqtv;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class a
{
  public static void a(Context paramContext, SharedPreferences.Editor paramEditor)
  {
    Dialog localDialog = new Dialog(paramContext);
    localDialog.setTitle("Rate  Play Live Tv");
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    Object localObject = new TextView(paramContext);
    ((TextView)localObject).setText("If you love using  Play Live Tv, please rate us!");
    ((TextView)localObject).setWidth(240);
    ((TextView)localObject).setPadding(4, 0, 4, 10);
    localLinearLayout.addView((View)localObject);
    localObject = new Button(paramContext);
    ((Button)localObject).setText("Rate  Play Live Tv");
    ((Button)localObject).setOnClickListener(new b(paramContext, localDialog));
    localLinearLayout.addView((View)localObject);
    localObject = new Button(paramContext);
    ((Button)localObject).setText("Remind Me, Later");
    ((Button)localObject).setOnClickListener(new c(paramEditor, localDialog));
    localLinearLayout.addView((View)localObject);
    localDialog.setContentView(localLinearLayout);
    localDialog.show();
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.play.live.hqtv.a
 * JD-Core Version:    0.7.0.1
 */