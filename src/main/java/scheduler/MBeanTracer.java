package scheduler;

public class MBeanTracer implements IMBeanTracer {

	public void trace() {
		System.out.println("this is MBean currenTimeMilis: " + System.currentTimeMillis());
	}
}
