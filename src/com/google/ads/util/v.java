package com.google.ads.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class v
  implements DialogInterface.OnClickListener
{
  v(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.confirm(this.b.getText().toString());
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.v
 * JD-Core Version:    0.7.0.1
 */