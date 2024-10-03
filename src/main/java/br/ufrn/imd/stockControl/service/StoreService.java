package br.ufrn.imd.stockControl.service;

import java.util.List;

import br.ufrn.imd.stockControl.model.StoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrn.imd.stockControl.repository.StoreRepository;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<StoreModel> listarStores() {
        return storeRepository.findAll();
    }

    public StoreModel salvarStore(StoreModel store) {
        return storeRepository.save(store);
    }
    
    public void deletarStore(Integer id) {
        storeRepository.deleteById(id);
    }
}