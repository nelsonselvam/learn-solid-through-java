package solid.lsp.solution;

public class OnlineDelivery extends BookDelivery {

	void getSoftwareOptions() {
		
		/**
		 * AudioBookDelivery will be the child class of OnlineDelivery which is good
		 * news, as now it doesn’t have to deal with the getDeliveryLocations() method.
		 * Instead, it can override the getSoftwareOptions() method of its parent with
		 * its own implementation (for instance, by listing and embedding available
		 * audio players).
		 * 
		 * 
		 */
	}
}
