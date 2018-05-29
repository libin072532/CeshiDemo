package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ceshi {
	
 //线程池
	 public static void main(String[] args) {
		// new ThreadPoolExecutor(11, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler)
//		 int corePoolSize => 该线程池中核心线程数最大值
//		 int maximumPoolSize  => 该线程池中线程总数最大值
//		 long keepAliveTime => 该线程池中非核心线程闲置超时时长
//		 BlockingQueue<Runnable> workQueue  => SynchronousQueue;LinkedBlockingQueue;ArrayBlockingQueue;DelayQueue
//		 handler => 异常
//		 threadFactory => 取名
		 
//		 可缓存线程池： CachedThreadPool()
//		 线程数无限制
//		 有空闲线程则复用空闲线程，若无空闲线程则新建线程
//		 一定程序减少频繁创建/销毁线程，减少系统开销
		 ExecutorService executorService = Executors.newCachedThreadPool();
		 
//		 定长线程池：FixedThreadPool()
//		 可控制线程最大并发数（同时执行的线程数）
//		 超出的线程会在队列中等待
		 ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
		 
		
//		 定长线程池： ScheduledThreadPool()
//		 支持定时及周期性任务执行。
		 ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);
		 
		 
//		 单线程化的线程池：SingleThreadExecutor()
//		 有且仅有一个工作线程执行任务
//		 所有任务按照指定顺序执行，即遵循队列的入队出队规则


		//创建一个可重用固定线程数的线程池
	        ExecutorService pool = Executors. newSingleThreadExecutor();
	        //创建实现了Runnable接口对象
	        Thread tt1 = new MyThread();
	        Thread tt2 = new MyThread();
	        Thread tt3 = new MyThread();
	        Thread tt4 = new MyThread();
	        Thread tt5 = new MyThread();
	        //将线程放入池中并执行
	        pool.execute(tt1);
	        pool.execute(tt2);
	        pool.execute(tt3);
	        pool.execute(tt4);
	        pool.execute(tt5);
	        //关闭
	        pool.shutdown();
	    }
	 
	 
	 
	 
}
