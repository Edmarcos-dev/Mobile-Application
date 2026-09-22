//set the actions that each entity can do in the database, this is the interface that will be implemented by the repository classes
interface UserRepository {
    suspend fun createUser(user: User): User
    suspend fun getUserById(id: UserId): User?
    suspend fun getUserByEmail(email: UserEmail): User?
    suspend fun updateUser(user: User): User
    suspend fun deleteUser(id: UserId): Boolean
}

interface ProductRepository {
    suspend fun createProduct(product: Product): Product
    suspend fun getProductById(id: ProductId): Product?
    suspend fun updateProduct(product: Product): Product?
    suspend fun deleteProduct(id: ProductId): Boolean
}

interface OrderRepository {
    suspend fun createOrder(order: Order): Order
    suspend fun getOrderById(id: OrderId): Order?
}

interface CartRepository {
    suspend fun createCart(cart: Cart): Cart
    suspend fun getCartById(id: CartId): Cart?
    suspend fun updateCart(cart: Cart): Cart?
    suspend fun deleteCart(id: CartId): Boolean
}

interface ManagerRepository {
    suspend fun createManager(manager: Manager): Manager
    suspend fun getManagerById(id: ManagerId): Manager?
    suspend fun getManagerByEmail(email: ManagerEmail): Manager?
    suspend fun updateManager(manager: Manager): Manager?
}