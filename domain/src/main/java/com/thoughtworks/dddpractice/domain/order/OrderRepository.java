package com.thoughtworks.dddpractice.domain.order;

import com.thoughtworks.dddpractice.framework.annotations.domain.DomainRepository;
import com.thoughtworks.dddpractice.framework.support.domain.GenericDomainRepository;

@DomainRepository
public interface OrderRepository extends GenericDomainRepository<Order> {
}
