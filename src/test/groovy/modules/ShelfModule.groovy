package modules

import geb.Module

class ShelfModule extends Module{
    int num
    static content = {
        shelfContainer { $(".shelf-container") }
        shirts { shelfContainer.find(".shelf-item") }
        sku {shelfContainer.find(".shelf-item").getAttribute("data-sku")}
        shirtTitle {shelfContainer.find(".shelf-item").find("p.shelf-item__title")}
        dollarPrice {shelfContainer.find(".shelf-item").find(".shelf-item__price div.val b")}
        button {shelfContainer.find(".shelf-item .shelf-item__buy-btn")}
    }
}
