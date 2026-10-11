public class Cart implements HotelService {
    @Override
    public void performService() {
        System.out.println("Luggage cart service is ready.");
    }
    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage cart(s).");
    }
}