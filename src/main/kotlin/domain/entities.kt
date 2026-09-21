// Domain entities represent the core business objects in our application. They encapsulate the data and behavior of these objects and are typically used to model real-world concepts.
class User(
    val id: UserId,
    val name: String,
    val email: UserEmail,
    val password: String,
    val phoneNumber: String,
    val address: String,
)

class Product(
    val id: ProductId,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
)

class Order(
    val id: OrderId,
    val userId: UserId,
    val listItems: List<Product>,
    val quantity: Int,
    val totalPrice: Double,
)

class Cart(
    val id: CartId,
    val userId: UserId,
    val cartItems: List<Product>,
)

class Manager( 
    val id: ManagerId,
    val name: String,
    val email: ManagerEmail,
    val password: String,
)