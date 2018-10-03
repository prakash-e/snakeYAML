package org.sample;

import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class YAMLExample {
	public static void main(String[] args) {
		Yaml yaml = new Yaml(new Constructor(Person.class));
		InputStream stream = YAMLExample.class.getClassLoader().getResourceAsStream("application.yml");
		Person person = yaml.load(stream);
		System.out.println(person);
	}
}