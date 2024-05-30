package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.MerchantRepository;
import com.example.demo.model.Merchant;

@Service
public class MerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    public Merchant addMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    public List<Merchant> getAllMerchants() {
        return merchantRepository.findAll();
    }

    public Optional<Merchant> getMerchantById(Long id) {
        return merchantRepository.findById(id);
    }

    public void deleteMerchant(Long id) {
        merchantRepository.deleteById(id);
    }
}
