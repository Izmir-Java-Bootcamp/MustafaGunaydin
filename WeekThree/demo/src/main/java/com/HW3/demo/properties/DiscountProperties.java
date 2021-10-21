package com.HW3.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="discount")
public class DiscountProperties {

	private double percetange;

}
