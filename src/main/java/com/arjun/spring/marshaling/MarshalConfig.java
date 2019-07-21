package com.arjun.spring.marshaling;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.oxm.castor.CastorMarshaller;

@Configuration
public class MarshalConfig {

	public Converter getHandler() {
		Converter handler = new Converter();
		handler.setMarshaller(getCastorMarshallaer());
		handler.setUnmarshaller(getCastorMarshallaer());
		return handler;
	}

	public CastorMarshaller getCastorMarshallaer() {
		CastorMarshaller castorMarshaller = new CastorMarshaller();
		Resource resource = new ClassPathResource("mapping.xml");
		castorMarshaller.setMappingLocation(resource);
		return castorMarshaller;
	}

}
