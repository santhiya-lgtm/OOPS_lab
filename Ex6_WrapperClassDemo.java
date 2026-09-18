/*
 * =====================================================================
 * EXERCISE 6: DEMONSTRATE THE USE OF WRAPPER CLASSES AND AUTOBOXING
 * =====================================================================
 * OBJECTIVE: Demonstrate wrapper classes, autoboxing, unboxing and
 *            parsing String values.
 * CONCEPTS:  Wrapper Classes, Autoboxing, Unboxing, Parsing
 * =====================================================================
 */

// Demonstrates wrapper classes and autoboxing
public class Ex6_WrapperClassDemo {
    public static void main(String[] args) {

        // Primitive Data Types
        int primitiveInt = 100;
        float primitiveFloat = 25.75f;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Autoboxing: converting primitive values into wrapper objects
        Integer wrappedInt = primitiveInt;
        Float wrappedFloat = primitiveFloat;
        Character wrappedChar = primitiveChar;
        Boolean wrappedBoolean = primitiveBoolean;

        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Autoboxed Float: " + wrappedFloat);
        System.out.println("Autoboxed Character: " + wrappedChar);
        System.out.println("Autoboxed Boolean: " + wrappedBoolean);

        // Unboxing: converting wrapper objects back into primitive values
        int unboxedInt = wrappedInt;
        float unboxedFloat = wrappedFloat;
        char unboxedChar = wrappedChar;
        boolean unboxedBoolean = wrappedBoolean;

        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed float: " + unboxedFloat);
        System.out.println("Unboxed char: " + unboxedChar);
        System.out.println("Unboxed boolean: " + unboxedBoolean);

        // Parsing String values into wrapper types
        String intString = "300";
        Integer parsedInt = Integer.parseInt(intString);

        String floatString = "75.25";
        Float parsedFloat = Float.parseFloat(floatString);

        String charString = "C";
        Character parsedChar = charString.charAt(0);

        String booleanString = "true";
        Boolean parsedBoolean = Boolean.parseBoolean(booleanString);

        // Display parsed and autoboxed values
        System.out.println("Parsed and Autoboxed Integer: " + parsedInt);
        System.out.println("Parsed and Autoboxed Float: " + parsedFloat);
        System.out.println("Parsed and Autoboxed Character: " + parsedChar);
        System.out.println("Parsed and Autoboxed Boolean: " + parsedBoolean);
    }
}

/*
 * =====================================================================
 * OUTPUT:
 * =====================================================================
 *
 * Autoboxed Integer: 100
 * Autoboxed Float: 25.75
 * Autoboxed Character: A
 * Autoboxed Boolean: true
 * Unboxed int: 100
 * Unboxed float: 25.75
 * Unboxed char: A
 * Unboxed boolean: true
 * Parsed and Autoboxed Integer: 300
 * Parsed and Autoboxed Float: 75.25
 * Parsed and Autoboxed Character: C
 * Parsed and Autoboxed Boolean: true
 */
