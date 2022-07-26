public class VariablesInfo {
    public static void main(String[] args){
        String name = "John";
        System.out.println(name);

        /*
         * Where type is one of Java's types (such as int or String), 
         * and variable is the name of the variable (such as x or name). 
         */

        int myNum = 15;
        System.out.println(myNum);

        int MyNum;
        MyNum = 15;
        System.out.println(MyNum);

        myNum = 20;  // myNum is now 20

        /*
         * However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values 
         * (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
         */

        final int MyNumber = 25;

        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println("Hello " + name);

        int x = 5, y = 6, z = 50;
        

        /*
         * To combine both text and a variable, use the + character:
         * You can also use the + character to add a variable to another variable:
         */

        /*
         * The general rules for constructing names for variables (unique identifiers) are:

            -Names can contain letters, digits, underscores, and dollar signs
            -Names must begin with a letter
            -Names should start with a lowercase letter and it cannot contain whitespace
            -Names can also begin with $ and _ (but we will not use it in this tutorial)
            -Names are case sensitive ("myVar" and "myvar" are different variables)
            -Reserved words (like Java keywords, such as `int` or `boolean`) cannot be used as names
         */
    }
}
