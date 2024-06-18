public interface MarketBehaviour {
    void acceptOrder(String order);
    String deliverOrder();
    int ordersCount();
}
