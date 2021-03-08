import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

public class JavaHardware {
    public static void main(String args[]) {
        System.out.println();

        /* 참고 사이트
        https://www.roseindia.net/java/beginners/OSInformation.shtml
        */

        String nameOS = "os.name";
        String versionOS = "os.version";
        String architectureOS = "os.arch";

        System.out.println(System.getProperty(nameOS));
        System.out.println(System.getProperty(versionOS));
        System.out.println(System.getProperty(architectureOS));
        System.out.println(System.getProperty("user.name"));

        /* 윈도우 동작X
        OperatingSystemMXBean osbean = ( OperatingSystemMXBean ) ManagementFactory.getOperatingSystemMXBean( );
        RuntimeMXBean runbean = ManagementFactory.getRuntimeMXBean( );
        long bfprocesstime = osbean.getProcessCpuTime();
        long bfuptime = runbean.getUptime( );
        long ncpus = osbean.getAvailableProcessors( );
        for ( int i = 0 ; i < 1000000 ; ++i )
        {
            ncpus = osbean.getAvailableProcessors( );
        }
        long afprocesstime = osbean.getProcessCpuTime();
        long afuptime = runbean.getUptime( );
        float cal = ( afprocesstime - bfprocesstime ) / ( ( afuptime - bfuptime ) * 10000f );
        float usage = Math.min( 99f , cal );
        System.out.println( "Calculation: " + cal );
        System.out.println( "CPU Usage: " + usage );
        */
    }
}
