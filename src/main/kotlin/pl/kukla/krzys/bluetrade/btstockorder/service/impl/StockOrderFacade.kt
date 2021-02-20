package pl.kukla.krzys.bluetrade.btstockorder.service.impl

import lombok.RequiredArgsConstructor
import mu.KLogging
import org.springframework.stereotype.Service
import pl.kukla.krzys.bluetrade.btstockorder.service.StockOrderService

@Service
@RequiredArgsConstructor
class StockOrderFacade : StockOrderService {
    override fun getStockOrderList() {
        TODO("Not yet implemented")

    }

    companion object : KLogging()
}