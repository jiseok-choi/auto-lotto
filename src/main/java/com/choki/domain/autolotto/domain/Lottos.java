package com.choki.domain.autolotto.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Lottos {

    private List<LottoNumber> numbers;
}
