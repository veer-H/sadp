public class A_1_que_4 {

    // Step 1: Create the base Pizza interface
    interface Pizza {
        String getDescription();  // Get pizza description (base pizza + toppings)
        double cost();            // Get the total cost of the pizza
    }

    // Basic pizza implementation
    static class PlainPizza implements Pizza {
        @Override
        public String getDescription() {
            return "Plain Pizza";  // Description of a plain pizza
        }

        @Override
        public double cost() {
            return 8.00;  // Base cost of plain pizza
        }
    }

    // Step 2: Create the base decorator class
    abstract static class ToppingDecorator implements Pizza {
        protected Pizza pizza;  // Pizza object being decorated

        // Constructor to initialize pizza
        public ToppingDecorator(Pizza pizza) {
            this.pizza = pizza;
        }

        // Inherit the getDescription and cost methods from the Pizza interface
        @Override
        public String getDescription() {
            return pizza.getDescription();  // Return the description of the pizza being decorated
        }

        @Override
        public double cost() {
            return pizza.cost();  // Return the cost of the pizza being decorated
        }
    }

    // Step 3: Create concrete decorators for each topping
    // Cheese topping decorator
    static class Cheese extends ToppingDecorator {
        public Cheese(Pizza pizza) {
            super(pizza);  // Decorate the pizza
        }

        @Override
        public String getDescription() {
            return pizza.getDescription() + ", Cheese";  // Add cheese to the pizza description
        }

        @Override
        public double cost() {
            return pizza.cost() + 1.50;  // Add cost of cheese topping
        }
    }

    // Olives topping decorator
    static class Olives extends ToppingDecorator {
        public Olives(Pizza pizza) {
            super(pizza);  // Decorate the pizza
        }

        @Override
        public String getDescription() {
            return pizza.getDescription() + ", Olives";  // Add olives to the pizza description
        }

        @Override
        public double cost() {
            return pizza.cost() + 2.00;  // Add cost of olives topping
        }
    }

    // Mushrooms topping decorator
    static class Mushrooms extends ToppingDecorator {
        public Mushrooms(Pizza pizza) {
            super(pizza);  // Decorate the pizza
        }

        @Override
        public String getDescription() {
            return pizza.getDescription() + ", Mushrooms";  // Add mushrooms to the pizza description
        }

        @Override
        public double cost() {
            return pizza.cost() + 2.50;  // Add cost of mushrooms topping
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Start with a plain pizza
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.cost());

        // Add cheese topping to the pizza
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.cost());

        // Add olives topping to the pizza
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.cost());

        // Add mushrooms topping to the pizza
        pizza = new Mushrooms(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.cost());
    }
}
