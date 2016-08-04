package unique.test

/*
 * If tenantId and customerId has different types we get ClassCastException when persisting.
 */
class Person {
    Long tenantId
    Integer customerId
    String firstName
    String lastName

    static constraints = {
        customerId(unique: 'tenantId')
    }
}
