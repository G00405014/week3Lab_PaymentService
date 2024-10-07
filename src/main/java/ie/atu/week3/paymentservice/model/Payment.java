package ie.atu.week3.paymentservice.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {

    @NotNull(message = "Payment ID cannot be null")
    private String paymentId;

    @NotNull(message = "Amount cannot be null")
    private Double amount;

    @NotNull(message = "Order ID cannot be null")
    private String orderId;

    // Constructors, getters, and setters
}
