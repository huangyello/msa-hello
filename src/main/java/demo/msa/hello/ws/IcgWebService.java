package demo.msa.hello.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace = "http://webservice.seenew.com")
public interface IcgWebService {

    @WebMethod
    String sayHello(@WebParam(name = "userName") String name);

}