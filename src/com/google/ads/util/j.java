package com.google.ads.util;

public class j
  extends h
{
  private static final byte[] h;
  private static final byte[] i;
  public int c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  private final byte[] j;
  private int k;
  private final byte[] l;
  
  static
  {
    boolean bool;
    if (g.class.desiredAssertionStatus()) {
      bool = false;
    } else {
      bool = true;
    }
    g = bool;
    byte[] arrayOfByte = new byte[64];
    arrayOfByte[0] = 65;
    arrayOfByte[1] = 66;
    arrayOfByte[2] = 67;
    arrayOfByte[3] = 68;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 70;
    arrayOfByte[6] = 71;
    arrayOfByte[7] = 72;
    arrayOfByte[8] = 73;
    arrayOfByte[9] = 74;
    arrayOfByte[10] = 75;
    arrayOfByte[11] = 76;
    arrayOfByte[12] = 77;
    arrayOfByte[13] = 78;
    arrayOfByte[14] = 79;
    arrayOfByte[15] = 80;
    arrayOfByte[16] = 81;
    arrayOfByte[17] = 82;
    arrayOfByte[18] = 83;
    arrayOfByte[19] = 84;
    arrayOfByte[20] = 85;
    arrayOfByte[21] = 86;
    arrayOfByte[22] = 87;
    arrayOfByte[23] = 88;
    arrayOfByte[24] = 89;
    arrayOfByte[25] = 90;
    arrayOfByte[26] = 97;
    arrayOfByte[27] = 98;
    arrayOfByte[28] = 99;
    arrayOfByte[29] = 100;
    arrayOfByte[30] = 101;
    arrayOfByte[31] = 102;
    arrayOfByte[32] = 103;
    arrayOfByte[33] = 104;
    arrayOfByte[34] = 105;
    arrayOfByte[35] = 106;
    arrayOfByte[36] = 107;
    arrayOfByte[37] = 108;
    arrayOfByte[38] = 109;
    arrayOfByte[39] = 110;
    arrayOfByte[40] = 111;
    arrayOfByte[41] = 112;
    arrayOfByte[42] = 113;
    arrayOfByte[43] = 114;
    arrayOfByte[44] = 115;
    arrayOfByte[45] = 116;
    arrayOfByte[46] = 117;
    arrayOfByte[47] = 118;
    arrayOfByte[48] = 119;
    arrayOfByte[49] = 120;
    arrayOfByte[50] = 121;
    arrayOfByte[51] = 122;
    arrayOfByte[52] = 48;
    arrayOfByte[53] = 49;
    arrayOfByte[54] = 50;
    arrayOfByte[55] = 51;
    arrayOfByte[56] = 52;
    arrayOfByte[57] = 53;
    arrayOfByte[58] = 54;
    arrayOfByte[59] = 55;
    arrayOfByte[60] = 56;
    arrayOfByte[61] = 57;
    arrayOfByte[62] = 43;
    arrayOfByte[63] = 47;
    h = arrayOfByte;
    arrayOfByte = new byte[64];
    arrayOfByte[0] = 65;
    arrayOfByte[1] = 66;
    arrayOfByte[2] = 67;
    arrayOfByte[3] = 68;
    arrayOfByte[4] = 69;
    arrayOfByte[5] = 70;
    arrayOfByte[6] = 71;
    arrayOfByte[7] = 72;
    arrayOfByte[8] = 73;
    arrayOfByte[9] = 74;
    arrayOfByte[10] = 75;
    arrayOfByte[11] = 76;
    arrayOfByte[12] = 77;
    arrayOfByte[13] = 78;
    arrayOfByte[14] = 79;
    arrayOfByte[15] = 80;
    arrayOfByte[16] = 81;
    arrayOfByte[17] = 82;
    arrayOfByte[18] = 83;
    arrayOfByte[19] = 84;
    arrayOfByte[20] = 85;
    arrayOfByte[21] = 86;
    arrayOfByte[22] = 87;
    arrayOfByte[23] = 88;
    arrayOfByte[24] = 89;
    arrayOfByte[25] = 90;
    arrayOfByte[26] = 97;
    arrayOfByte[27] = 98;
    arrayOfByte[28] = 99;
    arrayOfByte[29] = 100;
    arrayOfByte[30] = 101;
    arrayOfByte[31] = 102;
    arrayOfByte[32] = 103;
    arrayOfByte[33] = 104;
    arrayOfByte[34] = 105;
    arrayOfByte[35] = 106;
    arrayOfByte[36] = 107;
    arrayOfByte[37] = 108;
    arrayOfByte[38] = 109;
    arrayOfByte[39] = 110;
    arrayOfByte[40] = 111;
    arrayOfByte[41] = 112;
    arrayOfByte[42] = 113;
    arrayOfByte[43] = 114;
    arrayOfByte[44] = 115;
    arrayOfByte[45] = 116;
    arrayOfByte[46] = 117;
    arrayOfByte[47] = 118;
    arrayOfByte[48] = 119;
    arrayOfByte[49] = 120;
    arrayOfByte[50] = 121;
    arrayOfByte[51] = 122;
    arrayOfByte[52] = 48;
    arrayOfByte[53] = 49;
    arrayOfByte[54] = 50;
    arrayOfByte[55] = 51;
    arrayOfByte[56] = 52;
    arrayOfByte[57] = 53;
    arrayOfByte[58] = 54;
    arrayOfByte[59] = 55;
    arrayOfByte[60] = 56;
    arrayOfByte[61] = 57;
    arrayOfByte[62] = 45;
    arrayOfByte[63] = 95;
    i = arrayOfByte;
  }
  
  public j(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    boolean bool2;
    if ((paramInt & 0x1) != 0) {
      bool2 = false;
    } else {
      bool2 = bool1;
    }
    this.d = bool2;
    if ((paramInt & 0x2) != 0) {
      bool2 = false;
    } else {
      bool2 = bool1;
    }
    this.e = bool2;
    if ((paramInt & 0x4) == 0) {
      bool1 = false;
    }
    this.f = bool1;
    byte[] arrayOfByte;
    if ((paramInt & 0x8) != 0) {
      arrayOfByte = i;
    } else {
      arrayOfByte = h;
    }
    this.l = arrayOfByte;
    this.j = new byte[2];
    this.c = 0;
    int m;
    if (!this.e) {
      m = -1;
    } else {
      m = 19;
    }
    this.k = m;
  }
  
  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte2 = this.l;
    byte[] arrayOfByte1 = this.a;
    byte[] arrayOfByte4 = 0;
    int n = this.k;
    int m = paramInt2 + paramInt1;
    int i3 = -1;
    switch (this.c)
    {
    case 0: 
      i1 = paramInt1;
      break;
    case 1: 
      if (paramInt1 + 2 <= m)
      {
        i2 = (0xFF & this.j[0]) << 16;
        i1 = paramInt1 + 1;
        i3 = i2 | (0xFF & paramArrayOfByte[paramInt1]) << 8;
        i2 = i1 + 1;
        i3 |= 0xFF & paramArrayOfByte[i1];
        this.c = 0;
        i1 = i2;
      }
      break;
    case 2: 
      if (paramInt1 + 1 <= m) {
        break label154;
      }
    }
    int i1 = paramInt1;
    break label205;
    label154:
    int i2 = (0xFF & this.j[0]) << 16 | (0xFF & this.j[1]) << 8;
    i1 = paramInt1 + 1;
    i3 = i2 | 0xFF & paramArrayOfByte[paramInt1];
    this.c = 0;
    label205:
    if (i3 != -1)
    {
      arrayOfByte1[arrayOfByte4] = arrayOfByte2[(0x3F & i3 >> 18)];
      arrayOfByte1[1] = arrayOfByte2[(0x3F & i3 >> 12)];
      arrayOfByte1[2] = arrayOfByte2[(0x3F & i3 >> 6)];
      arrayOfByte4 = 4;
      arrayOfByte1[3] = arrayOfByte2[(i3 & 0x3F)];
      n--;
      if (n == 0)
      {
        if (!this.f)
        {
          n = arrayOfByte4;
        }
        else
        {
          n = 5;
          arrayOfByte1[arrayOfByte4] = 13;
        }
        arrayOfByte4 = n + 1;
        arrayOfByte1[n] = 10;
        n = 19;
        arrayOfByte4 = arrayOfByte4;
      }
    }
    for (;;)
    {
      byte[] arrayOfByte3;
      if (i1 + 3 > m)
      {
        if (!paramBoolean)
        {
          if (i1 != m - 1)
          {
            if (i1 == m - 2)
            {
              arrayOfByte1 = this.j;
              m = this.c;
              this.c = (m + 1);
              arrayOfByte1[m] = paramArrayOfByte[i1];
              arrayOfByte1 = this.j;
              m = this.c;
              this.c = (m + 1);
              arrayOfByte1[m] = paramArrayOfByte[(i1 + 1)];
            }
          }
          else
          {
            arrayOfByte1 = this.j;
            m = this.c;
            this.c = (m + 1);
            arrayOfByte1[m] = paramArrayOfByte[i1];
          }
        }
        else
        {
          int i4;
          if (i1 - this.c != m - 1)
          {
            if (i1 - this.c != m - 2)
            {
              if ((this.e) && (arrayOfByte4 > 0) && (n != 19))
              {
                if (!this.f)
                {
                  arrayOfByte2 = arrayOfByte4;
                }
                else
                {
                  arrayOfByte3 = arrayOfByte4 + 1;
                  arrayOfByte1[arrayOfByte4] = 13;
                }
                arrayOfByte4 = arrayOfByte3 + 1;
                arrayOfByte1[arrayOfByte3] = 10;
              }
            }
            else
            {
              if (this.c <= 1)
              {
                i2 = i1 + 1;
                i3 = paramArrayOfByte[i1];
                i1 = i2;
                i2 = 0;
              }
              else
              {
                byte[] arrayOfByte5 = this.j;
                i2 = 1;
                i4 = arrayOfByte5[0];
              }
              i4 = (i4 & 0xFF) << 10;
              int i8;
              if (this.c <= 0)
              {
                i6 = i1 + 1;
                int i7 = paramArrayOfByte[i1];
                i1 = i6;
              }
              else
              {
                byte[] arrayOfByte7 = this.j;
                i6 = i2 + 1;
                i8 = arrayOfByte7[i2];
                i2 = i6;
              }
              i4 |= (i8 & 0xFF) << 2;
              this.c -= i2;
              i2 = arrayOfByte4 + 1;
              arrayOfByte1[arrayOfByte4] = arrayOfByte3[(0x3F & i4 >> 12)];
              int i6 = i2 + 1;
              arrayOfByte1[i2] = arrayOfByte3[(0x3F & i4 >> 6)];
              arrayOfByte4 = i6 + 1;
              arrayOfByte1[i6] = arrayOfByte3[(i4 & 0x3F)];
              if (!this.d)
              {
                arrayOfByte3 = arrayOfByte4;
              }
              else
              {
                arrayOfByte3 = arrayOfByte4 + 1;
                arrayOfByte1[arrayOfByte4] = 61;
              }
              if (this.e)
              {
                if (this.f)
                {
                  arrayOfByte4 = arrayOfByte3 + 1;
                  arrayOfByte1[arrayOfByte3] = 13;
                  arrayOfByte3 = arrayOfByte4;
                }
                arrayOfByte4 = arrayOfByte3 + 1;
                arrayOfByte1[arrayOfByte3] = 10;
                arrayOfByte3 = arrayOfByte4;
              }
              arrayOfByte4 = arrayOfByte3;
            }
          }
          else
          {
            if (this.c <= 0)
            {
              i2 = i1 + 1;
              i4 = paramArrayOfByte[i1];
              i1 = i2;
              i2 = 0;
            }
            else
            {
              byte[] arrayOfByte6 = this.j;
              i2 = 1;
              i5 = arrayOfByte6[0];
              i1 = i1;
            }
            int i5 = (i5 & 0xFF) << 4;
            this.c -= i2;
            i2 = arrayOfByte4 + 1;
            arrayOfByte1[arrayOfByte4] = arrayOfByte3[(0x3F & i5 >> 6)];
            arrayOfByte4 = i2 + 1;
            arrayOfByte1[i2] = arrayOfByte3[(i5 & 0x3F)];
            if (this.d)
            {
              arrayOfByte3 = arrayOfByte4 + 1;
              arrayOfByte1[arrayOfByte4] = 61;
              arrayOfByte4 = arrayOfByte3 + 1;
              arrayOfByte1[arrayOfByte3] = 61;
            }
            if (this.e)
            {
              if (this.f)
              {
                arrayOfByte3 = arrayOfByte4 + 1;
                arrayOfByte1[arrayOfByte4] = 13;
                arrayOfByte4 = arrayOfByte3;
              }
              arrayOfByte3 = arrayOfByte4 + 1;
              arrayOfByte1[arrayOfByte4] = 10;
              arrayOfByte4 = arrayOfByte3;
            }
            i1 = i1;
            arrayOfByte4 = arrayOfByte4;
          }
          if ((!g) && (this.c != 0)) {
            break label1064;
          }
          if ((!g) && (i1 != m)) {
            break label1056;
          }
        }
        this.b = arrayOfByte4;
        this.k = n;
        return true;
        label1056:
        throw new AssertionError();
        label1064:
        throw new AssertionError();
      }
      i2 = (0xFF & paramArrayOfByte[i1]) << 16 | (0xFF & paramArrayOfByte[(i1 + 1)]) << 8 | 0xFF & paramArrayOfByte[(i1 + 2)];
      arrayOfByte1[arrayOfByte4] = arrayOfByte3[(0x3F & i2 >> 18)];
      arrayOfByte1[(arrayOfByte4 + 1)] = arrayOfByte3[(0x3F & i2 >> 12)];
      arrayOfByte1[(arrayOfByte4 + 2)] = arrayOfByte3[(0x3F & i2 >> 6)];
      arrayOfByte1[(arrayOfByte4 + 3)] = arrayOfByte3[(i2 & 0x3F)];
      i1 += 3;
      arrayOfByte4 += 4;
      n -= 1;
      if (n != 0)
      {
        n = n;
        arrayOfByte4 = arrayOfByte4;
      }
      else
      {
        if (!this.f)
        {
          n = arrayOfByte4;
        }
        else
        {
          n = arrayOfByte4 + 1;
          arrayOfByte1[arrayOfByte4] = 13;
        }
        arrayOfByte4 = n + 1;
        arrayOfByte1[n] = 10;
        n = 19;
        arrayOfByte4 = arrayOfByte4;
      }
    }
  }
}


/* Location:           C:\Users\PJ\Desktop\get-apk-source_win\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.j
 * JD-Core Version:    0.7.0.1
 */