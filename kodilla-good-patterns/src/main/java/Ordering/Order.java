package Ordering;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private final OrderRequest request;
    private final int id;
    private final LocalDate date;

    public Order(final OrderRequest request, final int id, final LocalDate date) {
        this.request = request;
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId() == order.getId() &&
                Objects.equals(request, order.request) &&
                Objects.equals(getDate(), order.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, getId(), getDate());
    }

    @Override
    public String toString() {
        return "Order{" +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}