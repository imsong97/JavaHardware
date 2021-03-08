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
    }
}
