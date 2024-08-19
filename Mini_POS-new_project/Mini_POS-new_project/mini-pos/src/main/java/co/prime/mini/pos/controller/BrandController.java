package co.prime.mini.pos.controller;

import co.prime.mini.pos.base.BaseApi;
import co.prime.mini.pos.dto.BrandDTO;
import co.prime.mini.pos.entity.Brand;
import co.prime.mini.pos.mapper.Mapper;
import co.prime.mini.pos.service.BrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class BrandController {

    private final BrandService brandService;
    @PostMapping("/brands")
    public BaseApi<?> create(@Valid @RequestBody BrandDTO dto){
        Brand brand = Mapper.toBrand(dto);
        brand = brandService.create(brand);

        return BaseApi.builder()
                .status(true)
                .code(HttpStatus.OK.value())
                .message("brand has been saved")
                .timestamp(LocalDateTime.now())
                .data(brand)
                .build();
     }
}
