package com.yang.design.pattern.strategywithspring.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String code;
    private BigDecimal price;
    private String type;
}
