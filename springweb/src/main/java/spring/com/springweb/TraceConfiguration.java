package spring.com.springweb;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TraceConfiguration
{

    @Bean
    public HttpTraceRepository getHttpTraces()
    {
        return new InMemoryHttpTraceRepository();
    }

}