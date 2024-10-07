package ie.atu.week3.paymentservice.service;

import ie.atu.week3.paymentservice.model.Payment;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    private Map<String, Payment> paymentDatabase = new HashMap<>();

    // Method to process payment
    public void processPayment(Payment payment) {
        paymentDatabase.put(payment.getPaymentId(), payment); // Save payment in-memory for simplicity
    }

    // Method to get payment by ID
    public Payment getPaymentById(String paymentId) {
        return paymentDatabase.get(paymentId);
    }
}
