package com.orangehrm.entity;

import com.orangehrm.strategy.FirstNameStrategy;
import lombok.Data;
import uk.co.jemos.podam.common.PodamStrategyValue;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class UserDetails {
    @PodamStrategyValue(FirstNameStrategy.class)
    private String name;
}
