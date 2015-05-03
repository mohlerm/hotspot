import java.util.List;
import java.util.ArrayList;
class DoesCompile {
  public static List<Long> measurements = new ArrayList<Long>();
  public static void main(String argv[]) {
    System.out.println("> START EXECUTION OF DoesCompile.main() <");
    double result = 0.0;
    for(int c = 0; c < 1000; c++) {
      result = method1(result);
      //result = method1(0); // more trivial version for better code caching
    }
    System.out.println("> SUM:"+Double.toString(result)+"\tAVG.TIME:"+Double.toString(calculateAverage(measurements)/1000000)+" ms <");
 // System.out.println("> FINISHED: Press any key to stop vm! <");
  //try {
   //       System.in.read();
    //  } catch (Exception e) {
     //     // TODO Auto-generated catch block
      //    e.printStackTrace();
     // }
  }

  public static double method1(double count) {
    double old = count;
    long start;
    long end;
    System.out.println("> START METHOD DoesCompile.method1() for " + Double.toString(old) + " <");
    start = System.nanoTime();
    for(int k = 0; k < 100000; k++) {
      count = count + 50000;
    }
    end = System.nanoTime();
    System.out.println("> TIME:"+Long.toString((end-start)/1000000)+" ms for " + Double.toString(old) + " <");
    measurements.add((Long)end-start);
    return count;
  }

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
