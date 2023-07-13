package com.choki.global.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.rmi.ServerException;

@Slf4j
public class CurrencylayerExchangeRateErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        String body = getBody(response);
        HttpStatus statusCode = (HttpStatus) response.getStatusCode();
        if (body.contains("false")) {
            return true;
        }
        return !statusCode.is2xxSuccessful();
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        String body = getBody(response);

        log.error("================");
        log.error("Response Headers: {}", response.getHeaders());
        log.error("Response Status : {}", response.getRawStatusCode());
        log.error("Response body: {}", body);
        log.error("================");

        throw new ServerException("로또 정보를 조회하는 도중 문제가 발생했습니다.");
    }

    private String getBody(final ClientHttpResponse response) throws IOException {
        return StreamUtils.copyToString(response.getBody(), StandardCharsets.UTF_8);
    }
}
