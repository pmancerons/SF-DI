package di.example.sfdi;

import di.example.sfdi.controllers.*;
import di.example.sfdi.examplebean.FakeDatasource;
import di.example.sfdi.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println("--------- I18");

		System.out.println(i18nController.sayGreetings());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("--------- Primary");

		System.out.println(myController.sayHello());

		FakeDatasource  fakeDatasource =(FakeDatasource) ctx.getBean(FakeDatasource.class);

		System.out.println(fakeDatasource.getUser());
		System.out.println(fakeDatasource.getPassword());
		System.out.println(fakeDatasource.getUrl());


		FakeJmsBroker fakeJmsBroker =(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
	}

}
