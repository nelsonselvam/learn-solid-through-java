package solid.lsp;

public class PosterMapDelivery extends BookDelivery {

	// we need the books to be delivered to certain locations
	// hence we override the delivery locations method
	@Override
	void getDeliveryLocations() {
		// this is fine as we can deliver to physical locations
	}

}
