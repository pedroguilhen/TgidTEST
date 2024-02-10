package com.test.testTgid.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.testTgid.model.EmpresaModel;

@Controller
public class EmpresaController {
	
	@RequestMapping("/empresa")
	@ResponseBody
	public List<EmpresaModel> lista(){
		EmpresaModel empresa = new EmpresaModel(123123123, "Tgid");
		
		return Arrays.asList(empresa, empresa, empresa);
		
	}

}
