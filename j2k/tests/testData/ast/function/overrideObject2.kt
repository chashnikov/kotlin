class Base

class X : Base() {
    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(o: Any?): Boolean {
        return super.equals(o)
    }

    override fun toString(): String {
        return super.toString()
    }

    throws(javaClass<CloneNotSupportedException>())
    protected fun clone(): Any {
        return super.clone()
    }
}