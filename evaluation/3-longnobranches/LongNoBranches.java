import java.util.Random;
class LongNoBranches {
  public static void main(String argv[]) {
    double result = 0.0;
    Random r = new Random();
    for(int c = 0;c<300;c++) {
      double x1 = 1000* r.nextDouble();
      result  = result + method1(x1);
      double x2 = 1000* r.nextDouble();
      result  = result + method2(x2);
      double x3 = 1000* r.nextDouble();
      result  = result + method3(x3);
      double x4 = 1000* r.nextDouble();
      result  = result + method4(x4);
      double x5 = 1000* r.nextDouble();
      result  = result + method5(x5);
      double x6 = 1000* r.nextDouble();
      result  = result + method6(x6);
      double x7 = 1000* r.nextDouble();
      result  = result + method7(x7);
      double x8 = 1000* r.nextDouble();
      result  = result + method8(x8);
      double x9 = 1000* r.nextDouble();
      result  = result + method9(x9);
      double x10 = 1000* r.nextDouble();
      result  = result + method10(x10);
    }
  System.out.println(">SUM:"+Double.toString(result));
  }

  public static double method1(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method2(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method3(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method4(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method5(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method6(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method7(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method8(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method9(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
  public static double method10(double x) {
    double count = 0.0;
    Random r = new Random();
    double m1 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m1;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m1;
      }
    double m2 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m2;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m2;
      }
    double m3 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m3;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m3;
      }
    double m4 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m4;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m4;
      }
    double m5 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m5;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m5;
      }
    double m6 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m6;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m6;
      }
    double m7 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m7;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m7;
      }
    double m8 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m8;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m8;
      }
    double m9 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m9;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m9;
      }
    double m10 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m10;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m10;
      }
    double m11 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m11;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m11;
      }
    double m12 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m12;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m12;
      }
    double m13 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m13;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m13;
      }
    double m14 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m14;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m14;
      }
    double m15 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m15;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m15;
      }
    double m16 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m16;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m16;
      }
    double m17 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m17;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m17;
      }
    double m18 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m18;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m18;
      }
    double m19 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m19;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m19;
      }
    double m20 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m20;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m20;
      }
    double m21 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m21;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m21;
      }
    double m22 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m22;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m22;
      }
    double m23 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m23;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m23;
      }
    double m24 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m24;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m24;
      }
    double m25 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m25;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m25;
      }
    double m26 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m26;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m26;
      }
    double m27 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m27;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m27;
      }
    double m28 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m28;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m28;
      }
    double m29 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m29;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m29;
      }
    double m30 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m30;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m30;
      }
    double m31 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m31;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m31;
      }
    double m32 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m32;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m32;
      }
    double m33 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m33;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m33;
      }
    double m34 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m34;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m34;
      }
    double m35 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m35;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m35;
      }
    double m36 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m36;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m36;
      }
    double m37 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m37;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m37;
      }
    double m38 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m38;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m38;
      }
    double m39 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m39;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m39;
      }
    double m40 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m40;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m40;
      }
    double m41 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m41;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m41;
      }
    double m42 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m42;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m42;
      }
    double m43 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m43;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m43;
      }
    double m44 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m44;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m44;
      }
    double m45 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m45;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m45;
      }
    double m46 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m46;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m46;
      }
    double m47 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m47;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m47;
      }
    double m48 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m48;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m48;
      }
    double m49 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m49;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m49;
      }
    double m50 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m50;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m50;
      }
    double m51 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m51;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m51;
      }
    double m52 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m52;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m52;
      }
    double m53 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m53;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m53;
      }
    double m54 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m54;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m54;
      }
    double m55 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m55;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m55;
      }
    double m56 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m56;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m56;
      }
    double m57 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m57;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m57;
      }
    double m58 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m58;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m58;
      }
    double m59 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m59;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m59;
      }
    double m60 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m60;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m60;
      }
    double m61 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m61;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m61;
      }
    double m62 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m62;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m62;
      }
    double m63 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m63;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m63;
      }
    double m64 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m64;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m64;
      }
    double m65 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m65;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m65;
      }
    double m66 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m66;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m66;
      }
    double m67 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m67;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m67;
      }
    double m68 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m68;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m68;
      }
    double m69 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m69;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m69;
      }
    double m70 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m70;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m70;
      }
    double m71 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m71;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m71;
      }
    double m72 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m72;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m72;
      }
    double m73 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m73;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m73;
      }
    double m74 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m74;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m74;
      }
    double m75 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m75;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m75;
      }
    double m76 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m76;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m76;
      }
    double m77 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m77;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m77;
      }
    double m78 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m78;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m78;
      }
    double m79 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m79;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m79;
      }
    double m80 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m80;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m80;
      }
    double m81 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m81;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m81;
      }
    double m82 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m82;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m82;
      }
    double m83 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m83;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m83;
      }
    double m84 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m84;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m84;
      }
    double m85 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m85;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m85;
      }
    double m86 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m86;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m86;
      }
    double m87 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m87;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m87;
      }
    double m88 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m88;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m88;
      }
    double m89 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m89;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m89;
      }
    double m90 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m90;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m90;
      }
    double m91 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m91;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m91;
      }
    double m92 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m92;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m92;
      }
    double m93 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m93;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m93;
      }
    double m94 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m94;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m94;
      }
    double m95 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m95;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m95;
      }
    double m96 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m96;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m96;
      }
    double m97 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m97;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m97;
      }
    double m98 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m98;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m98;
      }
    double m99 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m99;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m99;
      }
    double m100 = 10000* r.nextDouble();
      for(int k = 0;k<100;k++) {
        count = count + 10000 + m100;
      }
      for(int k = 0;k<100;k++) {
        count = count - 10000 - m100;
      }
    return count;
  }
}
