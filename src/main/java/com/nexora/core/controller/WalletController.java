package com.nexora.core.controller;
import com.nexora.core.model.Wallet;
import com.nexora.core.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController @RequestMapping("/api/wallets")
public class WalletController {
    @Autowired private WalletService walletService;
    @PostMapping("/{name}") public Wallet create(@PathVariable String name) { return walletService.createWallet(name); }
    @PutMapping("/{id}/deposit") public Wallet deposit(@PathVariable Long id, @RequestParam BigDecimal amount) { return walletService.deposit(id, amount); }
    @PutMapping("/{id}/withdraw") public Wallet withdraw(@PathVariable Long id, @RequestParam BigDecimal amount) { return walletService.withdraw(id, amount); }
}
