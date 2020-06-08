package com.thoughtworks.dddpractice.infrastructure;

import com.thoughtworks.dddpractice.domain.goods.Goods;
import com.thoughtworks.dddpractice.domain.goods.dto.GoodsDTO;
import com.thoughtworks.dddpractice.domain.order.Order;
import com.thoughtworks.dddpractice.domain.order.OrderItem;
import com.thoughtworks.dddpractice.domain.order.dto.OrderDTO;
import com.thoughtworks.dddpractice.domain.order.dto.OrderItemDTO;
import com.thoughtworks.dddpractice.infrastructure.repository.jpa.goods.GoodsPO;
import com.thoughtworks.dddpractice.infrastructure.repository.jpa.order.OrderItemPO;
import com.thoughtworks.dddpractice.infrastructure.repository.jpa.order.OrderPO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(unmappedSourcePolicy = IGNORE, unmappedTargetPolicy = IGNORE)
public interface ObjectMapper {

  ObjectMapper MAPPER = Mappers.getMapper(ObjectMapper.class);

  GoodsDTO poToDTO(GoodsPO goods);

  GoodsPO domainToPO(Goods goods);


  OrderDTO poToDTO(OrderPO orderPO);

  OrderItemDTO poToDTO(OrderItemPO orderItemPO);

  OrderPO domainToPO(Order order);

  OrderItemPO domainToPO(OrderItem orderItem);

  List<OrderItemPO> domainToPO(List<OrderItem> orderItem);
}
