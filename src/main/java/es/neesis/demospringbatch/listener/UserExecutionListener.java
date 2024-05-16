package es.neesis.demospringbatch.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserExecutionListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("Comenzando la ejecución del job con id {}", jobExecution.getJobId());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        log.info("Finalizando la ejecución del job con id {}", jobExecution.getJobId());
        log.info("Estado del job: {}", jobExecution.getStatus());
        log.info("Tiempo de ejecución: {} ms", jobExecution.getEndTime().getTime() - jobExecution.getStartTime().getTime());
    }
}
