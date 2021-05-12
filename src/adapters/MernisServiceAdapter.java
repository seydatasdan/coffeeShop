package adapters;

import mernisServiceReference.KPSPublicSoapProxy;
import starbucksDemo.abstracts.CustomerCheckService;
import starbucksDemo.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		return client.TCKimlikNoDogrula(customer.nationalityId, customer.firstName, customer.lastName, customer.dateBirth);
		}

}
