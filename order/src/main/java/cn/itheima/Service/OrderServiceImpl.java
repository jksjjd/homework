package cn.itheima.Service;

import cn.itheima.Dao.OrderDao;
import cn.itheima.pojo.Good;
import cn.itheima.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order getId(Long id) {
        Order order=orderDao.selectById(id);
        String url="http://goodservice/good/" + order.getGoodId();
        Good goods = restTemplate.getForObject(url, Good.class);
        order.setGood(goods);
        return order;
    }
}
