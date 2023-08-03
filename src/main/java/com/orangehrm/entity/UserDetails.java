package com.orangehrm.entity;

import com.orangehrm.strategy.FirstNameStrategy;
import com.orangehrm.strategy.JobStrategy;
import lombok.Data;
import uk.co.jemos.podam.common.PodamStrategyValue;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class UserDetails {
    @PodamStrategyValue(FirstNameStrategy.class)
    private String name;
    @PodamStrategyValue(JobStrategy.class)
    private String job;
}
