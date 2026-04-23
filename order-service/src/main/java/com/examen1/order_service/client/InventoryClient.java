package com.examen1.order_service.client;

import com.examen1.order_service.model.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface InventoryClient {

    @GetMapping("/api/v1/inventory/product/{productId}")
    Inventory findByProductId(@PathVariable("productId") Long productId);
}
