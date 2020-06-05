package com.thoughtworks.dddpractice.domain.goods.vo;

import com.thoughtworks.dddpractice.framework.annotations.domain.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@ValueObject
public class GoodsVO {
  private String aggregateId;
  private String code;
  private String name;
  private Double price;
}
