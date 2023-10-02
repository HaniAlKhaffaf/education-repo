const bag1 = document.getElementById("b1");
const bag2 = document.getElementById("b2");
const bag3 = document.getElementById("b3");
const bag4 = document.getElementById("b4");



 
const bags = [bag1, bag2, bag3, bag4];
prices = [500, 400,300,200]
names = ["Gucci","Chanel","Zara","Louis Vuitton"]
 

function showAll() {
bag1.style.display = "block"
    bag2.style.display = "block";
    bag3.style.display = "block";
    bag4.style.display = "block";

}

function showByBrand(brand) {
  if (brand=="") {
    return
  }
    bags.forEach((item, index) => {
        if (names[index] != brand){
            item.style.display = "none";
            return
        }
        item.style.display = "block"

    })
    }

function showPriceRange(price) {
    if (price==0) {
        return
    }
bags.forEach((item, index) => {
    if (prices[index] != price){

        item.style.display = "none";
        return
    }
    item.style.display = "block"
})
}