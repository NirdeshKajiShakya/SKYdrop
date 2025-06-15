/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.controller;

import com.stripe.Stripe;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class StripeController {
     public void createStripePayment(double amountInRupees){
        try{
            Stripe.apiKey = "sk_test_51RYLJsRMgi1PJwGoTGpDyxsCgaVqKYWV51bkDVKGgxDgrQQwlsRNctFst2w0OHdbC5jWCviGtJoCs1usJWjT0VOv009H56U8CS";
            
            long amountInPaise = (long) (amountInRupees * 100);
            
            PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
                    .setAmount(amountInPaise)
                    .setCurrency("inr")
                    .build();
            PaymentIntent intent = PaymentIntent.create(params);
            
            javax.swing.JOptionPane.showMessageDialog(null,
                    "PaymentIntent created Successfully!\nID: " + intent.getId());
        }catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Payment creation failed:\n" +e.getMessage());
                    
        }
    }
    
}
