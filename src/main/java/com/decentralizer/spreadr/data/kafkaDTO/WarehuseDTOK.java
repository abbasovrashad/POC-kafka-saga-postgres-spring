package com.decentralizer.spreadr.data.kafkaDTO;

import lombok.Value;

@Value
public class WarehuseDTOK {
    private OrderDTOK orderDTOK;
    private Boolean compensation;

    public WarehuseDTOK(final OrderDTOK orderDTOK, final Boolean compensation) {
        this.orderDTOK = orderDTOK;
        this.compensation = compensation;
    }
}