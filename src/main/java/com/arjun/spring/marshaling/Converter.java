package com.arjun.spring.marshaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Component;

@Component
public class Converter {

	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	public void setMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller = unmarshaller;
	}

	// converts object to xml
	public void doMarshaling(String fileName, Object graph) throws IOException {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(fileName);
			marshaller.marshal(graph, new StreamResult(fos));
		} finally {
			fos.close();
		}
	}

	// Converts XML to Java Object
	public Object doUnMarshaling(String fileName) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
			return unmarshaller.unmarshal(new StreamSource(fis));
		} finally {
			fis.close();
		}
	}

}
