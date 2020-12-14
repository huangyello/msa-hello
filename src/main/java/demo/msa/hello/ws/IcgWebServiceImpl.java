package demo.msa.hello.ws;

import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: wb-hxy768153
 * @date: 2020/9/14 8:20 下午
 */
@Component
public class IcgWebServiceImpl implements IcgWebService {

    @Override
    public String sayHello(String name) {
        return "hello";
    }
}
