
package beans;


public class Limits__1 {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits__1) == false) {
            return false;
        }
        Limits__1 rhs = ((Limits__1) other);
        return true;
    }

}
