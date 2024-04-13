package com.archy.repsur.service;

import com.archy.repsur.bean.ContactoBean;

public interface EmailService {
	public void enviarEmailContacto(ContactoBean contactoBean) throws Exception;

	public void enviarEmailRespuestaContacto(ContactoBean contactoBean) throws Exception;

}
