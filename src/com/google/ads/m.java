package com.google.ads;

import android.content.Context;
import java.net.HttpURLConnection;
import java.net.URL;

public class m
  implements Runnable
{
  private final Context a;
  private final String b;
  
  public m(String paramString, Context paramContext)
  {
    this.b = paramString;
    this.a = paramContext;
  }
  
  protected HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: new 33	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   7: ldc 36
    //   9: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_0
    //   13: getfield 17	com/google/ads/m:b	Ljava/lang/String;
    //   16: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: invokestatic 49	com/google/ads/util/d:a	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: new 22	java/net/URL
    //   29: dup
    //   30: aload_0
    //   31: getfield 17	com/google/ads/m:b	Ljava/lang/String;
    //   34: invokespecial 51	java/net/URL:<init>	(Ljava/lang/String;)V
    //   37: invokevirtual 53	com/google/ads/m:a	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   40: astore_1
    //   41: aload_1
    //   42: aload_0
    //   43: getfield 19	com/google/ads/m:a	Landroid/content/Context;
    //   46: invokestatic 58	com/google/ads/util/AdUtil:a	(Ljava/net/HttpURLConnection;Landroid/content/Context;)V
    //   49: aload_1
    //   50: iconst_1
    //   51: invokevirtual 62	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   54: aload_1
    //   55: invokevirtual 65	java/net/HttpURLConnection:connect	()V
    //   58: aload_1
    //   59: invokevirtual 69	java/net/HttpURLConnection:getResponseCode	()I
    //   62: istore_2
    //   63: iload_2
    //   64: sipush 200
    //   67: if_icmplt +10 -> 77
    //   70: iload_2
    //   71: sipush 300
    //   74: if_icmplt +37 -> 111
    //   77: new 33	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   84: ldc 71
    //   86: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: iload_2
    //   90: invokevirtual 74	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: ldc 76
    //   95: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: aload_0
    //   99: getfield 17	com/google/ads/m:b	Ljava/lang/String;
    //   102: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokestatic 79	com/google/ads/util/d:e	(Ljava/lang/String;)V
    //   111: aload_1
    //   112: invokevirtual 82	java/net/HttpURLConnection:disconnect	()V
    //   115: goto +37 -> 152
    //   118: astore_2
    //   119: aload_1
    //   120: invokevirtual 82	java/net/HttpURLConnection:disconnect	()V
    //   123: aload_2
    //   124: athrow
    //   125: astore_1
    //   126: new 33	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   133: ldc 84
    //   135: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload_0
    //   139: getfield 17	com/google/ads/m:b	Ljava/lang/String;
    //   142: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: aload_1
    //   149: invokestatic 88	com/google/ads/util/d:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   152: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	m
    //   40	80	1	localHttpURLConnection	HttpURLConnection
    //   125	24	1	localThrowable	java.lang.Throwable
    //   62	28	2	i	int
    //   118	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   41	111	118	finally
    //   0	41	125	java/lang/Throwable
    //   111	125	125	java/lang/Throwable
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.m
 * JD-Core Version:    0.7.0.1
 */