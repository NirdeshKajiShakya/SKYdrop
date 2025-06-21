/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skydrop.controllers;

import com.stripe.Stripe;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import java.awt.Desktop;
import java.net.URI;



/**
 *
 * @author User
 */
public class StripeController {
     public void createStripePayment(double priceInRupees){
        try{
            Stripe.apiKey = "sk_test_51RYLJsRMgi1PJwGoTGpDyxsCgaVqKYWV51bkDVKGgxDgrQQwlsRNctFst2w0OHdbC5jWCviGtJoCs1usJWjT0VOv009H56U8CS";
            
            long amountInRupees = (long) (priceInRupees * 100);
            SessionCreateParams params = SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("https://example.com/success")  
                .setCancelUrl("https://example.com/cancel")
                .addLineItem(
                    SessionCreateParams.LineItem.builder()
                        .setQuantity(1L)
                        .setPriceData(
                            SessionCreateParams.LineItem.PriceData.builder()
                                .setCurrency("npr")
                                .setUnitAmount(amountInRupees)
                                .setProductData(
                                    SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                        .setName("SkyDrop Order")
                                        .build())
                                .build())
                        .build())
                .build();

            Session session = Session.create(params);

           
            Desktop.getDesktop().browse(new URI(session.getUrl()));

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Payment failed: " + e.getMessage());
        }
    }
}
                                    
            