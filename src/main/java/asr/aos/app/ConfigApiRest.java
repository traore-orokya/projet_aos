//package asr.aos.app;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
//
//@Configuration
//public class ConfigApiRest extends RepositoryRestConfigurerAdapter {
//
//	@Override
//	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration ) {
//		repositoryRestConfiguration.setReturnBodyOnCreate(true);
//		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
//		repositoryRestConfiguration.exposeIdsFor(KyadaCalendar1Application.class);
//		repositoryRestConfiguration.getCorsRegistry()
//		.addMapping("/**")
//		.allowedOrigins("*")
//		.allowedHeaders("*")
//		.allowedMethods("OPTIONS","HEAD","GET","PUT","POST", "DELETE", "PATCH");
//	}
//}