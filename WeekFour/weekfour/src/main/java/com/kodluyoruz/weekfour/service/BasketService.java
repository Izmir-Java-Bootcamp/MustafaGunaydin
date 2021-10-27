package com.kodluyoruz.weekfour.service;
import com.kodluyoruz.weekfour.model.dto.BasketDto;
import com.kodluyoruz.weekfour.model.entity.Basket;
import com.kodluyoruz.weekfour.model.request.CreateUpdateBasketRequest;
import com.kodluyoruz.weekfour.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.kodluyoruz.weekfour.model.mapper.BasketMapper.BASKET_MAPPER;

@Service
@RequiredArgsConstructor
public class BasketService {
    private final BasketRepository repository;

    public BasketDto createBasket(CreateUpdateBasketRequest request) {
        Basket basket = BASKET_MAPPER.createBasket(request);

        Basket savedBasket = repository.save(basket);
        return BASKET_MAPPER.toBasketDto(savedBasket);
    }


    public BasketDto getBasket(int id) {
        Basket basket = getBasketEntity(id);
        return BASKET_MAPPER.toBasketDto(basket);
    }

    private Basket getBasketEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public BasketDto updateBasket(int id, CreateUpdateBasketRequest request) {
        Basket basket = getBasketEntity(id);
        BASKET_MAPPER.updateBasket(basket, request);

        Basket updatedBasket = repository.save(basket);
        return BASKET_MAPPER.toBasketDto(updatedBasket);
    }

    public List<BasketDto> getBaskets(String name) {
        if (name != null) {
            return BASKET_MAPPER.toBasketDtoList(repository.findAllByNameContainsOrDescriptionContains(name));
        }

        return BASKET_MAPPER.toBasketDtoList(repository.findAll());
    }

    public void deleteBasket(int id) {
        repository.deleteById(id);
    }
}
