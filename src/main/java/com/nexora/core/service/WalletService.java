package com.nexora.core.service;
import com.nexora.core.model.Wallet;
import com.nexora.core.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class WalletService {
    @Autowired private WalletRepository walletRepository;
    public Wallet createWallet(String name) { return walletRepository.save(new Wallet(name, BigDecimal.ZERO)); }
    public Wallet deposit(Long id, BigDecimal amount) {
        Wallet w = walletRepository.findById(id).orElseThrow();
        w.setBalance(w.getBalance().add(amount));
        return walletRepository.save(w);
    }
    public Wallet withdraw(Long id, BigDecimal amount) {
        Wallet w = walletRepository.findById(id).orElseThrow();
        if (w.getBalance().compareTo(amount) < 0) throw new RuntimeException("Saldo insuficiente");
        w.setBalance(w.getBalance().subtract(amount));
        return walletRepository.save(w);
    }
}
