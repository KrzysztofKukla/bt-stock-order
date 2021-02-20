package pl.kukla.krzys.bluetrade.btstockorder.web

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.kukla.krzys.bluetrade.btstockorder.service.StockOrderService
import pl.kukla.krzys.bluetrade.btstockorder.web.StockOrderController.Companion.STOCK_ORDER_URL

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping(STOCK_ORDER_URL)
@RequiredArgsConstructor
class StockOrderController(
    val stockOrderService: StockOrderService
) {

    companion object {
        const val STOCK_ORDER_URL = "/api/v1"
    }

}