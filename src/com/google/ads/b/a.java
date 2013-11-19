package com.google.ads.b;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.d;
import java.util.Locale;
import java.util.Map;

public class a
  extends d
{
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private String i;
  private int j;
  private int k;
  private b l;
  private int m;
  private String n;
  
  private String a(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0xFFFFFF & paramInt);
    return String.format(localLocale, "#%06x", arrayOfObject);
  }
  
  public Map a(Context paramContext)
  {
    com.google.ads.a.a.a locala = (com.google.ads.a.a.a)a(com.google.ads.a.a.a.class);
    if (locala == null)
    {
      locala = new com.google.ads.a.a.a();
      a(locala);
    }
    if (this.b != null) {
      locala.e().put("q", this.b);
    }
    if (Color.alpha(this.c) != 0) {
      locala.e().put("bgcolor", a(this.c));
    }
    if ((Color.alpha(this.d) == 255) && (Color.alpha(this.e) == 255))
    {
      locala.e().put("gradientfrom", a(this.d));
      locala.e().put("gradientto", a(this.e));
    }
    if (Color.alpha(this.f) != 0) {
      locala.e().put("hcolor", a(this.f));
    }
    if (Color.alpha(this.g) != 0) {
      locala.e().put("dcolor", a(this.g));
    }
    if (Color.alpha(this.h) != 0) {
      locala.e().put("acolor", a(this.h));
    }
    if (this.i != null) {
      locala.e().put("font", this.i);
    }
    locala.e().put("headersize", Integer.toString(this.j));
    if (Color.alpha(this.k) != 0) {
      locala.e().put("bcolor", a(this.k));
    }
    if (this.l != null) {
      locala.e().put("btype", this.l.toString());
    }
    locala.e().put("bthick", Integer.toString(this.m));
    if (this.n != null) {
      locala.e().put("channel", this.n);
    }
    return super.a(paramContext);
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.b.a
 * JD-Core Version:    0.7.0.1
 */