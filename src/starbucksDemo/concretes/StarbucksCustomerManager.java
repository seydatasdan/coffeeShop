package starbucksDemo.concretes;

import starbucksDemo.abstracts.BaseCustomerManager;
import starbucksDemo.abstracts.CustomerCheckService;
import starbucksDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) { // buraya throw Expection gelebilir
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Müþteri eklendi. " );
		}
		else {
			System.out.println("Mevcut deðil. ");
		}			
	}
}
