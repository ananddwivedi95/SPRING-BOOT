package com.anand.application;

import com.anand.application.Swiggy.CartItem;
import com.anand.application.Swiggy.OrderDetails;
import com.anand.application.SwiggyInterfaceDI.Car;
import com.anand.application.SwiggyInterfaceDI.Garrage;
import com.anand.application.SwiggySetterDI.Order;
import com.anand.application.SwiggySetterDI.OrderDelivery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiModule2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container=SpringApplication.run(SpringBootDiModule2Application.class, args);
		/*CartItem crt =(CartItem)container.getBean("cartItem");
		crt.setItemId("1");
		crt.setItemName("Apple");
		crt.setQuantity(9);

		OrderDetails ord =(OrderDetails)container.getBean("orderDetails");
		System.out.println(ord.getCartItem());

		OrderDetails ord1 =(OrderDetails)container.getBean("orderDetails");
		System.out.println(ord1.getCartItem2());

		CartItem crt1 =(CartItem)container.getBean("cartItem1");
		System.out.println(crt1);*/

		OrderDelivery orderDelivery= (OrderDelivery) container.getBean("OrderDelivery");
		System.out.println(orderDelivery.gertOrder());
		System.out.println(orderDelivery.gertOrder().getProduct());

		Garrage garrage =(Garrage) container.getBean("garrage");
		System.out.println(garrage);
		Car car= (Car) garrage.getVehicale();
		System.out.println(garrage.getVehicale());
		System.out.println(car);
		System.out.println(car.getClass());
	}

}
