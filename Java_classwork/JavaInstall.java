public class JavaInstall{
  public static void main(String[] args){

	
	String version = System.getProperty("java.version");
	System.out.println(version);

	String run = System.getProperty("java.runtime.version");
	System.out.println(run);

	String home = System.getProperty("java.home");
	System.out.println(home);

	String vendor = System.getProperty("java.vendor");
	System.out.println(vendor);

	String link = System.getProperty("java.vendor.url");
	System.out.print(link);

	String path = System.getProperty("java.class.path");
	System.out.print(path);
	}
}