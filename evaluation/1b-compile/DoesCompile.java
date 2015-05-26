import java.util.List;
import java.util.ArrayList;
class DoesCompile {

  static boolean VERBOSE = false;
  public static List<Long> measurements = new ArrayList<Long>();
  public static void main(String argv[]) {
    if(VERBOSE) System.out.println("> START EXECUTION OF DoesCompile.main() <");
    double result = 0.0;
    for(int c = 0; c < 1000; c++) {
      result = method1(result); //+ method2(result);
      //result = method1(0); // more trivial version for better code caching
    }
    if(VERBOSE) System.out.println("> SUM:"+Double.toString(result)+"\tAVG.TIME:"+Double.toString(calculateAverage(measurements)/1000000)+" ms <");
  }

  public static double method1(double count) {
    long start;
    long end;
    if(VERBOSE) System.out.println("> START METHOD DoesCompile.method1() for " + Double.toString(count) + " <");
    start = System.nanoTime();
    for(int k = 0; k < 100000; k++) {
      count = count + 50000;
    }
    end = System.nanoTime();
    if(VERBOSE) System.out.println("> TIME:"+Long.toString((end-start)/1000000)+" ms for " + Double.toString(count) + " <");
    measurements.add((Long)end-start);
    return count;
  }

  //public static double method2(double count) {
  //  long start;
  //  long end;
  //  if(VERBOSE) System.out.println("> START METHOD DoesCompile.method2() for " + Double.toString(count) + " <");
  //  start = System.nanoTime();
  //  for(int k = 10000000; k > 0; k--) {
  //    count = count + 25000;
  //  }
  //  end = System.nanoTime();
  //  if(VERBOSE) System.out.println("> TIME:"+Long.toString((end-start)/1000000)+" ms for " + Double.toString(count) + " <");
  //  measurements.add((Long)end-start);
  //  return count;
  //}

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
