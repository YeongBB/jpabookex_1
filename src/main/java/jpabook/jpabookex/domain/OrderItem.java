package jpabook.jpabookex.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

/*
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "item_id")
    private Long itemId;
*/

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item itemId;

    private int orderPrice;
    private int count;
}
