//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val store = ItemAndCategory()
//
    store.addPreferences("oxford")
    val preferredItem = "oxford"
    store.recommendations(preferredItem)


}


//Desing a recommendation system for an e-commerce platform that allows fast retrieval
//of recommendations for a given user. Each user has a set of preferred items, and you
//need to efficiently retrieve recommendations based on their preferences.


class ItemAndCategory{

    var shoes = mutableListOf("boot",  "oxford", "clark", "sandal", "clog")
    var jewelry= mutableListOf("watch", "earrings", "necklaces", "rings", "nose-rings")
    var clothes = mutableListOf("sweater", "trouser", "jots", "jacket", "hoodie")





var userPreferences = mutableListOf<String>()
fun addPreferences(item:String){
    userPreferences.add(item)
}
fun recommendations(item: String){
    if (item in shoes){
        println(shoes)
    }
    else if (item in jewelry){
        println(jewelry)
    }
    else if (item in clothes){
        println(clothes)
    }
    else{
        println("Item not found")
    }
}
}
