package co.prime.mini.pos.mapper;

import co.prime.mini.pos.dto.BrandDTO;
import co.prime.mini.pos.entity.Brand;

public class Mapper {

    public static Brand toBrand(BrandDTO brandDTO){
        Brand brand = new Brand();
        brand.setName(brandDTO.getName());
        return brand;
    }
    public static BrandDTO toBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }
}
