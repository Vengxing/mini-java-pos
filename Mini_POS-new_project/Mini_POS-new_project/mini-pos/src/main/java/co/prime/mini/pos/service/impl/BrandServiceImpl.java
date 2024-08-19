package co.prime.mini.pos.service.impl;

import co.prime.mini.pos.entity.Brand;
import co.prime.mini.pos.repository.BrandRepository;
import co.prime.mini.pos.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}
