package pl.kukla.krzys.bluetrade.btstockorder.web

import lombok.RequiredArgsConstructor
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.kukla.krzys.bluetrade.btmodel.StockOrderList
import pl.kukla.krzys.bluetrade.btstockorder.service.StockOrderService
import pl.kukla.krzys.bluetrade.btstockorder.web.StockOrderController.Companion.STOCK_ORDER_URL

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping(STOCK_ORDER_URL)
@RequiredArgsConstructor
class StockOrderController(
    private val stockOrderService: StockOrderService
) {

    @GetMapping("/orders")
    fun getAllStockOrders(): StockOrderList {
        logger("Getting all stock Orders")
        return stockOrderService.getStockOrders();
    }


    companion object : KLogging() {
        const val STOCK_ORDER_URL = "/api/v1"
    }

}