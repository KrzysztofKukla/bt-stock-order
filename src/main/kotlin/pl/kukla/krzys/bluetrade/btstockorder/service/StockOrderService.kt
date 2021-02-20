package pl.kukla.krzys.bluetrade.btstockorder.service

import pl.kukla.krzys.bluetrade.btmodel.StockOrderList

interface StockOrderService {

    fun getStockOrders(): StockOrderList
}
