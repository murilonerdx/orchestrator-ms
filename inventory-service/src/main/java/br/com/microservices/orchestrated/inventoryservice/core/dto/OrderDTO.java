package br.com.microservices.orchestrated.inventoryservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
	private String id;
	private List<OrderProductsDTO> products;
	private LocalDateTime createdAt;
	private String transactionId;
	private double totalAmount;
	private int totalItems;
}
