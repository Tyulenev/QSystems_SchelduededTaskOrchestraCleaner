package ru.QSystems.Tyulenev.Task1;


import com.qmatic.qp.api.cfm.Queue;
import com.qmatic.qp.exception.QException;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        String url = "http://localhost:8080/rest/entrypoint/branches/2/queues/";
        RestTemplate restTemplaate= new RestTemplate();

//        String msg = restTemplaate.getForObject(url, String.class);
//        System.out.println(msg);



        ResponseEntity<String> str = restTemplaate.exchange
                            (url,
                            HttpMethod.GET,
                            new HttpEntity(Test1.createHeaders("superadmin", "ulan")),
                                    String.class);

        System.out.println(str);
    }
}
