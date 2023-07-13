package com.choki.domain.autolotto.controller;

import com.choki.domain.autolotto.dto.ExternalLottoResponse;
import com.choki.domain.autolotto.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/external")
    public ExternalLottoResponse getExternalLottoInfo() {
        return lottoService.callExternalAPI();
    }
}
