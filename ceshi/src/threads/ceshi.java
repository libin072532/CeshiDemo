package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ceshi {
	
 //�̳߳�
	 public static void main(String[] args) {
		// new ThreadPoolExecutor(11, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler)
//		 int corePoolSize => ���̳߳��к����߳������ֵ
//		 int maximumPoolSize  => ���̳߳����߳��������ֵ
//		 long keepAliveTime => ���̳߳��зǺ����߳����ó�ʱʱ��
//		 BlockingQueue<Runnable> workQueue  => SynchronousQueue;LinkedBlockingQueue;ArrayBlockingQueue;DelayQueue
//		 handler => �쳣
//		 threadFactory => ȡ��
		 
//		 �ɻ����̳߳أ� CachedThreadPool()
//		 �߳���������
//		 �п����߳����ÿ����̣߳����޿����߳����½��߳�
//		 һ���������Ƶ������/�����̣߳�����ϵͳ����
		 ExecutorService executorService = Executors.newCachedThreadPool();
		 
//		 �����̳߳أ�FixedThreadPool()
//		 �ɿ����߳���󲢷�����ͬʱִ�е��߳�����
//		 �������̻߳��ڶ����еȴ�
		 ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
		 
		
//		 �����̳߳أ� ScheduledThreadPool()
//		 ֧�ֶ�ʱ������������ִ�С�
		 ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);
		 
		 
//		 ���̻߳����̳߳أ�SingleThreadExecutor()
//		 ���ҽ���һ�������߳�ִ������
//		 ����������ָ��˳��ִ�У�����ѭ���е���ӳ��ӹ���


		//����һ�������ù̶��߳������̳߳�
	        ExecutorService pool = Executors. newSingleThreadExecutor();
	        //����ʵ����Runnable�ӿڶ���
	        Thread tt1 = new MyThread();
	        Thread tt2 = new MyThread();
	        Thread tt3 = new MyThread();
	        Thread tt4 = new MyThread();
	        Thread tt5 = new MyThread();
	        //���̷߳�����в�ִ��
	        pool.execute(tt1);
	        pool.execute(tt2);
	        pool.execute(tt3);
	        pool.execute(tt4);
	        pool.execute(tt5);
	        //�ر�
	        pool.shutdown();
	    }
	 
	 
	 
	 
}
