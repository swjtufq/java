/**
 * Created by fq on 2018/1/19.
 * 单例模式
 */
/**
 * 饿汉式
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){

	}
	public static Singleton getSingleton(){
		return singleton;
	}
}
 */
/**
 * 懒汉式 线程不安全
public class Singleton{
	private static Singleton singleton = null;
	private Singleton(){

	}
	public static Singleton getSingleton(){
		if(null == singleton)
			singleton = new Singleton();
		return singleton;
	}
}
 */
/**
 * 懒汉式 双重检测
public class Singleton{
	private volatile static Singleton singleton;
	private Singleton(){

	}
	public static Singleton getSingleton(){
		if(null == singleton){
			synchronized (Singleton.class){
				if(null == singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
 */
/**
 * 静态内部类单例
 */
public class Singleton{
	private static class SingletonHoler{
		private static Singleton singleton = new Singleton();
	}
	private Singleton(){

	}
	public static Singleton getSingleton(){
		return SingletonHoler.singleton;
	}
}