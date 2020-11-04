package com.pde.nvt.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.pde.nvt.entity.ValidationModel;
import com.pde.nvt.service.Validations;

/**
 * The Class ValidationsImpl.
 * @author Debadatta Mishra
 */
@Primary()
@Component("validations")
public class ValidationsImpl implements Validations {

	/**
	 * Gets the all validation.
	 *
	 * @return the all validation
	 */
	@Override
	public List<ValidationModel> getAllValidation() {
		ValidationModel model1 = new ValidationModel();
		model1.setId(1);
		model1.setName("NTP");

		ValidationModel model2 = new ValidationModel();
		model2.setId(2);
		model2.setName("DNS");

		ValidationModel model3 = new ValidationModel();
		model3.setId(3);
		model3.setName("Ping");

		return Arrays.asList(model1, model2, model3);
	}

}
