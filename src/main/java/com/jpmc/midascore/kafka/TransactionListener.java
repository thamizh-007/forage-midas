package com.jpmc.midascore.kafka;

import org.h2.mvstore.tx.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${general.kafka-topic}")
    public void listen(Transaction transaction) {
        // 🔴 breakpoint இங்க வை
        // இப்போ எந்த logic-ம் வேண்டாம்
    }
}