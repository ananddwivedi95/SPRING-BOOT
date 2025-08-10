package com.anand.application;

import com.anand.application.entity.DbOperation;
import com.anand.application.entity.ProductDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.query.JSqlParserUtils;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootJpaModule5Application {

	public static void main(String[] args) {

		ApplicationContext container=SpringApplication.run(SpringBootJpaModule5Application.class, args);
		System.out.println("System start successfully");

		System.out.println("-------------------------DB Operation Performed-------------------");

		ProductDetails entity=container.getBean(ProductDetails.class);
		entity.setId(6);
		entity.setName("ipade");
		entity.setPrice("100000");


		DbOperation dboperation=container.getBean(DbOperation.class);
		dboperation.insertData(entity);

		dboperation.updateData(6);



		ArrayList<ProductDetails> DetailsList= new ArrayList<>();
		DetailsList.add(new ProductDetails(7,"earbuds","45144554555"));
		DetailsList.add(new ProductDetails(8,"macbook","48455555"));

		dboperation.insertAllDetails(DetailsList);

		dboperation.viewAllDetails();
		dboperation.viewById(8);
		dboperation.viewByProductName("ipade");
	}

}
