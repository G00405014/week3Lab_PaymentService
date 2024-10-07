package ie.atu.week3.paymentservice.controller;

import ie.atu.week3.paymentservice.model.Payment;
import ie.atu.week3.paymentservice.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@Valid @RequestBody Payment payment) {
        paymentService.processPayment(payment);
        return ResponseEntity.ok("Payment processed successfully");
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPayment(@PathVariable String paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        return ResponseEntity.ok(payment);
    }
}
