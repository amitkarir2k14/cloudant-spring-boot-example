package com.example.cloudant.app.entity;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDateSerializer extends JsonSerializer<Date> {
	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2)
			throws IOException, JsonProcessingException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = formatter.format(value);

		gen.writeString(formattedDate);

	}
}