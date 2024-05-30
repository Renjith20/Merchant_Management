package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.MerchantService;
import com.example.demo.model.Merchant;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @PostMapping
    public ResponseEntity<Merchant> addMerchant(@RequestBody Merchant merchant) {
        return ResponseEntity.ok(merchantService.addMerchant(merchant));
    }

    @GetMapping
    public ResponseEntity<List<Merchant>> getAllMerchants() {
        return ResponseEntity.ok(merchantService.getAllMerchants());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Merchant> getMerchantById(@PathVariable Long id) {
        return merchantService.getMerchantById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMerchant(@PathVariable Long id) {
        merchantService.deleteMerchant(id);
        return ResponseEntity.noContent().build();
    }
}

