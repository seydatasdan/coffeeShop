package starbucksDemo;

import java.util.Date;

import starbucksDemo.abstracts.BaseCustomerManager;
import starbucksDemo.abstracts.CustomerCheckService;
import starbucksDemo.entities.Customer;
import starbucksDemo.concretes.StarbucksCustomerManager;
import starbucksDemo.concretes.NeroCustomerManager;
import starbucksDemo.adapters.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer());
	}
	
	
}
