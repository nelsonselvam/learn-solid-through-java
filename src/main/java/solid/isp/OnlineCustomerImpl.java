package solid.isp;

public class OnlineCustomerImpl implements RestaurantInterface {

	@Override
	public void acceptOnlineOrder() {
		// TODO Auto-generated method stub

	}

	/**
	 * Interface Pollution - Methods have to be implemented since the interface
	 * defined them.
	 * 
	 */
	@Override
	public void acceptTelephoneOrder() {
		// Not Applicable for Online Order

		throw new UnsupportedOperationException();

	}

	@Override
	public void acceptWalkInCustomerOrder() {
		// Not Applicable for Online Order

		throw new UnsupportedOperationException();

	}

	@Override
	public void payOnline() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payInPerson() {
		// Not Applicable for Online Order

		throw new UnsupportedOperationException();

	}

}
