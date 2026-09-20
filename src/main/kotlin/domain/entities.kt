// Domain entities represent the core business objects in our application. They encapsulate the data and behavior of these objects and are typically used to model real-world concepts.
class User(
    val id: UserId,
    val name: String,
    val email: UserEmail,
    val password: String,
    val phoneNumber: String,
    val address: String,
)

//We can use value classes to wrap primitive types and provide type safety. For example, we can create a value class for UserId and UserEmail to ensure that they are always used correctly throughout the application.
@JvmInline
value class UserId(val value: String)
@JvmInline
value class UserEmail(val value: String)

class Product(
    val id: ProductId,
    val name: String,
    val description: String,
    val price: Double,
    val stock: Int,
)

@JvmInline
value class ProductId(val value: String)

class Order(
    val id: OrderId,
    val userId: UserId,
    val items: List<OrderItem>,
    val quantity: Int,
    val totalPrice: Double,
)

@JvmInline
value class OrderId(val value: String)
@JvmInline
value class OrderItem(
    val productId: ProductId,
    val name: String,
    val description: String,
    val quantity: Int,
    val priceProduct: Double,
)

class Cart(
    val id: CartId,
    val userId: UserId,
    val items: List<Product>,
)

@JvmInline
value class CartId(val value: String)

class Manager( 
    val id: ManagerId,
    val name: String,
    val email: ManagerEmail,
    val password: String,
)

@JvmInline
value class ManagerId(val value: String)
@JvmInline
value class ManagerEmail(val value: String)