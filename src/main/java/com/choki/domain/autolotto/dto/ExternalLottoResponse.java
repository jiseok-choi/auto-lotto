package com.choki.domain.autolotto.dto;

import lombok.Data;

@Data
public class ExternalLottoResponse {

    /**
     * 요청결과
     */
    private String returnValue; // success
    /**
     * 날짜
     */
    private String drwNoDate; // "2004-10-30"
    /**
     * 총상금액
     */
    private Long totSellamnt; // 56561977000
    /**
     * 1등 상금액
     */
    private Long firstWinamnt; // 3315315525
    /**
     * 1등 당첨 인원
     */
    private Integer firstPrzwnerCo; // 4
    /**
     * 요청결과
     */
    private Long firstAccumamnt; // 0
    /**
     * 로또번호 1
     */
    private Integer drwtNo1; // 1
    /**
     * 로또번호 2
     */
    private Integer drwtNo2; // 7
    /**
     * 로또번호 3
     */
    private Integer drwtNo3; // 11
    /**
     * 로또번호 4
     */
    private Integer drwtNo4; // 23
    /**
     * 로또번호 5
     */
    private Integer drwtNo5; // 37
    /**
     * 로또번호 6
     */
    private Integer drwtNo6; // 42
    /**
     * 로또 보너스 번호
     */
    private Integer bnusNo; // 6
    /**
     * 로또회차
     */
    private Integer drwNo; // 100
}
