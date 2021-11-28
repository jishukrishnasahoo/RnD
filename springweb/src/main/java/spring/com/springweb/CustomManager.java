package spring.com.springweb;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customManager")
public class CustomManager
{
    @ReadOperation
    public String readCustmManager()
    {
        return "readCustmManager";
    }

    @WriteOperation
    public String writeCustmManager()
    {
        return "writeCustmManager";
    }

    @DeleteOperation
    public String DeleteCustmManager()
    {
        return "DeleteCustmManager";
    }
}