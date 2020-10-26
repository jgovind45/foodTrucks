package com.ft.core.util;

import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GenericRestClient<T, V> {

    private  RestTemplate restTemplate = new RestTemplate();
    
    public ResponseEntity<V> getHttpEntity(String url, Object inputBean, Class<V> genericClass) {
        HttpHeaders jsonHeader = new HttpHeaders();
        jsonHeader.setContentType(MediaType.APPLICATION_JSON);
        jsonHeader.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Object> entity = new HttpEntity<>(inputBean, jsonHeader);
        ResponseEntity<V> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, genericClass);
        return exchange;
     }
}