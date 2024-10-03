package br.ufrn.imd.stockControl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ssl.JksSslBundleProperties.Store;
import org.springframework.stereotype.Service;

import br.ufrn.imd.stockControl.repository.StoreRepository;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> listarStores() {
        return storeRepository.findAll();
    }

    public Store salvarStore(Store store) {
        return storeRepository.save(store);
    }
    
    public void deletarStore(Integer id) {
        storeRepository.deleteById(id);
    }
}