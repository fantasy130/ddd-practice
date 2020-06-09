package com.thoughtworks.dddpractice.domain.goods.dto;

import com.thoughtworks.dddpractice.framework.annotations.domain.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class GoodsDTO {
  private String aggregateId;
  private String code;
  private String name;
  private BigDecimal price;
}
