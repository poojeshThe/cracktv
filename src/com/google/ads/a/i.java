package com.google.ads.a;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface i
{
  String a();
  
  boolean b() default true;
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.a.i
 * JD-Core Version:    0.7.0.1
 */