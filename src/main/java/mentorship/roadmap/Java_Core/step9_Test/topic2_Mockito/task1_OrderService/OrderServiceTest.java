package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;



public class OrderServiceTest {
    private InventoryService inventoryService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    @BeforeEach
    void setup() {
        inventoryService = mock(InventoryService.class);
        orderRepository = mock(OrderRepository.class);
        orderService = new OrderService(inventoryService, orderRepository);
    }

    @Test
    void processOrder_Success() {
        Order order = new Order("product1", 5, 10.0);
        when(inventoryService.isProductAvailable("product1", 5)).thenReturn(true);

        boolean result = orderService.processOrder(order);
        Assertions.assertTrue(result);

        verify(orderRepository, times(1)).saveOrder(order);
        verify(inventoryService, times(1)).isProductAvailable("product1", 5);

        verifyNoMoreInteractions(inventoryService, orderRepository);
    }

    @Test
    void processOrder_ProductNotAvailable() {
        Order order = new Order("product2", 3, 15.0);
        when(inventoryService.isProductAvailable("product2", 3)).thenReturn(false);

        boolean result = orderService.processOrder(order);
        Assertions.assertFalse(result);

        verify(orderRepository, never()).saveOrder(any());
        verify(inventoryService, times(1)).isProductAvailable("product2", 3);

        verifyNoMoreInteractions(inventoryService, orderRepository);
    }
}
