import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;
    private Queue<String> orders;

    public Market() {
        this.queue = new LinkedList<>();
        this.orders = new LinkedList<>();
    }

    // Методы интерфейса QueueBehaviour
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Методы интерфейса MarketBehaviour
    @Override
    public void acceptOrder(String order) {
        orders.add(order);
    }

    @Override
    public String deliverOrder() {
        return orders.poll();
    }

    @Override
    public int ordersCount() {
        return orders.size();
    }

    // Метод для обновления состояния магазина
    public void update() {
        // Здесь может быть логика обновления состояния магазина, например,
        // проверка наличия новых заказов или обслуживание очереди покупателей.
        System.out.println("Market state updated");
    }
}

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        // Имитация работы с очередью
        market.enqueue("Alice");
        market.enqueue("Bob");
        market.enqueue("Eve");

        System.out.println("Queue size: " + market.size());
        System.out.println("Next person in queue: " + market.dequeue());
        System.out.println("Is queue empty? " + market.isEmpty());

        // Имитация работы с заказами
        market.acceptOrder("Milk");
        market.acceptOrder("Bread");

        System.out.println("Orders count: " + market.ordersCount());
        System.out.println("Next order to deliver: " + market.deliverOrder());

        // Обновление состояния магазина
        market.update();
    }
}
