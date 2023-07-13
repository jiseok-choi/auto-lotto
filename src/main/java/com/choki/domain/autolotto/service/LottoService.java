package com.choki.domain.autolotto.service;

import com.choki.domain.autolotto.dto.ExternalLottoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class LottoService {

    private final RestTemplate lottoLayerRestTemplate;

    public ExternalLottoResponse callExternalAPI() {

        return lottoLayerRestTemplate.getForObject(
                "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=861",
                ExternalLottoResponse.class
        );

    }

}
