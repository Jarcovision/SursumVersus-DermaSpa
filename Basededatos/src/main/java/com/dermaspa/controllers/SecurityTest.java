//package com.dermaspa.controllers;
//
//public class SecurityTest {
//
//	
//	package com.generation.jlsg.myappjwtControllers;
//
//	import java.util.HashMap;
//	import java.util.Map;
//
//	import org.slf4j.LoggerFactory;
//	import org.springframework.http.ResponseEntity;
//	import org.springframework.security.core.context.SecurityContextHolder;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RestController;
//
//	import ch.qos.logback.classic.Logger;
//
//	@RestController
//	@RequestMapping("")
//
//	public class PruebaSeguridadController {
//		private static final Logger logger = (Logger)LoggerFactory.getLogger(PruebaSeguridadController.class);
//		
//		@GetMapping("/mensaje")
//		public ResponseEntity<?> getMensaje(){
//			var auth = SecurityContextHolder.getContext() .getAuthentication();
//			logger.info("Datos usuario {}", auth.getPrincipal());
//			logger.info("Permisos usuario", auth.getAuthorities());
//			logger.info("Estado usuario", auth.isAuthenticated());
//			Map<String,String> mensaje = new HashMap<>();
//			mensaje.put("contenido", "Hola mundo JWT");
//			return ResponseEntity.ok(mensaje);
//		}
//		
//		@GetMapping("/publico")
//		public ResponseEntity<?> getMensajePublic(){
//			var auth = SecurityContextHolder.getContext() .getAuthentication();
//			logger.info("Datos usuario {}", auth.getPrincipal());
//			logger.info("Permisos usuario", auth.getAuthorities());
//			logger.info("Estado usuario", auth.isAuthenticated());
//			Map<String,String> mensaje = new HashMap<>();
//			mensaje.put("contenido", "Hola querido publico JWT");
//			return ResponseEntity.ok(mensaje);
//		}
//		
//		@GetMapping("/admin")
//		public ResponseEntity<?> getAdmin(){
//			var auth = SecurityContextHolder.getContext() .getAuthentication();
//			logger.info("Datos usuario {}", auth.getPrincipal());
//			logger.info("Permisos usuario", auth.getAuthorities());
//			logger.info("Estado usuario", auth.isAuthenticated());
//			Map<String,String> mensaje = new HashMap<>();
//			mensaje.put("contenido", "Hola querido admin JWT");
//			return ResponseEntity.ok(mensaje);
//		}
//		
//	}
