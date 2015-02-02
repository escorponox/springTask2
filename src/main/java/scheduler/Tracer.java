package scheduler;

import org.springframework.scheduling.annotation.Scheduled;

public class Tracer {

	@Scheduled(cron = "0 0 17 1/1 * ?")
	public void trace() {
		System.out.println("this is currenTimeMilis: " + System.currentTimeMillis());
	}
}
