package com.archy.repsur.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.archy.repsur.bean.ContactoBean;
import com.archy.repsur.bean.MensajeBean;
import com.archy.repsur.bean.ProductoBean;
import com.archy.repsur.service.EmailService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/")
public class InicioController {
	public static Logger log = LogManager.getLogger(InicioController.class);
	
	@Autowired
	EmailService emailService;
	
	private List<ProductoBean> listProductoBean = new ArrayList<>();
	
	@GetMapping("")
	public String inicio() {
//		Cookie mycookie = new Cookie("inicio", "123456789");
//		response.addCookie(mycookie);
		log.info("Inicio Representaciones del Sur");
		return "index";
	}
	
	@GetMapping("nosotros")
	public String contacto(Model model) {
		log.info("Inicio Contacto");
//		model.addAttribute("contacto", new ContactoBean());
//		model.addAttribute("mensaje", new MensajeBean());
		log.info("Fin Contacto");
		return "nosotros";
	}
	
	@GetMapping("productos")
	public String historiaCampo(Model model) throws Exception{
		log.info("Inicio Productos");
		//1:ahumado
		//2:chorizo
		//3:feteado
		//4:hotdog
		//5:jamonada
		//6:jamon
		//7:papas
		//8:salchicha
//		List<ProductoBean> listAhumado = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("1"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listChorizo = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("2"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listFeteado = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("3"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listHotdog = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("4"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listJamonada = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("5"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listJamon = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("6"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listPapa = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("7"))
//				.collect(Collectors.toList());
//		List<ProductoBean> listSalchicha = listProductoBean.stream()
//				.filter(x -> x.getIdCategoria().equals("8"))
//				.collect(Collectors.toList());
//		1:ahumado
//		2:empacado
//		3:jamonada
//		4:papa
		List<ProductoBean> listAhumado = listProductoBean.stream()
				.filter(x -> x.getIdCategoria().equals("1"))
				.collect(Collectors.toList());
		List<ProductoBean> listEmpacado = listProductoBean.stream()
				.filter(x -> x.getIdCategoria().equals("2"))
				.collect(Collectors.toList());
		List<ProductoBean> listJamonada = listProductoBean.stream()
				.filter(x -> x.getIdCategoria().equals("3"))
				.collect(Collectors.toList());
		List<ProductoBean> listPapa = listProductoBean.stream()
				.filter(x -> x.getIdCategoria().equals("4"))
				.collect(Collectors.toList());
		
		List<ProductoBean> listaTodoJson = listProductoBean.stream()
				.collect(Collectors.toList());
		
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(listaTodoJson);
		
		model.addAttribute("listAhumado", listAhumado);
		model.addAttribute("listEmpacado", listEmpacado);
		model.addAttribute("listJamonada", listJamonada);
		model.addAttribute("listPapa", listPapa);
		model.addAttribute("listTodo", listaTodoJson);
		model.addAttribute("listaTodoJson", json);
//		model.addAttribute("listJamonada", listJamonada);
//		model.addAttribute("listJamon", listJamon);
//		model.addAttribute("listPapa", listPapa);
//		model.addAttribute("listSalchicha", listSalchicha);
		log.info("Fin Productos");
		return "productos";
	}
	
	@GetMapping("contactenos")
	public String clientes(Model model) {
		log.info("Inicio contactenos");
		model.addAttribute("contacto", new ContactoBean());
		model.addAttribute("mensaje", new MensajeBean());
		log.info("Fin contactenos");
		return "contactenos";
	}
	
	@PostMapping("/emailContacto")
	public String emailContacto(@ModelAttribute ContactoBean contacto, BindingResult result, Model model, RedirectAttributes rm) throws Exception {
		log.info("Inicio EmailContacto");
		
		MensajeBean mensaje = new MensajeBean();

		if(!contacto.getCorreo().isEmpty() && !contacto.getMensaje().isEmpty() && !contacto.getCelular().isEmpty()) {
			emailService.enviarEmailContacto(contacto);
			emailService.enviarEmailRespuestaContacto(contacto);
			model.addAttribute("contacto", contacto);
			model.addAttribute("mensaje", mensaje);
			log.info("Fin EmailContacto");
			return "redirect:/contactenos";
		}else {
			mensaje.setMensaje1("Por favor ingrese todos los campos");
			model.addAttribute("mensaje", mensaje);
			model.addAttribute("contacto", contacto);
			log.info("Fin error campos EmailContacto");
			return "contactenos";
		}
	}
	
	@GetMapping("cobertura")
	public String productos(Model model) {
		log.info("Inicio Productos");
//		model.addAttribute("contacto", new ContactoBean());
//		model.addAttribute("mensaje", new MensajeBean());
		log.info("Fin Productos");
		return "cobertura";
	}
	
	@PostConstruct
    public void init() {
        try {
        	InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data.csv");
        	Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        	CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
//        	ClassPathResource resource = new ClassPathResource("data.csv");
//            FileReader fileReader = new FileReader(resource.getFile());
//            CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(fileReader);
            for (CSVRecord csvRecord : csvParser) {
            	ProductoBean productoBean = new ProductoBean();
            	productoBean.setIdProducto(csvRecord.get("idProducto"));
            	productoBean.setIdCategoria(csvRecord.get("idCategoria"));
            	productoBean.setIdSubCategoria(csvRecord.get("idSubCategoria"));
            	productoBean.setNombre(csvRecord.get("nombre"));
            	productoBean.setDescripcion(csvRecord.get("descripcion"));
            	productoBean.setEstado(csvRecord.get("estado"));
            	productoBean.setPrecio(csvRecord.get("precio"));
            	productoBean.setPrecioAntes(csvRecord.get("precioAntes"));
            	productoBean.setNombreImagen(csvRecord.get("nombreImagen"));
            	productoBean.setPresentaciones(csvRecord.get("presentaciones"));
            	productoBean.setOferta(csvRecord.get("oferta"));
            	productoBean.setMarca(csvRecord.get("marca"));
            	listProductoBean.add(productoBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
