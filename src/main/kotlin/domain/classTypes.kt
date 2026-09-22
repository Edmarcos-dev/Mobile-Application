//here we define the value classes for the different entities in our application.
//this avoid providing a primitive type that still is valid but have the wrong meaning.
@JvmInline
value class UserId(val value: Long) {
    init {
        require(value > 0) {
            "UserId must be a positive number, but was $value"
        }
    }
}

@JvmInline
value class UserEmail(val value: String) {
    init {
        require(value.isNotBlank()) {
            "UserEmail cannot be blank"
        }
        require(value.contains("@")) {
            "UserEmail must contain `@` symbol, but was $value"
        }
    }
}

@JvmInline
value class ProductId(val value: Long) {
    init {
        require(value > 0) {
            "ProductId must be a positive number, but was $value"
        }
    }
}

@JvmInline
value class OrderId(val value: Long) {
    init {
        require(value > 0) {
            "OrderId must be a positive number, but was $value"
        }
    }
}

@JvmInline
value class CartId(val value: Long) {
    init {
        require(value > 0) {
            "CartId must be a positive number, but was $value"
        }
    }
}

@JvmInline
value class ManagerId(val value: Long) {
    init {
        require(value > 0) {
            "ManagerId must be a positive number, but was $value"
        }
    }
}

@JvmInline
value class ManagerEmail(val value: String) {
    init {
        require(value.isNotBlank()) {
            "ManagerEmail cannot be blank" 
        }

        require(value.contains("@")) {
            "ManagerEmail must contain `@` symbol, but was $value"
        }
    }
}