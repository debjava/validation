package com.pde.nvt.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pde.nvt.aops.LogTime;
import com.pde.nvt.entity.ValidationModel;
import com.pde.nvt.service.Validations;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * The Class ValidationController.
 * 
 * @author Debadatta Mishra
 */
@Api(value = "Basic NVT Validations Info", description = "API for NVT validation", tags = { "PDE NVT Validation" })
@RestController

/** The Constant log. */
@Slf4j
public class ValidationController {

	/** The validations. */
	@Autowired
	@Qualifier("validations")
	private Validations validations;

	/**
	 * Gets the all validations.
	 *
	 * @return the all validations
	 */
	@ApiOperation(value = "Get all NVT validations", tags = { "PDE NVT Validation" })
	@LogTime
	@GetMapping(path = "/allvalidations", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ValidationModel> getAllValidations() {
		log.debug("performing basic NVT validation list");
		return validations.getAllValidation();
	}

}
