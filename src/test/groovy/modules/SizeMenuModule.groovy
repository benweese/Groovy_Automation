package modules

import geb.Module

class SizeMenuModule extends Module{
    static content = {
        sizeContainer { $(".filters") }
        sizes { sizeContainer.find(".filters-available-size") }
    }
}
