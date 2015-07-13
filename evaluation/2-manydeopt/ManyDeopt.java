import java.util.List;
import java.util.ArrayList;
class ManyDeopt {

  static boolean VERBOSE = false;
  public static List<Long> measurements = new ArrayList<Long>();
  public static void main(String argv[]) {
    if(VERBOSE) System.out.println("> START EXECUTION OF ManyDeopt.main() <");
    long result = 0l;
    long classloadhack = 0l;
    Long.toString(classloadhack);
    for(int c = 0; c < 100; c++) {
      //result = method1(result) + method2(result);
      result = method1(result);
      //result = method1(0); // more trivial version for better code caching
    }
    if(VERBOSE) System.out.println("> SUM:"+Long.toString(result)+"\tAVG.TIME:"+Double.toString(calculateAverage(measurements)/1000000)+" ms <");
 // if(VERBOSE) System.out.println("> FINISHED: Press any key to stop vm! <");
  //try {
   //       System.in.read();
    //  } catch (Exception e) {
     //     // TODO Auto-generated catch block
      //    e.printStackTrace();
     // }
  }

  public static long method1(long count) {
    long start;
    long end;
    if(VERBOSE) System.out.println("> START METHOD TwoMethods.method1() for " + Long.toString(count) + " <");
    start = System.nanoTime();
    for(long k = 0l; k < 10000000l; k++) {


      if (count < 10000000l) {
        if(VERBOSE && count==00000000l) System.out.println("> Taking branch: " + 1+ " <");
        count = count + 1;
      } else if (count < 30000000l) {
        if(VERBOSE && count==10000000l) System.out.println("> Taking branch: " + 2+ " <");
        count = count + 2;
      } else if (count < 60000000l) {
        if(VERBOSE && count==30000000l) System.out.println("> Taking branch: " + 3+ " <");
        count = count + 3;
      } else if (count < 100000000l) {
        if(VERBOSE && count==60000000l) System.out.println("> Taking branch: " + 4+ " <");
        count = count + 4;
      } else if (count < 150000000l) {
        if(VERBOSE && count==100000000l) System.out.println("> Taking branch: " + 5+ " <");
        count = count + 5;
      } else if (count < 210000000l) {
        if(VERBOSE && count==150000000l) System.out.println("> Taking branch: " + 6+ " <");
        count = count + 6;
      } else if (count < 280000000l) {
        if(VERBOSE && count==210000000l) System.out.println("> Taking branch: " + 7+ " <");
        count = count + 7;
      } else if (count < 360000000l) {
        if(VERBOSE && count==280000000l) System.out.println("> Taking branch: " + 8+ " <");
        count = count + 8;
      } else if (count < 450000000l) {
        if(VERBOSE && count==360000000l) System.out.println("> Taking branch: " + 9+ " <");
        count = count + 9;
      } else if (count < 550000000l) {
        if(VERBOSE && count==450000000l) System.out.println("> Taking branch: " + 10+ " <");
        count = count + 10;
      } else if (count < 660000000l) {
        if(VERBOSE && count==550000000l) System.out.println("> Taking branch: " + 11+ " <");
        count = count + 11;
      } else if (count < 780000000l) {
        if(VERBOSE && count==660000000l) System.out.println("> Taking branch: " + 12+ " <");
        count = count + 12;
      } else if (count < 910000000l) {
        if(VERBOSE && count==780000000l) System.out.println("> Taking branch: " + 13+ " <");
        count = count + 13;
      } else if (count < 1050000000l) {
        if(VERBOSE && count==910000000l) System.out.println("> Taking branch: " + 14+ " <");
        count = count + 14;
      } else if (count < 1200000000l) {
        if(VERBOSE && count==1050000000l) System.out.println("> Taking branch: " + 15+ " <");
        count = count + 15;
      } else if (count < 1360000000l) {
        if(VERBOSE && count==1200000000l) System.out.println("> Taking branch: " + 16+ " <");
        count = count + 16;
      } else if (count < 1530000000l) {
        if(VERBOSE && count==1360000000l) System.out.println("> Taking branch: " + 17+ " <");
        count = count + 17;
      } else if (count < 1710000000l) {
        if(VERBOSE && count==1530000000l) System.out.println("> Taking branch: " + 18+ " <");
        count = count + 18;
      } else if (count < 1900000000l) {
        if(VERBOSE && count==1710000000l) System.out.println("> Taking branch: " + 19+ " <");
        count = count + 19;
      } else if (count < 2100000000l) {
        if(VERBOSE && count==1900000000l) System.out.println("> Taking branch: " + 20+ " <");
        count = count + 20;
      } else if (count < 2310000000l) {
        if(VERBOSE && count==2100000000l) System.out.println("> Taking branch: " + 21+ " <");
        count = count + 21;
      } else if (count < 2530000000l) {
        if(VERBOSE && count==2310000000l) System.out.println("> Taking branch: " + 22+ " <");
        count = count + 22;
      } else if (count < 2760000000l) {
        if(VERBOSE && count==2530000000l) System.out.println("> Taking branch: " + 23+ " <");
        count = count + 23;
      } else if (count < 3000000000l) {
        if(VERBOSE && count==2760000000l) System.out.println("> Taking branch: " + 24+ " <");
        count = count + 24;
      } else if (count < 3250000000l) {
        if(VERBOSE && count==3000000000l) System.out.println("> Taking branch: " + 25+ " <");
        count = count + 25;
      } else if (count < 3510000000l) {
        if(VERBOSE && count==3250000000l) System.out.println("> Taking branch: " + 26+ " <");
        count = count + 26;
      } else if (count < 3780000000l) {
        if(VERBOSE && count==3510000000l) System.out.println("> Taking branch: " + 27+ " <");
        count = count + 27;
      } else if (count < 4060000000l) {
        if(VERBOSE && count==3780000000l) System.out.println("> Taking branch: " + 28+ " <");
        count = count + 28;
      } else if (count < 4350000000l) {
        if(VERBOSE && count==4060000000l) System.out.println("> Taking branch: " + 29+ " <");
        count = count + 29;
      } else if (count < 4650000000l) {
        if(VERBOSE && count==4350000000l) System.out.println("> Taking branch: " + 30+ " <");
        count = count + 30;
      } else if (count < 4960000000l) {
        if(VERBOSE && count==4650000000l) System.out.println("> Taking branch: " + 31+ " <");
        count = count + 31;
      } else if (count < 5280000000l) {
        if(VERBOSE && count==4960000000l) System.out.println("> Taking branch: " + 32+ " <");
        count = count + 32;
      } else if (count < 5610000000l) {
        if(VERBOSE && count==5280000000l) System.out.println("> Taking branch: " + 33+ " <");
        count = count + 33;
      } else if (count < 5950000000l) {
        if(VERBOSE && count==5610000000l) System.out.println("> Taking branch: " + 34+ " <");
        count = count + 34;
      } else if (count < 6300000000l) {
        if(VERBOSE && count==5950000000l) System.out.println("> Taking branch: " + 35+ " <");
        count = count + 35;
      } else if (count < 6660000000l) {
        if(VERBOSE && count==6300000000l) System.out.println("> Taking branch: " + 36+ " <");
        count = count + 36;
      } else if (count < 7030000000l) {
        if(VERBOSE && count==6660000000l) System.out.println("> Taking branch: " + 37+ " <");
        count = count + 37;
      } else if (count < 7410000000l) {
        if(VERBOSE && count==7030000000l) System.out.println("> Taking branch: " + 38+ " <");
        count = count + 38;
      } else if (count < 7800000000l) {
        if(VERBOSE && count==7410000000l) System.out.println("> Taking branch: " + 39+ " <");
        count = count + 39;
      } else if (count < 8200000000l) {
        if(VERBOSE && count==7800000000l) System.out.println("> Taking branch: " + 40+ " <");
        count = count + 40;
      } else if (count < 8610000000l) {
        if(VERBOSE && count==8200000000l) System.out.println("> Taking branch: " + 41+ " <");
        count = count + 41;
      } else if (count < 9030000000l) {
        if(VERBOSE && count==8610000000l) System.out.println("> Taking branch: " + 42+ " <");
        count = count + 42;
      } else if (count < 9460000000l) {
        if(VERBOSE && count==9030000000l) System.out.println("> Taking branch: " + 43+ " <");
        count = count + 43;
      } else if (count < 9900000000l) {
        if(VERBOSE && count==9460000000l) System.out.println("> Taking branch: " + 44+ " <");
        count = count + 44;
      } else if (count < 10350000000l) {
        if(VERBOSE && count==9900000000l) System.out.println("> Taking branch: " + 45+ " <");
        count = count + 45;
      } else if (count < 10810000000l) {
        if(VERBOSE && count==10350000000l) System.out.println("> Taking branch: " + 46+ " <");
        count = count + 46;
      } else if (count < 11280000000l) {
        if(VERBOSE && count==10810000000l) System.out.println("> Taking branch: " + 47+ " <");
        count = count + 47;
      } else if (count < 11760000000l) {
        if(VERBOSE && count==11280000000l) System.out.println("> Taking branch: " + 48+ " <");
        count = count + 48;
      } else if (count < 12250000000l) {
        if(VERBOSE && count==11760000000l) System.out.println("> Taking branch: " + 49+ " <");
        count = count + 49;
      } else if (count < 12750000000l) {
        if(VERBOSE && count==12250000000l) System.out.println("> Taking branch: " + 50+ " <");
        count = count + 50;
      } else if (count < 13260000000l) {
        if(VERBOSE && count==12750000000l) System.out.println("> Taking branch: " + 51+ " <");
        count = count + 51;
      } else if (count < 13780000000l) {
        if(VERBOSE && count==13260000000l) System.out.println("> Taking branch: " + 52+ " <");
        count = count + 52;
      } else if (count < 14310000000l) {
        if(VERBOSE && count==13780000000l) System.out.println("> Taking branch: " + 53+ " <");
        count = count + 53;
      } else if (count < 14850000000l) {
        if(VERBOSE && count==14310000000l) System.out.println("> Taking branch: " + 54+ " <");
        count = count + 54;
      } else if (count < 15400000000l) {
        if(VERBOSE && count==14850000000l) System.out.println("> Taking branch: " + 55+ " <");
        count = count + 55;
      } else if (count < 15960000000l) {
        if(VERBOSE && count==15400000000l) System.out.println("> Taking branch: " + 56+ " <");
        count = count + 56;
      } else if (count < 16530000000l) {
        if(VERBOSE && count==15960000000l) System.out.println("> Taking branch: " + 57+ " <");
        count = count + 57;
      } else if (count < 17110000000l) {
        if(VERBOSE && count==16530000000l) System.out.println("> Taking branch: " + 58+ " <");
        count = count + 58;
      } else if (count < 17700000000l) {
        if(VERBOSE && count==17110000000l) System.out.println("> Taking branch: " + 59+ " <");
        count = count + 59;
      } else if (count < 18300000000l) {
        if(VERBOSE && count==17700000000l) System.out.println("> Taking branch: " + 60+ " <");
        count = count + 60;
      } else if (count < 18910000000l) {
        if(VERBOSE && count==18300000000l) System.out.println("> Taking branch: " + 61+ " <");
        count = count + 61;
      } else if (count < 19530000000l) {
        if(VERBOSE && count==18910000000l) System.out.println("> Taking branch: " + 62+ " <");
        count = count + 62;
      } else if (count < 20160000000l) {
        if(VERBOSE && count==19530000000l) System.out.println("> Taking branch: " + 63+ " <");
        count = count + 63;
      } else if (count < 20800000000l) {
        if(VERBOSE && count==20160000000l) System.out.println("> Taking branch: " + 64+ " <");
        count = count + 64;
      } else if (count < 21450000000l) {
        if(VERBOSE && count==20800000000l) System.out.println("> Taking branch: " + 65+ " <");
        count = count + 65;
      } else if (count < 22110000000l) {
        if(VERBOSE && count==21450000000l) System.out.println("> Taking branch: " + 66+ " <");
        count = count + 66;
      } else if (count < 22780000000l) {
        if(VERBOSE && count==22110000000l) System.out.println("> Taking branch: " + 67+ " <");
        count = count + 67;
      } else if (count < 23460000000l) {
        if(VERBOSE && count==22780000000l) System.out.println("> Taking branch: " + 68+ " <");
        count = count + 68;
      } else if (count < 24150000000l) {
        if(VERBOSE && count==23460000000l) System.out.println("> Taking branch: " + 69+ " <");
        count = count + 69;
      } else if (count < 24850000000l) {
        if(VERBOSE && count==24150000000l) System.out.println("> Taking branch: " + 70+ " <");
        count = count + 70;
      } else if (count < 25560000000l) {
        if(VERBOSE && count==24850000000l) System.out.println("> Taking branch: " + 71+ " <");
        count = count + 71;
      } else if (count < 26280000000l) {
        if(VERBOSE && count==25560000000l) System.out.println("> Taking branch: " + 72+ " <");
        count = count + 72;
      } else if (count < 27010000000l) {
        if(VERBOSE && count==26280000000l) System.out.println("> Taking branch: " + 73+ " <");
        count = count + 73;
      } else if (count < 27750000000l) {
        if(VERBOSE && count==27010000000l) System.out.println("> Taking branch: " + 74+ " <");
        count = count + 74;
      } else if (count < 28500000000l) {
        if(VERBOSE && count==27750000000l) System.out.println("> Taking branch: " + 75+ " <");
        count = count + 75;
      } else if (count < 29260000000l) {
        if(VERBOSE && count==28500000000l) System.out.println("> Taking branch: " + 76+ " <");
        count = count + 76;
      } else if (count < 30030000000l) {
        if(VERBOSE && count==29260000000l) System.out.println("> Taking branch: " + 77+ " <");
        count = count + 77;
      } else if (count < 30810000000l) {
        if(VERBOSE && count==30030000000l) System.out.println("> Taking branch: " + 78+ " <");
        count = count + 78;
      } else if (count < 31600000000l) {
        if(VERBOSE && count==30810000000l) System.out.println("> Taking branch: " + 79+ " <");
        count = count + 79;
      } else if (count < 32400000000l) {
        if(VERBOSE && count==31600000000l) System.out.println("> Taking branch: " + 80+ " <");
        count = count + 80;
      } else if (count < 33210000000l) {
        if(VERBOSE && count==32400000000l) System.out.println("> Taking branch: " + 81+ " <");
        count = count + 81;
      } else if (count < 34030000000l) {
        if(VERBOSE && count==33210000000l) System.out.println("> Taking branch: " + 82+ " <");
        count = count + 82;
      } else if (count < 34860000000l) {
        if(VERBOSE && count==34030000000l) System.out.println("> Taking branch: " + 83+ " <");
        count = count + 83;
      } else if (count < 35700000000l) {
        if(VERBOSE && count==34860000000l) System.out.println("> Taking branch: " + 84+ " <");
        count = count + 84;
      } else if (count < 36550000000l) {
        if(VERBOSE && count==35700000000l) System.out.println("> Taking branch: " + 85+ " <");
        count = count + 85;
      } else if (count < 37410000000l) {
        if(VERBOSE && count==36550000000l) System.out.println("> Taking branch: " + 86+ " <");
        count = count + 86;
      } else if (count < 38280000000l) {
        if(VERBOSE && count==37410000000l) System.out.println("> Taking branch: " + 87+ " <");
        count = count + 87;
      } else if (count < 39160000000l) {
        if(VERBOSE && count==38280000000l) System.out.println("> Taking branch: " + 88+ " <");
        count = count + 88;
      } else if (count < 40050000000l) {
        if(VERBOSE && count==39160000000l) System.out.println("> Taking branch: " + 89+ " <");
        count = count + 89;
      } else if (count < 40950000000l) {
        if(VERBOSE && count==40050000000l) System.out.println("> Taking branch: " + 90+ " <");
        count = count + 90;
      } else if (count < 41860000000l) {
        if(VERBOSE && count==40950000000l) System.out.println("> Taking branch: " + 91+ " <");
        count = count + 91;
      } else if (count < 42780000000l) {
        if(VERBOSE && count==41860000000l) System.out.println("> Taking branch: " + 92+ " <");
        count = count + 92;
      } else if (count < 43710000000l) {
        if(VERBOSE && count==42780000000l) System.out.println("> Taking branch: " + 93+ " <");
        count = count + 93;
      } else if (count < 44650000000l) {
        if(VERBOSE && count==43710000000l) System.out.println("> Taking branch: " + 94+ " <");
        count = count + 94;
      } else if (count < 45600000000l) {
        if(VERBOSE && count==44650000000l) System.out.println("> Taking branch: " + 95+ " <");
        count = count + 95;
      } else if (count < 46560000000l) {
        if(VERBOSE && count==45600000000l) System.out.println("> Taking branch: " + 96+ " <");
        count = count + 96;
      } else if (count < 47530000000l) {
        if(VERBOSE && count==46560000000l) System.out.println("> Taking branch: " + 97+ " <");
        count = count + 97;
      } else if (count < 48510000000l) {
        if(VERBOSE && count==47530000000l) System.out.println("> Taking branch: " + 98+ " <");
        count = count + 98;
      } else if (count < 49500000000l) {
        if(VERBOSE && count==48510000000l) System.out.println("> Taking branch: " + 99+ " <");
        count = count + 99;
      } else if (count < 50500000000l) {
        if(VERBOSE && count==49500000000l) System.out.println("> Taking branch: " + 100+ " <");
        count = count + 100;
      }
    }
    end = System.nanoTime();
    if(VERBOSE) System.out.println("> TIME:"+Long.toString((end-start)/1000000)+" ms for " + Long.toString(count) + " <");
    measurements.add((Long)end-start);
    return count;
  }
/*
  public static double method2(double count) {
    double old = count;
    long start;
    long end;
    if(VERBOSE) System.out.println("> START METHOD TwoMethods.method2() for " + Double.toString(old) + " <");
    start = System.nanoTime();
    for(int k = 10000000; k > 0; k--) {
      count = count + 25000;
    }
    end = System.nanoTime();
    if(VERBOSE) System.out.println("> TIME:"+Long.toString((end-start)/1000000)+" ms for " + Double.toString(old) + " <");
    measurements.add((Long)end-start);
    return count;
  }
*/

  // returns average of a List<Long>
  private static double calculateAverage(List<Long> values) {
      Long sum = new Long(0);
      if(!values.isEmpty()) {
        for(Long value : values) {
          sum += value;
        }
        return (sum.doubleValue() / values.size());
      }
      return sum;
  }
}
//class A {
//  public void method() {
//    System.out.println("loaded a");
//  }
//
//}
