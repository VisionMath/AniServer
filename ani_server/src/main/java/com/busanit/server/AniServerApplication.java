package com.busanit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class AniServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(AniServerApplication.class, args);
    }

//    @Bean
//    public HttpMessageConverter<String> responseBodyConverter() {
//	return new StringHttpMessageConverter(Charset.forName("UTF-8"));
//    }
//
//    @Bean
//    public Filter characterEncodingFilter() {
//	CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//	characterEncodingFilter.setEncoding("UTF-8");
//	characterEncodingFilter.setForceEncoding(true);
//	return characterEncodingFilter;
//    }

}
