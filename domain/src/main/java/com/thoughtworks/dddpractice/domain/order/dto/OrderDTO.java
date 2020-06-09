package com.thoughtworks.dddpractice.domain.order.dto;

import com.thoughtworks.dddpractice.framework.annotations.domain.ValueObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderDTO {
  private String aggregateId;
  private String customerId;
  private List<OrderItemDTO> items;
  private BigDecimal freight;
  private double discount;
  private BigDecimal totalAmount;
}
