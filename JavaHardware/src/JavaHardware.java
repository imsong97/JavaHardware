import java.io.File;
import java.lang.management.*;

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
        System.out.println();

/*
==============================================================================================================================================
*/

        /* CPU 사용량 - 윈도우 동작X */
//        OperatingSystemMXBean osbean = ( OperatingSystemMXBean ) ManagementFactory.getOperatingSystemMXBean( );
//        RuntimeMXBean runbean = ManagementFactory.getRuntimeMXBean( );
//        long bfprocesstime = osbean.getProcessCpuTime();
//        long bfuptime = runbean.getUptime( );
//        long ncpus = osbean.getAvailableProcessors( );
//        for ( int i = 0 ; i < 1000000 ; ++i )
//        {
//            ncpus = osbean.getAvailableProcessors( );
//        }
//        long afprocesstime = osbean.getProcessCpuTime();
//        long afuptime = runbean.getUptime( );
//        float cal = ( afprocesstime - bfprocesstime ) / ( ( afuptime - bfuptime ) * 10000f );
//        float usage = Math.min( 99f , cal );
//        System.out.println( "Calculation: " + cal );
//        System.out.println( "CPU Usage: " + usage );


        /* 메모리 사용량 */
        MemoryMXBean membean = ManagementFactory.getMemoryMXBean( );
        MemoryUsage heap = membean.getHeapMemoryUsage( );
        System.out.println( "Heap Memory: " + heap.toString( ) );
        MemoryUsage nonheap = membean.getNonHeapMemoryUsage( );
        System.out.println( "NonHeap Memory: " + nonheap.toString( ) );

        ClassLoadingMXBean classbean = ManagementFactory.getClassLoadingMXBean( );
        System.out.println( "TotalLoadedClassCount: " + classbean.getTotalLoadedClassCount( ) );
        System.out.println( "LoadedClassCount: " + classbean.getLoadedClassCount( ) );
        System.out.println( "UnloadedClassCount: " + classbean.getUnloadedClassCount( ) );
        System.out.println();


        /* 디스크 사용량 */
        File root = null;
        try
        {
            root = new File( "C:/" );
            System.out.println( "Total  Space: " + root.getTotalSpace( ) );
            System.out.println( "Usable Space: " + root.getUsableSpace( ) );
            System.out.println();
        }
        catch ( Exception e )
        {
            e.printStackTrace( );
        }


        /* 스레드 사용 */
        ThreadMXBean tbean = ManagementFactory.getThreadMXBean( );
        long[] ids = tbean.getAllThreadIds( );
        System.out.println( "Thread Count: " + tbean.getThreadCount( ) );
        for ( long id : ids )
        {
            System.out.println( "Thread CPU Time(" + id + ")" + tbean.getThreadCpuTime( id ) );
            System.out.println( "Thread User Time(" + id + ")" + tbean.getThreadCpuTime( id ) );
        }
    }
}
