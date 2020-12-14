package demo.msa.hello.ws;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
* @author: wb-hxy
* @date: 2020/9/14
* @Description:
*/
@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    IcgWebService icgWebService;

    @Bean
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/soap/*");
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, icgWebService);
        endpoint.publish("/icgWebService");
        return endpoint;
    }
}