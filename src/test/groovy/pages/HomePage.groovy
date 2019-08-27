package pages

import geb.Page
import modules.ShelfModule
import modules.SizeMenuModule

class HomePage extends Page{
    static at = { title == "React Shopping Cart" }

    static content = {
        sizeMenu { module SizeMenuModule }
        shirtMenu { module ShelfModule}
    }
}
