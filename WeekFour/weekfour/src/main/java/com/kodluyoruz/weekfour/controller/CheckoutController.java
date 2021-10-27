package com.kodluyoruz.weekfour.controller;
import com.kodluyoruz.weekfour.model.dto.CheckoutDto;
import com.kodluyoruz.weekfour.model.request.CreateUpdateCheckoutRequest;
import com.kodluyoruz.weekfour.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("checkouts")
@RequiredArgsConstructor
@Slf4j
public class CheckoutController {
    private final CheckoutService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CheckoutDto createCheckout(@RequestBody CreateUpdateCheckoutRequest request) {
        return service.createCheckout(request);
    }

    @GetMapping("{id}")
    public CheckoutDto getCheckout(@PathVariable int id) {
        return service.getCheckout(id);
    }

    @PutMapping("{id}")
    public CheckoutDto updateCheckout(@PathVariable int id, @RequestBody CreateUpdateCheckoutRequest request) {
        return service.updateCheckout(id, request);
    }

    @GetMapping
    public List<CheckoutDto> getCheckouts(@RequestParam(required = false) String name) {
        return service.getCheckouts(name);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCheckout(@PathVariable int id) {
        service.deleteCheckout(id);
    }

}
