package scheduler;

import org.springframework.scheduling.annotation.Scheduled;

public class MBeanTracerClient {

    IMBeanTracer beanTracer;

    @Scheduled(cron = "0 0 17 1/1 * ?")
    public void useMBean() {
        beanTracer.trace();
    }

    public void setBeanTracer(IMBeanTracer beanTracer) {
        this.beanTracer = beanTracer;
    }
}
