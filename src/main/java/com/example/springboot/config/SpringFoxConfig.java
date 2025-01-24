//package com.example.springboot.config;
//
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
// 
//
//
//
//public class SpringFoxConfig {
//	private String title = "teste";
//	private String description;
//	private String termsOfServiceUrl;
//	private Contact contact;
//	private String license;
//	private String licenseUrl;
//	private String version;
//	private List<VendorExtension> vendorExtensions;
//	
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//    
//    
//    
//    public SpringFoxConfig(String title, String description, String termsOfServiceUrl, Contact contact, String license,
//			String licenseUrl, String version, List<VendorExtension> vendorExtensions) {
//		this.title = title;
//		this.description = description;
//		this.termsOfServiceUrl = termsOfServiceUrl;
//		this.contact = contact;
//		this.license = license;
//		this.licenseUrl = licenseUrl;
//		this.version = version;
//		this.vendorExtensions = vendorExtensions;
//	}
//
//
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController("/myproject", "/swagger-ui-custom.html");
//    }
//    
//    
//   
//
//    	  public String getTitle() {
//			return title;
//    	  }
//
//    	  public String getDescription() {
//    	    return description;
//    	  }
//
//    	  public String getTermsOfServiceUrl() {
//    	    return termsOfServiceUrl;
//    	  }
//
//    	  public Contact getContact() {
//    	    return contact;
//    	  }
//
//    	  public String getLicense() {
//    	    return license;
//    	  }
//
//    	  public String getLicenseUrl() {
//    	    return licenseUrl;
//    	  }
//
//    	  public String getVersion() {
//    	    return version;
//    	  }
//
//    	  public List<VendorExtension> getVendorExtensions() {
//    	    return vendorExtensions;
//    	  }
//   }
//
//
//
